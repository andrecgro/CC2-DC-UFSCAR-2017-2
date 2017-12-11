/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaogabriel
 */
public class TabelaDeSimbolos {
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos() {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
    }
    
    public void adicionarSimbolo(String nome, String valor) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,valor));
    }
    
    public boolean existeSimbolo(String nome) {
        //System.out.println("Analisando "+nome+" na tabela de símbolos");
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            //System.out.println("Analisando "+nome+" na tabela de símbolos");
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String getValor(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getValor();
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String ret = "";
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
