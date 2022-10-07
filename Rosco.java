package Juego;

import Contenido.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Javier De La Torre
 */
public class Rosco implements Serializable {

    private int num_letras;
    private int vuelta;
    public static AlmacenPalabras MiAlmacen;
    private HashMap<Character, Palabra> MiRosco = new HashMap<>();

    public Rosco(int numLetras) throws IOException {

        this.num_letras = numLetras;
        this.vuelta = 1;
        MiAlmacen = new AlmacenPalabras();

        //Creación del rosco como tal
        for (int i = 0; i < this.num_letras; i++) {
            int tam = this.MiAlmacen.getLetraDelConjunto(i).size();//numero de palabras de esa letra
            int aleatorio = (int) (Math.random() * tam + 0);//numero al azar de entre las existentes
            Palabra p = MiAlmacen.getPalabra(i, aleatorio);
            MiRosco.put((char) (i + 65), p);
        }
    }

    public int getVuelta() {
        return this.vuelta;
    }

    public void setVuelta(int n) {
        if (n == 1 || n == 2) {
            this.vuelta = n;
        }
    }

    //NUMERO DE RESPUESTAS ACERTADAS
    public int getPuntuacionRoscal() {
        int pr = 0;
        for (Palabra aux : MiRosco.values()) {
            if ((aux.getAcertada())) {
                pr += 1;
            }
        }
        return pr;
    }

    //COMPROBAR SI TIENE TODAS LAS RESPUESTAS ACERTADAS
    public boolean isTodoCorrecto() {
        boolean sol = true;
        for (Palabra aux : MiRosco.values()) {
            if (!(aux.getAcertada())) {
                sol = false;
            }
        }
        return sol;
    }

    public Palabra getPalabra(int posicion) {
        return MiRosco.get(posicion);
    }

    public Palabra PosicionActual() {
        if (this.vuelta == 1) {
            for (Palabra aux : MiRosco.values()) {
                if (!(aux.getAcertada()) && !(aux.getFallada()) && !(aux.getAplazada())) {
                    return aux;
                }
            }
        } else if (this.vuelta == 2) {
            for (Palabra aux : MiRosco.values()) {
                if (!(aux.getAcertada()) && !(aux.getFallada())) {
                    return aux;
                }
            }
        }
        return null;
    }

    public boolean isUltimo(Palabra p) {
        boolean sol = true;
        for (Palabra aux : MiRosco.values()) {
            sol = aux.equals(p);
        }
        return sol;
    }

    public boolean todoRespondido() {
        boolean all = true;
        for (Palabra aux : MiRosco.values()) {
            if ((!aux.getAcertada()) && !(aux.getFallada())) {
                all = false;
            }
        }
        return all;
    }

    public String mostrarRosco() {
        String ros = "Numero de letras del rosco: " + MiRosco.size();
        ros += "\n Ahora mismo vas por la vuelta: " + this.getVuelta();
        ros += "\n---------------------------------------------";
        for (Palabra pal : MiRosco.values()) {
            ros += pal.toString();
        }
        ros += "\n---------------------------------------------";
        return ros;
    }
}
