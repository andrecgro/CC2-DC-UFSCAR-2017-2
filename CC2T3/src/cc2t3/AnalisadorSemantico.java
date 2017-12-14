/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrecamargorocha
 */
public class AnalisadorSemantico extends CVLBaseVisitor{
    TabelaDeSimbolos tabela = new TabelaDeSimbolos();
    
    @Override
    public Object visitDocumento(CVLParser.DocumentoContext ctx) {
        List<String[]> keyValueList = new ArrayList<String[]>();
        
        
        
        for(CVLParser.CampoContext campoCtx : ctx.listaCampos){
            List <String[]> valores = (List) visitCampo(campoCtx);
            for(String[] valor : valores){
                keyValueList.add(valor);   
            }
        }
        if(ctx.parent == null){
            for(String[] valor :  keyValueList){
                if(!tabela.existeSimbolo(valor[0])){
                    tabela.adicionarSimbolo(valor[0], valor[1]);
                }
                else{
                    System.out.println("Identificador "+valor[0]+" já declarado no escopo.");
                    return "";
                }
            }
            return tabela;
        }
        else{
            return keyValueList;
        }
    }
    
    @Override
    public Object visitCampo(CVLParser.CampoContext ctx) {
        List<String[]> returnList = new ArrayList<String[]>();
        if(ctx.valor().documento() != null){// Multivalorado
            List<String[]> keyValueList = (List) visitValor(ctx.valor());
            for(String[] keyValue : keyValueList){
                String[] kv = new String[2];
                kv[0] = ctx.nomeCampo.getText()+"."+keyValue[0];
                kv[1] = keyValue[1];
                returnList.add(kv);
            }
            return returnList;
        }
        else{
            String[] keyValue = new String[2];
            keyValue[0] = ctx.nomeCampo.getText();
            keyValue[1] = ctx.valor().getText().substring(1,ctx.valor().getText().length()-1);// STRING().getText() without quotes
            returnList.add(keyValue);
            return returnList;
        }
    }


    @Override
    public Object visitValor(CVLParser.ValorContext ctx) {
        if(ctx.documento() == null){
            return ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1);// STRING().getText() without quotes
        }
        return visitDocumento(ctx.documento());   
    }

    
}
