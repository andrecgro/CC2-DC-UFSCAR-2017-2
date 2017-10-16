/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

/**
 *
 * @author andrecamargorocha
 */
public class SaidaParser {
    StringBuffer conteudo;
    boolean modificado;
    int tipo;

    public SaidaParser(int t) {
        conteudo = new StringBuffer();
        tipo = t;
        if(tipo == 0)
            modificado = false;
    }

    public void println(String texto) {
        if(tipo == 0){
            if(!modificado){
                modificado = true;
                conteudo.append(texto);
                conteudo.append("\n");
            }
        }else {
            conteudo.append(texto);
            conteudo.append("\n");
        }
    }
    
    public void close(){
        conteudo.append("Fim da compilacao\n");
    }
    
    public boolean isModificado() {
        return modificado;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
