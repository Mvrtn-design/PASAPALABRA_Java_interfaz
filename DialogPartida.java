/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Contenido.Palabra;
import Juego.Rosco;
import Pistas.Compra;
import Pistas.Letras;
import Pistas.SegundaDefinicion;
import Usuario.Jugador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class DialogPartida extends javax.swing.JDialog {

    int opJ, opC;//opcion de cada jugador(mostrar rosco, responder)
    private int precio;//precio por jugar,por pista
    private static int numLetras;
    public LocalDateTime fecha;
    public static Jugador jugador, contrincante;
    private boolean turnoJ;//si no es turnoJ, pues turnoC
    public String vencedor = "Hay empate";
    private boolean terminadoJ, terminadoC;
    boolean aux;

    //Cada jugador tiene su rosco
    public Rosco RoscoJ;
    public Rosco RoscoC;

    //Palabra Palabrita;
    String resCorrecta;

    /**
     * Creates new form DialogPartida
     */
    public DialogPartida(java.awt.Frame parent, boolean modal, Jugador J2, int numeroLetras) throws IOException {
        super(parent, modal);
        initComponents();

        this.contrincante = J2;
        this.jugador = Pasapalabra.pre;//es el jugador que ha iniciado sesion

        this.precio = 25;
        this.jugador.setPuntos(-this.precio);
        this.contrincante.setPuntos(-this.precio);

        this.numLetras = numeroLetras;

        fecha = LocalDateTime.now();

        this.nombreJ1.setText(jugador.getNombre());
        this.nombreJ2.setText(contrincante.getNombre());

        RoscoJ = new Rosco(numLetras);
        RoscoC = new Rosco(numLetras);

        this.MiLetraJ.setText(RoscoJ.PosicionActual().getInicial());
        this.MiLetraC.setText(RoscoC.PosicionActual().getInicial());

        turnoJ = true;//empieza siempre el que inicia sesión

        this.TextoAccion.setText("Turno de " + jugador.getNombre());
        this.TextoPregunta.setText("");
    }

    public void FinPartida() {
        String ganador = "\n\nEl ganador es: ";
        jugador.estadisticas.setPartidasJugadas(1);
        contrincante.estadisticas.setPartidasJugadas(1);
        if (RoscoJ.isTodoCorrecto()) {
            JOptionPane.showMessageDialog(null, "¡¡VAYA!! " + jugador.getNombre() + " HA ACERTADO TODAS LAS LETRAS, GANAS 100 PUNTOS");
            jugador.setPuntos(100);
            this.vencedor = jugador.getNombre();
            jugador.estadisticas.setPartidasGanadas(1);
            contrincante.estadisticas.setPartidasPerdidas(1);
        } else if (RoscoC.isTodoCorrecto()) {
            JOptionPane.showMessageDialog(null, "¡¡VAYA!! " + contrincante.getNombre() + " HA ACERTADO TODAS LAS LETRAS, GANAS 100 PUNTOS");
            contrincante.setPuntos(100);
            contrincante.estadisticas.setPartidasGanadas(1);
            this.vencedor = contrincante.getNombre();
            jugador.estadisticas.setPartidasPerdidas(1);
        } else {
            if (RoscoJ.getPuntuacionRoscal() > RoscoC.getPuntuacionRoscal()) {
                ganador += jugador.getNombre();
                this.vencedor = jugador.getNombre();
                jugador.setPuntos(10);
                jugador.estadisticas.setPartidasGanadas(1);
                contrincante.estadisticas.setPartidasPerdidas(1);
            } else if (RoscoJ.getPuntuacionRoscal() < RoscoC.getPuntuacionRoscal()) {
                ganador += contrincante.getNombre();
                this.vencedor = contrincante.getNombre();
                contrincante.setPuntos(10);
                contrincante.estadisticas.setPartidasGanadas(1);
                jugador.estadisticas.setPartidasPerdidas(1);
            } else {
                ganador += "Hay un empate de puntuaciones, 5 PUNTOS a cada uno";
                contrincante.setPuntos(5);
                jugador.setPuntos(5);
                jugador.estadisticas.setPartidasEmpatadas(1);
                contrincante.estadisticas.setPartidasEmpatadas(1);
            }
            JOptionPane.showMessageDialog(null, "PARTIDA FINALIZADA\nPuntos de " + jugador.getNombre() + ": " + RoscoJ.getPuntuacionRoscal()
                    + "\nPuntos de " + contrincante.getNombre() + ": " + RoscoC.getPuntuacionRoscal() + ganador);
        }
        try {
            this.AnadirAFichero();
        } catch (IOException ex) {
            Logger.getLogger(DialogPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }

    @Override
    public String toString() {
        String mensaje = "\n- - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - -\n";
        mensaje += "\nPARTIDA:     " + this.jugador.getNombre() +" " + RoscoJ.getPuntuacionRoscal() + " vs "+ RoscoC.getPuntuacionRoscal() + " " + this.contrincante.getNombre()
               +"\n\n   - Fecha:  "  + fecha + "\n    - Ganador:  "  + this.vencedor
               +"\n\n- ROSCO DE " + this.jugador.getNombre()      + ":\n" + RoscoJ.mostrarRosco() 
               +"\n\n- ROSCO DE " + this.contrincante.getNombre() + ":\n" + RoscoC.mostrarRosco();

        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomGroupUsuario = new javax.swing.ButtonGroup();
        buttonGroupContricante = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BResponder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Pista = new javax.swing.JButton();
        CompraAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        HacerAccionJ = new javax.swing.JButton();
        nombreJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MiLetraJ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextoRespuesta = new javax.swing.JTextField();
        TextoPregunta = new javax.swing.JLabel();
        TextoAccion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        HacerAccionC = new javax.swing.JButton();
        nombreJ2 = new javax.swing.JLabel();
        MiLetraC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BPasapalabra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BResponder.setBackground(new java.awt.Color(255, 255, 0));
        BResponder.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        BResponder.setForeground(new java.awt.Color(0, 0, 0));
        BResponder.setText("RESPONDER");
        BResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResponderActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 51, 102), new java.awt.Color(51, 51, 51)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AYUDAS");

        Pista.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Pista.setText("PISTA");
        Pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PistaActionPerformed(evt);
            }
        });

        CompraAyuda.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        CompraAyuda.setText("COMPRAR RESPUESTA");
        CompraAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Pista)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CompraAyuda))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(CompraAyuda)
                .addGap(18, 18, 18)
                .addComponent(Pista)
                .addGap(14, 14, 14))
        );

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JUEGO DEL PASAPALABRA");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bottomGroupUsuario.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jRadioButton1.setText("Mostrar Rosco Entero");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        bottomGroupUsuario.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jRadioButton2.setText("Responder Pregunta");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        HacerAccionJ.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        HacerAccionJ.setText("Realizar acción");
        HacerAccionJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HacerAccionJActionPerformed(evt);
            }
        });

        nombreJ1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        nombreJ1.setForeground(new java.awt.Color(0, 0, 51));
        nombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ1.setText("Nombre");

        jLabel2.setText("Letra:");

        MiLetraJ.setFont(new java.awt.Font("Perpetua Titling MT", 3, 48)); // NOI18N
        MiLetraJ.setText("Ñ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(MiLetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(HacerAccionJ)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(MiLetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HacerAccionJ, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel3.setText("RESPUESTA");

        TextoRespuesta.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        TextoPregunta.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        TextoPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoPregunta.setText("AQUÍ DEBE MOSTRAR LA PREGUNTA/ RESULTADO DE ESTA ETC");
        TextoPregunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextoAccion.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        TextoAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoAccion.setText("ACCIÓN");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroupContricante.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("Mostrar Rosco Entero");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroupContricante.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jRadioButton6.setText("Responder Pregunta");
        jRadioButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseClicked(evt);
            }
        });
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        HacerAccionC.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        HacerAccionC.setText("Realizar acción");
        HacerAccionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HacerAccionCActionPerformed(evt);
            }
        });

        nombreJ2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        nombreJ2.setForeground(new java.awt.Color(0, 0, 51));
        nombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ2.setText("Nombre");

        MiLetraC.setFont(new java.awt.Font("Perpetua Titling MT", 3, 48)); // NOI18N
        MiLetraC.setText("Ñ");

        jLabel7.setText("Letra:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(MiLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(HacerAccionC))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jRadioButton5)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(MiLetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addGap(26, 26, 26)
                .addComponent(HacerAccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        BPasapalabra.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        BPasapalabra.setForeground(new java.awt.Color(51, 153, 255));
        BPasapalabra.setText("PASAPALABRA");
        BPasapalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPasapalabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BResponder, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(TextoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(BPasapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextoAccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(TextoAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BPasapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BResponder)
                            .addComponent(TextoRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResponderActionPerformed

        String res = this.TextoRespuesta.getText();

        if (turnoJ) {//Respuesta del jugador 1
            if (!RoscoJ.todoRespondido()) {
                resCorrecta = RoscoJ.PosicionActual().getPalabra().toString();//establece la respuesta correcta
                if (res.equals(this.resCorrecta)) {//compprueba si lo que has puesto es igual a la respuesta correcta
                    JOptionPane.showMessageDialog(null, "Letra " + RoscoJ.PosicionActual().getInicial() + "....¡¡¡CORRECTA!!!");

                    //sigue siendo su turno, por haber acertado
                    turnoJ = true;
                    Palabra aux = RoscoJ.PosicionActual();
                    RoscoJ.PosicionActual().setAcertada(true);

                    this.TextoAccion.setText("Turno de " + jugador.getNombre());
                    //final de ronda
                    if (RoscoJ.isUltimo(aux)) {
                        //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                        if (RoscoJ.getVuelta() == 1 && !(RoscoJ.todoRespondido())) {
                            RoscoJ.setVuelta(2);
                        } else if (((RoscoJ.todoRespondido()) && !(RoscoC.todoRespondido())) && !(RoscoJ.isTodoCorrecto())) {
                            this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                            turnoJ = false;//cambio de turno
                        } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                            this.FinPartida();
                        }
                    }

                    //Actualizamos informacion a mostrar
                    this.MiLetraJ.setText(RoscoJ.PosicionActual().getInicial());

                    this.TextoPregunta.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Letra " + RoscoJ.PosicionActual().getInicial() + " erronea");
                    Palabra aux = RoscoJ.PosicionActual();
                    RoscoJ.PosicionActual().setFallada(true);
                    //cambio de turno
                    turnoJ = false;

                    //Actualizamos informacion a mostrar
                    this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                    this.TextoPregunta.setText("");
                    //final de ronda
                    if (RoscoJ.isUltimo(aux)) {
                        //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                        if (RoscoJ.getVuelta() == 1 && !(RoscoJ.todoRespondido())) {
                            RoscoJ.setVuelta(2);
                        } else if (((RoscoC.todoRespondido()) && !(RoscoJ.todoRespondido())) && !(RoscoC.isTodoCorrecto())) {
                            this.TextoAccion.setText("Turno de " + jugador.getNombre());
                            turnoJ = true;
                        } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                            this.FinPartida();
                        }
                    }
                    this.MiLetraJ.setText(RoscoJ.PosicionActual().getInicial());
                }
            } else {
                if (RoscoJ.isTodoCorrecto() || (RoscoJ.todoRespondido() && RoscoC.todoRespondido())) {
                    this.FinPartida();
                } else {
                    //EL JUGADOR 1 HA RESPONDIDO TODO PERO NO HA ACERTADO TODO ,ASI QUE EL CONTRINCATE TIENE EL TURNO
                    turnoJ = false;
                }
            }

        } else { //respuesta del Contrincante
            if (!RoscoC.todoRespondido()) {
                resCorrecta = RoscoC.PosicionActual().getPalabra().toString();//establece la respuesta correcta
                if (res.equals(this.resCorrecta)) {//compprueba si lo que has puesto es igual a la respuesta correcta
                    JOptionPane.showMessageDialog(null, "Letra " + RoscoC.PosicionActual().getInicial() + "....¡¡¡CORRECTA!!!");

                    //sigue siendo su turno, por haber acertado, no el de J
                    turnoJ = false;
                    Palabra aux = RoscoC.PosicionActual();

                    RoscoC.PosicionActual().setAcertada(true);
                    this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                    //final de ronda
                    if (RoscoC.isUltimo(aux)) {
                        //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                        if (RoscoC.getVuelta() == 1 && !(RoscoC.todoRespondido())) {
                            RoscoC.setVuelta(2);
                        } else if (((RoscoC.todoRespondido()) && !(RoscoJ.todoRespondido())) && !(RoscoC.isTodoCorrecto())) {
                            this.TextoAccion.setText("Turno de " + jugador.getNombre());
                            turnoJ = true;
                        } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                            this.FinPartida();
                        }
                    }

                    //Actualizamos informacion a mostrar
                    this.MiLetraC.setText(RoscoC.PosicionActual().getInicial());

                    this.TextoPregunta.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Letra " + RoscoC.PosicionActual().getInicial() + " erronea");
                    Palabra aux = RoscoC.PosicionActual();
                    RoscoC.PosicionActual().setFallada(true);
                    this.TextoAccion.setText("Turno de " + jugador.getNombre());
                    //cambio de turno
                    turnoJ = true;
                    //final de ronda
                    if (RoscoC.isUltimo(aux)) {
                        //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                        if (RoscoC.getVuelta() == 1 && !(RoscoC.todoRespondido())) {
                            RoscoC.setVuelta(2);
                        } else if (((RoscoJ.todoRespondido()) && !(RoscoC.todoRespondido())) && !(RoscoJ.isTodoCorrecto())) {
                            this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                            turnoJ = false;
                        } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                            this.FinPartida();
                        }
                    }

                    //Actualizamos informacion a mostrar
                    this.MiLetraC.setText(RoscoC.PosicionActual().getInicial());
                    this.TextoPregunta.setText("");
                }
            } else {
                if (RoscoC.isTodoCorrecto() || (RoscoJ.todoRespondido() && RoscoC.todoRespondido())) {
                    this.FinPartida();
                } else {
                    //EL CONTRINCANTE HA RESPONDIDO TODO PERO NO HA ACERTADO TODO ,ASI QUE EL JUGADOR 1 TIENE EL TURNO
                    turnoJ = true;
                }
            }
        }
        if (RoscoC.todoRespondido() && RoscoJ.todoRespondido()) {
            this.FinPartida();
        }
        Pista.setEnabled(true);
        CompraAyuda.setEnabled(true);
        TextoRespuesta.setText(null);
    }//GEN-LAST:event_BResponderActionPerformed

    private void PistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PistaActionPerformed
        if (turnoJ) {
            if (RoscoJ.PosicionActual().getDefinicion2().equals("_")) {
                Letras aleatoria = new Letras(RoscoJ.PosicionActual());
                JOptionPane.showMessageDialog(null, "Letras sueltas: " + aleatoria.mostrarInfo() + "\nCoste: " + aleatoria.getPrecio());
                jugador.setPuntos(-(aleatoria.getPrecio()));
            } else {
                SegundaDefinicion segg = new SegundaDefinicion();
                JOptionPane.showMessageDialog(null, "Segunda definición: " + segg.mostrarDefinicion(RoscoJ.PosicionActual()) + "\nCoste: " + segg.getPrecio());
                jugador.setPuntos(-(segg.getPrecio()));

            }
        } else {
            if (RoscoC.PosicionActual().getDefinicion2().equals("_")) {
                Letras aleatoria = new Letras(RoscoC.PosicionActual());
                JOptionPane.showMessageDialog(null, "Letras sueltas: " + aleatoria.mostrarInfo() + "\nCoste: " + aleatoria.getPrecio());
                jugador.setPuntos(-(aleatoria.getPrecio()));
            } else {
                SegundaDefinicion segg = new SegundaDefinicion();
                JOptionPane.showMessageDialog(null, "Segunda definición: " + segg.mostrarDefinicion(RoscoC.PosicionActual()) + "\nCoste: " + segg.getPrecio());
                jugador.setPuntos(-(segg.getPrecio()));
            }
        }
        CompraAyuda.setEnabled(false);
        Pista.setEnabled(false);
    }//GEN-LAST:event_PistaActionPerformed

    private void CompraAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraAyudaActionPerformed
        Compra pista = new Compra();

        if (turnoJ) {
            if (jugador.getPuntos() >= 20) {//tienes puntos suficientes para gastar
                JOptionPane.showMessageDialog(null, "La palabra es: " + RoscoJ.PosicionActual().getPalabraString() + "\n Has gastado 20 puntos");
                Palabra aux = RoscoJ.PosicionActual();
                RoscoJ.PosicionActual().setAcertada(true);

                //sigue siendo su turno, por haber acertado
                turnoJ = true;

                //Actualizamos informacion a mostrar
                this.TextoAccion.setText("Turno de " + jugador.getNombre());
                this.TextoPregunta.setText("");

                jugador.setPuntos(-20);

                //final de ronda
                if (RoscoJ.isUltimo(aux)) {
                    //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                    if (RoscoJ.getVuelta() == 1 && !(RoscoJ.todoRespondido())) {
                        RoscoJ.setVuelta(2);
                    } else if (((RoscoJ.todoRespondido()) && !(RoscoC.todoRespondido())) && !(RoscoJ.isTodoCorrecto())) {//Cambio de turno porque yo he terminado con fallos pero el contrincante no
                        this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                        turnoJ = false;
                    } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                        this.FinPartida();
                    }
                }
                this.MiLetraJ.setText(RoscoJ.PosicionActual().getInicial());
            } else {
                JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para comprar una palabra");
            }
        } else {
            if (contrincante.getPuntos() >= 20) {//tienes puntos suficientes para gastar
                JOptionPane.showMessageDialog(null, "La palabra es: " + RoscoC.PosicionActual().getPalabraString() + "\n Has gastado 20 puntos");
                Palabra aux = RoscoC.PosicionActual();
                RoscoC.PosicionActual().setAcertada(true);

                //Sigue jugando
                turnoJ = false;

                //Actualizamos
                this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                this.TextoPregunta.setText("");

                contrincante.setPuntos(-20);
                //final de ronda
                if (RoscoC.isUltimo(aux)) {
                    //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                    if (RoscoC.getVuelta() == 1 && !(RoscoC.todoRespondido())) {
                        RoscoC.setVuelta(2);
                    } else if (((RoscoC.todoRespondido()) && !(RoscoJ.todoRespondido())) && !(RoscoC.isTodoCorrecto())) {
                        this.TextoAccion.setText("Turno de " + jugador.getNombre());
                        turnoJ = true;
                    } else {//si no es la primera vuelta o se acerto todo, se acabó la partida
                        this.FinPartida();
                    }
                }
                this.MiLetraC.setText(RoscoC.PosicionActual().getInicial());
            } else {
                JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para comprar una palabra");
            }
        }
    }//GEN-LAST:event_CompraAyudaActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        opJ = 0;
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        opJ = 1;
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void HacerAccionJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HacerAccionJActionPerformed
        if (turnoJ) {
            if (opJ == 0) {
                JOptionPane.showMessageDialog(null, RoscoJ.mostrarRosco());
            } else if (opJ == 1) {
                this.TextoAccion.setText("Pregunta para " + jugador.getNombre());
                this.TextoPregunta.setText(RoscoJ.PosicionActual().getDefinicion1());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es tu turno");
        }
    }//GEN-LAST:event_HacerAccionJActionPerformed

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        opC = 0;
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton6MouseClicked
        opC = 1;
    }//GEN-LAST:event_jRadioButton6MouseClicked

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void HacerAccionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HacerAccionCActionPerformed
        if (turnoJ) {
            JOptionPane.showMessageDialog(null, "No es tu turno");
        } else {
            if (opC == 0) {
                JOptionPane.showMessageDialog(null, RoscoC.mostrarRosco());
            } else if (opC == 1) {
                this.TextoAccion.setText("Pregunta para " + contrincante.getNombre());
                this.TextoPregunta.setText(RoscoC.PosicionActual().getDefinicion1());
            }
        }
    }//GEN-LAST:event_HacerAccionCActionPerformed

    private void BPasapalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPasapalabraActionPerformed

        if (turnoJ) {
            if (RoscoJ.getVuelta() >= 2) {
                JOptionPane.showMessageDialog(null, "Es la segunda vuelta, NO PUEDES REALIZAR ESTA OPCIÓN");
            } else {// PRIMERA VUELTA
                JOptionPane.showMessageDialog(null, "Letra " + RoscoJ.PosicionActual().getInicial() + " aplazada");
                Palabra aux = RoscoJ.PosicionActual();
                RoscoJ.PosicionActual().setAplazada(true);// HAS PASADO PALABRA
                //final de ronda
                if (RoscoJ.isUltimo(aux)) {
                    //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                    if (RoscoJ.getVuelta() == 1 && !(RoscoJ.isTodoCorrecto())) {
                        RoscoJ.setVuelta(2);
                    }
                }
                this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                if (RoscoC.todoRespondido()) {
                    this.TextoAccion.setText("Turno de " + jugador.getNombre());
                    turnoJ = true;
                } else {
                    this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                    turnoJ = false;
                }

                this.MiLetraJ.setText(RoscoJ.PosicionActual().getInicial());

                this.TextoPregunta.setText("");
            }
        } else {
            if (RoscoC.getVuelta() >= 2) {
                JOptionPane.showMessageDialog(null, "Es la segunda vuelta, NO PUEDES REALIZAR ESTA OPCIÓN");
            } else {
                JOptionPane.showMessageDialog(null, "Letra " + RoscoC.PosicionActual().getInicial() + " aplazada");
                Palabra aux = RoscoC.PosicionActual();
                RoscoC.PosicionActual().setAplazada(true);
                //final de ronda
                if (RoscoC.isUltimo(aux)) {
                    //AÑADIR VUELTA SI ESTAMOS EN LA PRIMERA
                    if (RoscoC.getVuelta() == 1 || !(RoscoC.isTodoCorrecto())) {
                        RoscoC.setVuelta(2);
                    }
                }
                this.TextoAccion.setText("Turno de " + jugador.getNombre());
                if (RoscoJ.todoRespondido()) {
                    this.TextoAccion.setText("Turno de " + contrincante.getNombre());
                    turnoJ = false;
                } else {
                    this.TextoAccion.setText("Turno de " + jugador.getNombre());
                    turnoJ = true;
                }

                this.MiLetraC.setText(RoscoC.PosicionActual().getInicial());
                this.TextoPregunta.setText("");
            }
        }
        Pista.setEnabled(true);
        CompraAyuda.setEnabled(true);
    }//GEN-LAST:event_BPasapalabraActionPerformed
    public void AnadirAFichero() throws IOException {

        FileWriter add = new FileWriter("AlmacenPartidas.txt", true);
        BufferedWriter bw = new BufferedWriter(add);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(this.toString());
        pw.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPartida dialog = null;
                try {
                    dialog = new DialogPartida(new javax.swing.JFrame(), true, contrincante, numLetras);
                } catch (IOException ex) {
                    Logger.getLogger(DialogPartida.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPasapalabra;
    private javax.swing.JButton BResponder;
    private javax.swing.JButton CompraAyuda;
    private javax.swing.JButton HacerAccionC;
    private javax.swing.JButton HacerAccionJ;
    private javax.swing.JLabel MiLetraC;
    private javax.swing.JLabel MiLetraJ;
    private javax.swing.JButton Pista;
    private javax.swing.JLabel TextoAccion;
    private javax.swing.JLabel TextoPregunta;
    private javax.swing.JTextField TextoRespuesta;
    private javax.swing.ButtonGroup bottomGroupUsuario;
    private javax.swing.ButtonGroup buttonGroupContricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JLabel nombreJ1;
    private javax.swing.JLabel nombreJ2;
    // End of variables declaration//GEN-END:variables
}
