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
public class TipoIdentificadores {
    String identificador;
    String tipo;

    public TipoIdentificadores(String identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    
}
