/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import java.io.Serializable;

/**
 *
 * @author sergi
 */
public class Definicion implements Serializable{

    private String definicion;

    public Definicion(String d) {
        this.definicion = d;
    }

    public void setDefinicion(String d) {
        this.definicion = d;
    }

    public String getDefinicion() {
        return this.definicion;
    }

    @Override
    public String toString() {
        String def = "";
        def += this.getDefinicion();
        return def;
    }
}
