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
    private String escopo;
    
    public TabelaDeSimbolos(String escopo){
        tabelaDeSimbolos = new ArrayList<>();
        this.escopo = escopo;
    }
    
    
    public void adicionarSimbolo(String nome, String tipo) {
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    //para registro
    public void adicionarSimbolo(String nome, String tipo, TabelaDeSimbolos ts) {
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos(nome,tipo,ts));
    }
    
    public void adicionarSimbolo(String nome, String tipo, String escopo){
        for(EntradaTabelaDeSimbolos etds:tabelaDeSimbolos) {
            if(etds.getNome().equals(escopo)){
                etds.getTs().adicionarSimbolo(nome, tipo);
            }
        }
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    
    
    public String getTipo (String nome){
        for (EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if (etds.nome.equals(nome))
                return etds.tipo;
        }
        return null;
    }
    
    public String getTipo(String nomeVar, String escopo) {
        for(EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if(etds.getTs() != null && etds.getNome().equals(escopo)){
                return etds.getTs().getTipo(nomeVar);
            }
        }
        return null;
    }

    public boolean existeSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if (etds.nome.equals(nome))
                return true;
        }
        return false;
    }
    
    public boolean existeSimbolo(String nome, String escopo) {
        for(EntradaTabelaDeSimbolos etds:tabelaDeSimbolos) {
            if(etds.getTipo().equals("registro")){
                if(etds.getTs().escopo.equals(escopo) && etds.getTs().existeSimbolo(nome)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public ArrayList<String> getSimbolos(String escopo){
        ArrayList<String> nomes = new ArrayList<String>();
        for(EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            if(etds.getTs() != null && etds.getNome().equals(escopo)){
                return etds.getTs().getSimbolos();
            }
        }
        return null;
    }
    
    
    public ArrayList<String> getSimbolos(){
        ArrayList<String> nomes = new ArrayList<String>();
        for(EntradaTabelaDeSimbolos etds:tabelaDeSimbolos){
            nomes.add(etds.getNome());
        }
        return nomes;
    }
    
}
