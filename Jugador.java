/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Interfaz.DialogPartida;
import java.io.*;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Javier De La Torre
 */
public class Jugador implements Serializable {

    protected String nombre;
    protected String clave;
    protected int puntos;
    protected boolean administrador;

    private HashSet<DialogPartida> misPartidas;
    public Estadisticas estadisticas;

    //Constructores
    public Jugador(String nombre, String clave) {

        this.nombre = nombre;
        this.clave = clave;
        this.puntos = 100;//Puntos iniciales
        Estadisticas MisEstads = new Estadisticas(this.puntos);
        this.estadisticas = MisEstads;
        this.administrador = false;

        misPartidas = new HashSet<DialogPartida>();
    }
    public Jugador(String nombre, String clave,int puntos, boolean administrador, int partidasJugadas, int partidasGanadas, int partidasPerdidas, int partidasEmpatadas){
        this.nombre = nombre;
        this.clave = clave;
        this.puntos = puntos;
        this.administrador = administrador;
        Estadisticas MisEstads = new Estadisticas(partidasJugadas,partidasGanadas,partidasEmpatadas,partidasPerdidas,puntos);
        this.estadisticas = MisEstads;
    }

    public Jugador(String nombre) {
        this(nombre, "");
    }

    public void añadirPartida(DialogPartida p) {
        misPartidas.add(p);
    }

    public Jugador(Jugador j) {
        this(j.getNombre(), j.clave);
    }

    public int HashCode() {
        return Objects.hash(nombre);//2 jugadores son iguales si tienen el mismo nombre
    }

    public int compareTo(Object o) {
        Jugador aux = (Jugador) o;
        return this.nombre.compareToIgnoreCase(aux.getNombre());
        //2 jugadores son iguales si tienen el mismo nombre,no distingue entre mayusculas y minusculas
    }
    
    public void mostrarHistorial() {
        System.out.println("Las estadisticas de " + nombre + " son: ");
        System.out.println(this.estadisticas.lectura());
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public boolean esAdmin() {
        return this.administrador;
    }

    public void setEsAdmin(boolean opcion) {
        this.administrador = opcion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int x) {
        this.estadisticas.setPuntos(x);
        this.puntos = this.estadisticas.getPuntos();
    }

    public String info() {
        String msg = "-------------------------------------------------------\n";
        msg += "Nombre: " + this.getNombre() + "\n" + this.estadisticas.lectura();
        msg += "-------------------------------------------------------\n";
        return msg;
    }
}
