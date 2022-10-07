/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.io.Serializable;

/**
 *
 * @author Javier De La Torre
 */
public class Estadisticas implements Serializable {

    private int partidas_jugadas;
    private int partidas_ganadas;
    private int partidas_empatadas;
    private int partidas_perdidas;
    private int puntos;

    //Constructores
    public Estadisticas(int partidas_jugadas, int partidas_ganadas, int partidas_empatadas,
            int partidas_perdidas, int puntos) {
        this.partidas_jugadas = partidas_jugadas;
        this.partidas_ganadas = partidas_ganadas;
        this.partidas_empatadas = partidas_empatadas;
        this.partidas_perdidas = partidas_perdidas;
        this.puntos = puntos;
    }

    public Estadisticas(int puntos) {
        this(0, 0, 0, 0, puntos);
    }

    //Metodos
    public int getPartidasJugadas() {
        return partidas_jugadas;
    }

    public int getPartidasGanadas() {
        return partidas_ganadas;
    }

    public int getPartidasEmpatadas() {
        return partidas_empatadas;
    }

    public int getPartidasPerdidas() {
        return partidas_perdidas;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPartidasJugadas(int p) {
        partidas_jugadas += p;
    }

    public void setPartidasGanadas(int p) {
        partidas_ganadas += p;
    }

    public void setPartidasEmpatadas(int p) {
        partidas_empatadas += p;
    }

    public void setPartidasPerdidas(int p) {
        partidas_perdidas += p;
    }

    public void setPuntos(int p) {
        this.puntos += p;
    }

    public String lectura() {
        String est = "";
        est += "- Partidas jugadas:\t" + partidas_jugadas + "\n";
        est += "- Partidas ganadas:\t" + partidas_ganadas + "\n";
        est += "- Partidas empatadas:\t" + partidas_empatadas + "\n";
        est += "- Partidas perdidas:\t" + partidas_perdidas + "\n";
        est += "- PUNTOS:\t\t" + puntos + "\n";
        return est;
    }
}
