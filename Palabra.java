/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import java.io.Serializable;

/**
 *
 * @author Javier De La Torre
 */
public class Palabra implements Serializable {

    private char inicial;
    private StringBuilder palabra;
    private boolean acertada;
    private boolean fallada;
    private boolean aplazada;
    private Definicion enunciado1;
    private Definicion enunciado2;

    //Constructores
    public Palabra(char inicial, StringBuilder palabra, String definicion) {

        acertada = false;
        fallada = false;
        aplazada = false;
        this.inicial = Character.toUpperCase(inicial);
        this.palabra = palabra;
        this.enunciado1 = new Definicion(definicion);
        this.enunciado2 = new Definicion("_");
    }

    public Palabra(char inicial, String palabra, String definicion) {

        StringBuilder sb = new StringBuilder(palabra);
        acertada = false;
        fallada = false;
        aplazada = false;
        this.inicial = Character.toUpperCase(palabra.charAt(0));
        this.palabra = sb;
        this.enunciado1 = new Definicion(definicion);
        this.enunciado2 = new Definicion("_");
    }

    public Palabra(String palabra) {
        acertada = false;
        fallada = false;
        aplazada = false;
        this.inicial = Character.toUpperCase(palabra.charAt(0));//la mayuscula de la primera letra de la palabra pasada
        this.palabra = new StringBuilder(palabra);
        this.enunciado1 = new Definicion("_");
        this.enunciado2 = new Definicion("_");
    }

    public Palabra() {
        acertada = false;
        fallada = false;
        aplazada = false;
        this.inicial = Character.toUpperCase(palabra.charAt(0));//la mayuscula de la primera letra de la palabra pasada
        this.palabra = new StringBuilder();
        this.enunciado1 = new Definicion("_");
        this.enunciado2 = new Definicion("_");
    }

    public Palabra(String palabra, String definicion) {
        acertada = false;
        fallada = false;
        aplazada = false;
        this.inicial = Character.toUpperCase(palabra.charAt(0));//la mayuscula de la primera letra de la palabra pasada
        this.palabra = new StringBuilder(palabra);
        this.enunciado1 = new Definicion(definicion);
        this.enunciado2 = new Definicion("_");
    }

    //Metodos
    public String getInicial() {
        String ini = "";
        return ini += inicial;
    }

    public StringBuilder getPalabra() {
        return palabra;
    }

    public String getPalabraString() {
        return palabra.toString();
    }

    public void setAcertada(boolean opcion) {
        this.acertada = opcion;
    }

    public void setFallada(boolean opcion) {
        this.fallada = opcion;
    }

    public void setAplazada(boolean opcion) {
        this.aplazada = opcion;
    }

    public boolean getAcertada() {
        return acertada;
    }

    public boolean getFallada() {
        return fallada;
    }

    public boolean getAplazada() {
        return aplazada;
    }

    public void setPalabra(StringBuilder p) {
        this.palabra = p;
    }

    public void setPalabra(String p) {
        StringBuilder pp = new StringBuilder(p);
        this.setPalabra(pp);
    }

    public void setDefinicion1(String d) {
        this.enunciado1.setDefinicion(d);
    }

    public void setDefinicion2(String d) {
        this.enunciado2 = new Definicion(d);
    }

    public String getDefinicion1() {
        if (!(this.enunciado1.getDefinicion().equals("_"))) {
            return this.enunciado1.getDefinicion();
        } else {
            return "Sin definicion 1 asociada";
        }
    }

    public String getDefinicion2() {
        if (!(this.enunciado2.getDefinicion().equals("_"))) {
            return this.enunciado2.getDefinicion();
        } else {
            return "_";
        }
    }

    @Override
    public String toString() {
        String pal = "\nInicial: " + this.inicial;
        pal += "\nEstado: ";
        if (this.acertada) {
            pal += "ACERTADA";
            pal += "\t  Respuesta: " + this.getPalabra();

            if (this.getDefinicion1() != "_") {
                pal += "\nDefinición 1: " + this.enunciado1;
            }
            if (this.getDefinicion2() != "_") {
                pal += "\nDefinición 2: " + this.enunciado2;
            }

        } else if (this.fallada) {
            pal += "FALLADA";
        } else if (this.aplazada) {
            pal += "Aplazada";
        } else {
            pal += "Por contestar";
        }
        return pal;
    }
}
