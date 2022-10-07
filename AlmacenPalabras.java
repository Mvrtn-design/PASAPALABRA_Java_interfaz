package Contenido;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class AlmacenPalabras implements Serializable {

    private ArrayList[] almacenLetras;

    public ArrayList<Palabra> A = new ArrayList<>();
    public ArrayList<Palabra> B = new ArrayList<>();
    public ArrayList<Palabra> C = new ArrayList<>();
    public ArrayList<Palabra> D = new ArrayList<>();
    public ArrayList<Palabra> E = new ArrayList<>();
    public ArrayList<Palabra> F = new ArrayList<>();
    public ArrayList<Palabra> G = new ArrayList<>();
    public ArrayList<Palabra> H = new ArrayList<>();
    public ArrayList<Palabra> I = new ArrayList<>();
    public ArrayList<Palabra> J = new ArrayList<>();
    public ArrayList<Palabra> K = new ArrayList<>();
    public ArrayList<Palabra> L = new ArrayList<>();
    public ArrayList<Palabra> M = new ArrayList<>();
    public ArrayList<Palabra> N = new ArrayList<>();
    public ArrayList<Palabra> O = new ArrayList<>();
    public ArrayList<Palabra> P = new ArrayList<>();
    public ArrayList<Palabra> Q = new ArrayList<>();
    public ArrayList<Palabra> R = new ArrayList<>();
    public ArrayList<Palabra> S = new ArrayList<>();
    public ArrayList<Palabra> T = new ArrayList<>();
    public ArrayList<Palabra> U = new ArrayList<>();
    public ArrayList<Palabra> V = new ArrayList<>();
    public ArrayList<Palabra> W = new ArrayList<>();
    public ArrayList<Palabra> X = new ArrayList<>();
    public ArrayList<Palabra> Y = new ArrayList<>();
    public ArrayList<Palabra> Z = new ArrayList<>();

    public AlmacenPalabras() throws IOException {

        almacenLetras = new ArrayList[]{A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};

        //Una vez creado el array , lo llenamos de palabras que provienen del fichero
        this.cargarDesdeFichero();
    }

    //OBTENER UNA LETRA CONCRETA
    public ArrayList getLetraDelConjunto(int numero) {
        return almacenLetras[numero];
    }

    //OBTENER UNA PALABRA CONCRETA DE UNA LETRA CONCRETA
    public Palabra getPalabra(int PosicionLetra, int posicion) {
        return (Palabra) almacenLetras[PosicionLetra].get(posicion);
    }

    public void cargarDesdeFichero() throws IOException {

        char car = 0;
        int i = 1, op = 0;

        String pregunta[] = new String[]{"", ""};
        i++;
        try (FileReader MiFichero = new FileReader("RepertorioPalabrasAlmacen.txt")) {
            int leido = MiFichero.read();
            while (leido != (-1)) {//FIN DE FICHERO                 
                if (leido == (int) '\n') {//Cada vez que hay un salto de linea, procederá a crear la nueva palabra(importante que el fichero acabe en \n);
                    nuevaPreguntaYRespuesta(pregunta[0], pregunta[1]);
                    pregunta[0] = "";
                    pregunta[1] = "";
                    op = 0;

                } else if (leido == (int) '-') {
                    op = 1;
                } else {
                    car = (char) leido;
                    pregunta[op] += car;
                }
                leido = MiFichero.read();
            }

        } catch (IOException e) {
            System.err.println("No se pudo leer");
            e.printStackTrace();
        }
    }

    public void Eliminar(String respuesta, String definicion) {
        char ma = Character.toUpperCase(respuesta.charAt(0));
        int aux = (int) ma - 65;
        Palabra p = new Palabra(ma, respuesta, definicion);
        almacenLetras[aux].remove(p);
    }

    public void nuevaPreguntaYRespuesta(String respuesta, String definicion) {
        char ma = Character.toUpperCase(respuesta.charAt(0)); //Coger la mayuscula de la primera letra de la resuesta
        int aux = (int) ma - 65;//la pasa a codigo ascii , le resta para saber la posicion en el array
        Palabra p = new Palabra(ma, respuesta, definicion);
        almacenLetras[aux].add(p);
        if (!almacenLetras[aux].contains(p)) {
            System.out.println("No se pudo añadir");
        }
    }

    @Override
    public String toString() {
        String alm = "";
        int i = 0;
        for (ArrayList<Palabra> aa : almacenLetras) {
            alm += "\nLetra: " + (char) (i + 65);
            i++;
            for (Palabra aux : aa) {
                alm += aux.toString();
            }
        }
        return alm;
    }
}
