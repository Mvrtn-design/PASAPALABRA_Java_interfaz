package Pistas;

import Contenido.*;

/**
 *
 * @author Javier De La Torre
 */
public class SegundaDefinicion extends Pista {

    public SegundaDefinicion() {
        super();
        precio = 5;
    }

    public String mostrarDefinicion(Palabra p) {
        return (p.getDefinicion2());
    }

    public int getPrecio() {
        return this.precio;
    }
}
