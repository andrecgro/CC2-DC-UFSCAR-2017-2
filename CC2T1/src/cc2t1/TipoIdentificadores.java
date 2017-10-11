/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

import java.util.Objects;

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
    
    public TipoIdentificadores(){
        this.identificador = "";
        this.tipo = "";
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.identificador);
        hash = 11 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoIdentificadores other = (TipoIdentificadores) obj;
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
