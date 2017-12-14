/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

/**
 *
 * @author andrecamargorocha
 */
public class Gerador{
    
    Map matchedTokens = new HashMap();
    Map resultadoGerador = new HashMap();
    TemplateProcessor processor = new TemplateProcessor();
    TabelaDeSimbolos tabela = new TabelaDeSimbolos();
    
    public Gerador(TabelaDeSimbolos tabela) {
        this.tabela = tabela;
    }
    
    // Checking if program file has all tokens found
    public void fileHasKeys(File templateFile, File cvlFile, File outputFile) throws IOException{
        matchedTokens = processor.processTemplateFile(templateFile);
        
        for(Object matchedToken : matchedTokens.entrySet()){
            Map.Entry pair = (Map.Entry) matchedToken;
            String token = pair.getValue().toString();
            

            if(tabela.existeSimbolo(token.substring(1,token.length()-1))){
                resultadoGerador.put(pair.getValue(),tabela.getValor(token.substring(1,token.length()-1)));
            }
            else{
                try {
                    throw new Exception("Identificador "+(String) pair.getValue()+" encontrado em "+templateFile.getName()+" mas não encontrado no arquivo "+ cvlFile.getName());
                } catch (Exception e) {
                    Logger.getLogger(Gerador.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        processor.replaceTags(templateFile, outputFile, resultadoGerador);
    }
    
    
    
}
