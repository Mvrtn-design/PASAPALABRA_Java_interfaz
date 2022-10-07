package Pistas;

import Contenido.*;

/**
 *
 * @author Javier De La Torre
 */
public class Compra extends Ayudas {

    public Compra() {
        super();
        precio = 20;
    }

    public StringBuilder mostrarInfo(Palabra p) {
        p.setAcertada(true);
        return (p.getPalabra());
    }

    public int getPrecio() {
        return this.precio;
    }
}
