/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

/**
 *
 * @author pegurin
 */
public class EntradaTabelaDeSimbolos {
    public String nome;
    public String tipo;
    public TabelaDeSimbolos ts;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.ts = null;
    }
    
    //para registros
    public EntradaTabelaDeSimbolos(String nome, String tipo, TabelaDeSimbolos ts) {
        this.nome = nome;
        this.tipo = tipo;
        this.ts = ts;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public TabelaDeSimbolos getTs() {
        return ts;
    }
    
    @Override
    public String toString() {
        if(getTs() != null)
            return nome+"("+tipo+")"+ts.toString();
        return nome+"("+tipo+")";
    }
    
}
