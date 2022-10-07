package Usuario;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author sergi
 */
public class CompararPorPartidasGanadas implements Comparator, Serializable {

    public int compare(Object o1, Object o2) {
        Jugador j1 = (Jugador) o1;
        Jugador j2 = (Jugador) o2;
        return j2.estadisticas.getPartidasGanadas() - j1.estadisticas.getPartidasGanadas();
    }
}
