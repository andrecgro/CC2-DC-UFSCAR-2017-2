/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pegurin
 */
public class TabelaDeSimbolos {
    private List<EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    public TabelaDeSimbolos(){
        tabelaDeSimbolos = new ArrayList<>();
    }
    
    public int instalarNome(String nome, TipoVariavel tipo){
        if (jaFoiDeclarado(nome)){
            throw new RuntimeException("Erro semântico: Variável "+nome+" foi declarada duas vezes ");
        }
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.tipo = tipo;
        tabelaDeSimbolos.add(etds);
        return tabelaDeSimbolos.size()-1;
    }
    
    public TipoVariavel determinaTipo (String nome){
        for (EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if (etds.nome.equals(nome))
                return etds.tipo;
        }
        return null;
    }

    private boolean jaFoiDeclarado(String nome) {
        for (EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if (etds.nome.equals(nome))
                return true;
        }
        return false;
    }
}
