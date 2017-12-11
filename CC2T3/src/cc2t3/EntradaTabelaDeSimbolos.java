/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

/**
 *
 * @author joaogabriel
 */
public class EntradaTabelaDeSimbolos {
    private String nome, valor;
    
    public EntradaTabelaDeSimbolos(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "[nome: "+nome+" ; valor: "+valor+"]";
    }
}
