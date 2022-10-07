package Pistas;

import Contenido.*;

/**
 *
 * @author Javier De La Torre
 */
public class Letras extends Pista {

    private Palabra p;

    public Letras(Palabra externa) {
        super();
        this.p = externa;
        precio = 5;
    }

    public int getPrecio() {
        return this.precio;
    }

    public StringBuilder mostrarInfo() {
        StringBuilder palabra = new StringBuilder(p.getPalabra());

        Palabra ayuda = new Palabra(palabra.toString());
        int numeroLetras = ayuda.getPalabra().length();

        //Tenemos el 33% de la cantidad de letras que tiene la palabra
        int numeroLetrasAyuda = numeroLetras - (numeroLetras / 3);
        System.out.println(numeroLetras);

        //Bucle que te saca las letras aleatoriamente
        int contador = 0;

        while (contador <= numeroLetrasAyuda) {
            for (int i = 0; i < numeroLetras; i++) {
                int numeroAleatorio = (int) (Math.random() * 2);

                if (numeroAleatorio == 0 && (palabra.charAt(i) != ('_'))) {
                    palabra.setCharAt(i, '_');
                    contador++;
                }
                if (contador == numeroLetrasAyuda) {
                    ayuda.setPalabra(palabra);
                    return ayuda.getPalabra();
                }
            }
        }
        ayuda.setPalabra(palabra);
        return ayuda.getPalabra();
    }
}
