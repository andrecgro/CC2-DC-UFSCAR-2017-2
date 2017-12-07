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
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
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
