package Usuario;

import Usuario.CompararPorPartidasGanadas;
import Usuario.CompararPorPuntos;
import Usuario.Jugador;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Javier De La Torre
 */
public class AlmacenJugadores implements Serializable {

    static private ArrayList<Jugador> AlmacenJugadores;

    public AlmacenJugadores() {
        AlmacenJugadores = new ArrayList<Jugador>();
    }

    public void añadir(Jugador j) {
        AlmacenJugadores.add(j);
    }

    public void Eliminar(Jugador j) {
        AlmacenJugadores.remove(j);
    }

    public ArrayList<Jugador> getAlmacen() {
        return AlmacenJugadores;
    }

    public boolean existeJugador(Jugador j) {
        for (Jugador aux : AlmacenJugadores) {
            if (j.compareTo(aux) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean existeJugador(String nom) {
        for (Jugador aux : AlmacenJugadores) {
            if (nom.compareTo(aux.nombre) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean existeJugador(String nombre, String clave) {
        Jugador aux = new Jugador(nombre, clave);
        return existeJugador(aux);
    }

    public Jugador getJugador(Jugador j) {
        for (Jugador aux : AlmacenJugadores) {
            if (j.compareTo(aux) == 0) {
                return aux;
            }
        }
        return null;
    }

    public int getTamaño() {
        return AlmacenJugadores.size();
    }

    public void mostrarAlmacen() {
        System.out.println("------------------------------------");
        System.out.println("Numero de Jugadores guardado: " + AlmacenJugadores.size());
        System.out.println("La lista es: ");
        System.out.println(this.lectura());
        System.out.println("------------------------------------");
    }

    public String lectura() {
        String Alm = "";
        for (Jugador aux : AlmacenJugadores) {
            Alm += aux.toString();
        }
        return Alm;
    }

    public void OrdenarPorPuntos() {
        Collections.sort(AlmacenJugadores, new CompararPorPuntos());
    }

    public void OrdenarPorPartidasGanadas() {
        Collections.sort(AlmacenJugadores, new CompararPorPartidasGanadas());
    }

    public Jugador getPosJugador(int numero) {
        return AlmacenJugadores.get(numero);
    }

    public String mostrarClasificacion(boolean por_puntos) {//Si es true se ordena por puntos, sino , por Partidas Ganadas        
        String mensaje = "";
        int i=1;
        if (por_puntos) {
            OrdenarPorPuntos();
            for (Jugador j : AlmacenJugadores) {
                mensaje += "- "+i + "º: " + j.getNombre() + "  Puntos: " + j.estadisticas.getPuntos() + "\n";
                i++;
            }
        } else {
            OrdenarPorPartidasGanadas();
            for (Jugador j : AlmacenJugadores) {
                
                mensaje += "- "+i + "º: " +  j.getNombre() + "  Partidas Ganadas: " + j.estadisticas.getPartidasGanadas() + "\n";
                i++;
            }
        }
        return mensaje;
    }

    public static boolean guardarFicheroJugadores() {
        try {
            FileOutputStream f1 = new FileOutputStream("AlmacenJugadores.dat");
            ObjectOutputStream objout = new ObjectOutputStream(f1);
            String s;
            boolean b;
            int n = 0, i;

            for (i = 0; i < AlmacenJugadores.size(); i++) { //recorro el bucle de jugadores, que es un ArrayList <Jugador> jugadores = new ArrayList<>();
                objout.writeObject("\n");

                s = AlmacenJugadores.get(i).getNombre();
                objout.writeObject(s);
                s = AlmacenJugadores.get(i).getClave();
                objout.writeObject(s);
                n = AlmacenJugadores.get(i).getPuntos();
                objout.writeObject(n);
                b = AlmacenJugadores.get(i).esAdmin();
                objout.writeObject(b);
                n = AlmacenJugadores.get(i).estadisticas.getPartidasJugadas();
                objout.writeObject(n);
                n = AlmacenJugadores.get(i).estadisticas.getPartidasGanadas();
                objout.writeObject(n);
                n = AlmacenJugadores.get(i).estadisticas.getPartidasPerdidas();
                objout.writeObject(n);
                n = AlmacenJugadores.get(i).estadisticas.getPartidasEmpatadas();
                objout.writeObject(n);
            }
            return true;
        } catch (java.io.IOException ioex) {
            return false;
        }
    }

    public static boolean cargarFicheroJugadores() throws ClassNotFoundException {
        try {
            FileInputStream f = new FileInputStream("AlmacenJugadores.dat");
            BufferedInputStream b = new BufferedInputStream(f);
            ObjectInputStream objin = new ObjectInputStream(f);
            String nombre;
            String clave;
            int puntos;
            boolean administrador;
            int partidasJugadas;
            int partidasGanadas;
            int partidasPerdidas;
            int partidasEmpatadas;
            String comprobar;
            while ((comprobar = (String) objin.readObject()) != null) {
                nombre = (String) objin.readObject();
                clave = (String) objin.readObject();
                puntos = (int) objin.readObject();
                administrador = (boolean) objin.readObject();
                partidasJugadas = (int) objin.readObject();
                partidasGanadas = (int) objin.readObject();
                partidasPerdidas = (int) objin.readObject();
                partidasEmpatadas = (int) objin.readObject();
                Jugador jugador_nuevo = new Jugador(nombre, clave, puntos, administrador, partidasJugadas, partidasGanadas, partidasPerdidas, partidasEmpatadas);
                AlmacenJugadores.add(jugador_nuevo);
            }
            return true;
        } catch (java.io.IOException ioex) {
            return false;
        }

    }
}
