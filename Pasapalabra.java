/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Contenido.Palabra;

import Usuario.AlmacenJugadores;
import Usuario.Jugador;
import java.awt.Dimension;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author sergi
 */
public class Pasapalabra extends javax.swing.JFrame {

    static AlmacenJugadores MiAlmacenJugadores;
    static Jugador jugador;
    static Jugador contrincante;
    public static Jugador pre;
    int op = 2;
    public int numeroP;

    public Pasapalabra() {
        MiAlmacenJugadores = new AlmacenJugadores();

        this.setTitle("Bienvenido");
        this.setResizable(true);

        initComponents();
        //Botones
        jButton1.setEnabled(true);//Iniciar Sesion
        jButton2.setEnabled(true);//Registrarse                        
        jButton3.setEnabled(false);//Historial
        jButton4.setEnabled(false);//Partida
        jButton5.setEnabled(false);//Entrenamiento
        jButton6.setEnabled(false);//Añadir Palabra
        jButton7.setEnabled(false);//Borrar Palabra
        jButton8.setEnabled(false);//Mostrar Clasificacion
        jButton9.setEnabled(false);//Crear Usuario
        jButton10.setEnabled(false);//Establecer Contrincante
        jButton11.setEnabled(false);//Borrar Usuario
        jButton12.setEnabled(false);//Salir
        BmostrarPartidas.setEnabled(false);
        //RadioButton
        jRadioButton1.setEnabled(false);//Por Puntos
        jRadioButton2.setEnabled(false);//Por Partidas Ganadas

        //TextField
        jTextField1.setEnabled(false);//Numero Letras
        jTextField2.setEnabled(false);//Palabra
        jTextField3.setEnabled(false);//Definicion
        jTextField4.setEnabled(false);//Nombre
        jTextField5.setEnabled(false);//Clave
        this.setLocationRelativeTo(null);

        this.mensajeSalida.setText("Mítico juego de preguntas y respuesta. Entra y diviértete");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TituloDelJuego = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Clave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cargarJugadores = new javax.swing.JButton();
        guardarJugadores = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        mensajeSalida = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        BmostrarPartidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        TituloDelJuego.setFont(new java.awt.Font("Bauhaus 93", 1, 50)); // NOI18N
        TituloDelJuego.setForeground(new java.awt.Color(51, 153, 255));
        TituloDelJuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloDelJuego.setText("PASAPALABRA");
        TituloDelJuego.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 10, true));
        TituloDelJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CLASIFICACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N

        jButton8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton8.setText("Mostrar Clasificacion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jRadioButton1.setText("Por Puntos");
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

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jRadioButton2.setText("Por Partidas Ganadas");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton3.setText("Ver Historial");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton2)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "JUGAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 24), new java.awt.Color(0, 102, 204))); // NOI18N

        jButton10.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton10.setText("Establecer Contrincante");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("- SIN CONTRINCANTE -");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Numero de Letras");

        jTextField1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N

        jButton4.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jButton4.setText("Jugar Partida");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jButton5.setText("Jugar Entrenamiento");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(39, 39, 39))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EDICIÓN PALABRAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        jButton6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton6.setText("Añadir Palabra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton7.setText("Borrar Palabra");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Palabra :");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Definición :");

        jTextField2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "NUEVO JUGADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N

        jButton9.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton9.setText("Añadir Jugador");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton11.setText("Borrar Jugador");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setText("Nombre :");

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setText("Clave :");

        jTextField4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addGap(12, 12, 12))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "INICIO SESION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setText("Contraseña: ");

        Nombre.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("No tengo cuenta, Registrarse");
        jButton2.setAutoscrolls(true);
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(204, 0, 0));
        jButton13.setText("Borrar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(6, 6, 6))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton13)
                    .addComponent(jButton2)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FICHEROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        cargarJugadores.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        cargarJugadores.setText("Cargar Jugadores");
        cargarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarJugadoresActionPerformed(evt);
            }
        });

        guardarJugadores.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        guardarJugadores.setText("Guardar Jugadores");
        guardarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardarJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargarJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cargarJugadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarJugadores)
                .addContainerGap())
        );

        jButton12.setBackground(new java.awt.Color(255, 102, 102));
        jButton12.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 0, 0));
        jButton12.setText("Salir");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        mensajeSalida.setBackground(new java.awt.Color(0, 0, 51));
        mensajeSalida.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        mensajeSalida.setText(" ");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PARTIDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N

        BmostrarPartidas.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        BmostrarPartidas.setText("Mostrar Histórico de Partidas");
        BmostrarPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmostrarPartidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BmostrarPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BmostrarPartidas)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TituloDelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensajeSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloDelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mensajeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setBounds(0, 0, 950, 687);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // TODO add your handling code here:
        if (op == 1) {            
            JOptionPane.showMessageDialog(null, MiAlmacenJugadores.mostrarClasificacion(true));
        } else if (op == 0) {           
            JOptionPane.showMessageDialog(null, MiAlmacenJugadores.mostrarClasificacion(false));
        } else if (op == 2) {
            JOptionPane.showMessageDialog(null, "Selecciona una de las dos opciones porfavor");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        op = 1;
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        op = 0;
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JOptionPane.showMessageDialog(null, pre.info());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        PanelIniciarSesionContrincante inicio = new PanelIniciarSesionContrincante();

        if (JOptionPane.showConfirmDialog(this, inicio, "Introduzca datos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
            String nombre = inicio.getNombreContrincante();
            String clave = inicio.getClaveContrincante();

            Jugador nuevo = new Jugador(nombre);
            if (MiAlmacenJugadores.existeJugador(nombre)) {
                contrincante = MiAlmacenJugadores.getJugador(nuevo);
                this.jLabel1.setText(contrincante.getNombre());
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DialogPartida p;

        numeroP = getNumeroLetras();
        if ((numeroP >0 || numeroP < 25) && contrincante != null && contrincante != pre) {
            try {
                if (pre.getPuntos() >= 25 && contrincante.getPuntos() >= 25) {
                    p = new DialogPartida(this, true, contrincante, numeroP);
                    p.setVisible(true);

                } else if (pre.getPuntos() < 25) {
                    JOptionPane.showMessageDialog(null, "Lo siento, " + pre.getNombre() + ". No tienes suficientes puntos, entrena un poco mas");
                } else if (contrincante.getPuntos() < 25) {
                    JOptionPane.showMessageDialog(null, "Lo siento, " + contrincante.getNombre() + ". No tienes suficientes puntos, entrena un poco mas");
                }

            } catch (IOException ex) {
                Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (numeroP <=0 || numeroP > 26) {
            JOptionPane.showMessageDialog(null, "Tienes que introducir el numero de letras valido");
        } else if (contrincante == null) {
            JOptionPane.showMessageDialog(null, "No puedes jugar una partida tu solo, Introduce un contrincante");
        } else if (contrincante == pre) {
            JOptionPane.showMessageDialog(null, "No puedes jugar contra ti mismo");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        DialogEntrenamiento E;
        numeroP = getNumeroLetras();
        if (numeroP > 0) {
            try {
                E = new DialogEntrenamiento(this, true, numeroP);
                E.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (numeroP <= 0) {
            JOptionPane.showMessageDialog(null, "Tienes que introducir el numero de letras con el que quieres jugar");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            this.AnadirAFichero(getDefinicion(), getPalabra());
            JOptionPane.showMessageDialog(null, "Se ha añadido perfectamente");
            jTextField2.setText(null);
            jTextField3.setText(null);

        } catch (IOException ex) {
            Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Palabra p = new Palabra(getPalabra(), getDefinicion());
        try {
            this.borrarPalabraFichero(p);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la palabra perfectamente");
            jTextField2.setText(null);
            jTextField3.setText(null);
        } catch (IOException ex) {
            Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Jugador nuevo = new Jugador(getNombre(), getClave());
        if (MiAlmacenJugadores.existeJugador(getNombre())) {
            JOptionPane.showMessageDialog(null, "Este Usuario ya existe");
            jTextField4.setText(null);
            jTextField5.setText(null);
        } else {
            MiAlmacenJugadores.añadir(nuevo);
            JOptionPane.showMessageDialog(null, "Se ha añadido Usuario perfectamente");
            jTextField4.setText(null);
            jTextField5.setText(null);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Jugador nuevo = new Jugador(getNombre(), getClave());
        if (MiAlmacenJugadores.existeJugador(getNombre())) {
            Jugador nuevo2 = MiAlmacenJugadores.getJugador(nuevo);
            MiAlmacenJugadores.Eliminar(nuevo2);
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            jTextField4.setText(null);
            jTextField5.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe y no se puede borrar");
            jTextField4.setText(null);
            jTextField5.setText(null);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);

        //Botones
        jButton1.setEnabled(true);//Iniciar Sesion
        jButton13.setEnabled(true);//Borrar
        jButton2.setEnabled(true);//Registrarse                        
        jButton3.setEnabled(false);//Historial
        jButton4.setEnabled(false);//Partida
        jButton5.setEnabled(false);//Entrenamiento
        jButton6.setEnabled(false);//Añadir Palabra
        jButton7.setEnabled(false);//Borrar Palabra
        jButton8.setEnabled(false);//Mostrar Clasificacion
        jButton9.setEnabled(false);//Crear Usuario
        jButton10.setEnabled(false);//Establecer Contrincante
        jButton11.setEnabled(false);//Borrar Usuario
        jButton12.setEnabled(false);//Salir

        //RadioButton
        jRadioButton1.setEnabled(false);//Por Puntos
        jRadioButton2.setEnabled(false);//Por Partidas Ganadas
        BmostrarPartidas.setEnabled(false);
        //TextField
        jTextField1.setEnabled(false);//Numero Letras
        jTextField2.setEnabled(false);//Palabra
        jTextField3.setEnabled(false);//Definicion
        jTextField4.setEnabled(false);//Nombre
        jTextField5.setEnabled(false);//Clave
        Nombre.setEnabled(true);//NombreInicioSesion
        Clave.setEnabled(true);//ClaveInicioSesion 
        Nombre.setEnabled(true);//NombreInicioSesion
        Clave.setEnabled(true);//ClaveInicioSesion

        this.mensajeSalida.setText("Mítico juego de preguntas y respuesta. Entra y diviértete");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PanelRegistro registro = new PanelRegistro();
        String msg = "";

        if (JOptionPane.showConfirmDialog(this, registro, "Introduzca datos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
            String nombre = registro.getNombre();
            String clave1 = registro.getClave();
            String clave2 = registro.getClave2();

            if (!(clave1.equals(clave2))) {
                JOptionPane.showMessageDialog(null, "¡LAS CONTRASEÑA NO COINCIDEN!");

            } else {
                jugador = new Jugador(nombre, clave1);
                if (MiAlmacenJugadores.getTamaño() == 0) {
                    jugador.estadisticas.setPuntos(999999900);
                    jugador.setEsAdmin(true);//solo el primero en meterse sera el admin
                    msg += "¡Eres el Administrador!\n";
                }
                MiAlmacenJugadores.añadir(jugador);
                JOptionPane.showMessageDialog(null, msg + "¡Ya estas registrado! Ahora puedes iniciar sesion.");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = this.getNombreSesion();
        String clave = this.getClaveSesion();

        Jugador nuevo = new Jugador(nombre);

        if (MiAlmacenJugadores.existeJugador(nombre)) {
            pre = MiAlmacenJugadores.getJugador(nuevo);
            if (pre.getClave().compareTo(clave) == 0) {
                //Botones
                jButton1.setEnabled(false);//Iniciar Sesion
                jButton13.setEnabled(false);//Borrar
                jButton2.setEnabled(false);//Registrarse
                jButton3.setEnabled(true);//Historial
                jButton4.setEnabled(true);//Partida
                jButton10.setEnabled(true);//Establecer Contrincante
                jButton5.setEnabled(true);//Entrenamiento                 
                jButton12.setEnabled(true);//Salir

                //TextField
                jTextField1.setEnabled(true);//Numero Letras
                Nombre.setEnabled(false);//NombreInicioSesion
                Clave.setEnabled(false);//ClaveInicioSesion

                if (pre.esAdmin()) {
                    //Botones
                    jButton6.setEnabled(true);//Añadir Palabra
                    jButton7.setEnabled(true);//Borrar Palabra
                    jButton8.setEnabled(true);//Mostrar Clasificacion
                    jButton9.setEnabled(true);//Crear Usuario
                    jButton11.setEnabled(true);//Borrar Usuario
                    BmostrarPartidas.setEnabled(true);
                    //RadioButton
                    jRadioButton1.setEnabled(true);//Por Puntos
                    jRadioButton2.setEnabled(true);//Por Partidas Ganadas

                    //TextField
                    jTextField2.setEnabled(true);//Palabra
                    jTextField3.setEnabled(true);//Definicion
                    jTextField4.setEnabled(true);//Nombre
                    jTextField5.setEnabled(true);//Clave

                } else {//setEnable botones para funciones de usuario normal

                    //Botones
                    jButton6.setEnabled(false);//Añadir Palabra
                    jButton7.setEnabled(false);//Borrar Palabra
                    jButton8.setEnabled(false);//Mostrar Clasificacion
                    jButton9.setEnabled(false);//Crear Usuario
                    jButton11.setEnabled(false);//Borrar Usuario
                    BmostrarPartidas.setEnabled(false);
                    //RadioButton
                    jRadioButton1.setEnabled(false);//Por Puntos
                    jRadioButton2.setEnabled(false);//Por Partidas Ganadas

                    //TextField
                    jTextField2.setEnabled(false);//Palabra
                    jTextField3.setEnabled(false);//Definicion
                    jTextField4.setEnabled(false);//Nombre
                    jTextField5.setEnabled(false);//Clave
                }
                this.mensajeSalida.setText("Bienvenido ," + pre.getNombre());
                this.Nombre.setText(null);
                this.Clave.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña erronea");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario No Existente");

        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.Nombre.setText("");
        this.Clave.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void guardarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarJugadoresActionPerformed

        if (MiAlmacenJugadores.guardarFicheroJugadores()) {
            this.mensajeSalida.setText("Fichero de Jugadores guardado correctamente");
        } else {
            this.mensajeSalida.setText("Error al guardar el fichero de Jugadores");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_guardarJugadoresActionPerformed

    private void cargarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarJugadoresActionPerformed
        try {
            boolean cargarFicheroJugadores = MiAlmacenJugadores.cargarFicheroJugadores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.mensajeSalida.setText("Fichero de Jugadores cargado correctamente");

    }//GEN-LAST:event_cargarJugadoresActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void BmostrarPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmostrarPartidasActionPerformed
        try {
            JTextArea textArea = new JTextArea(mostrarHistoricoPartidas());
            JScrollPane scrollPane = new JScrollPane(textArea);            
            scrollPane.setPreferredSize(new Dimension(800, 400));
            JOptionPane.showMessageDialog(null, scrollPane, "INFORMACION PARTIDAS",JOptionPane.DEFAULT_OPTION);
        } catch (IOException ex) {
            Logger.getLogger(Pasapalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BmostrarPartidasActionPerformed

    /**
     * @param args the command line arguments
     */
    public int getNumeroLetras() {
        String s = jTextField1.getText();
        int numero = Integer.parseInt(s);
        return numero;
    }

    public String getPalabra() {
        return jTextField2.getText();
    }

    public String getDefinicion() {
        return jTextField3.getText();
    }

    public String getNombre() {
        return jTextField4.getText();
    }

    public String getClave() {
        return jTextField5.getText();
    }

    public String getNombreSesion() {
        return Nombre.getText();
    }

    public String getClaveSesion() {
        return this.Clave.getText();
    }

    public void AnadirAFichero(String D, String R) throws IOException {

        FileWriter add = new FileWriter("RepertorioPalabrasAlmacen.txt", true);
        BufferedWriter bw = new BufferedWriter(add);
        PrintWriter pw = new PrintWriter(bw);
        String Definicion = D;
        String Respuesta = R;
        pw.println(Respuesta + "-" + Definicion);
        pw.close();

    }

    public void borrarPalabraFichero(Palabra p) throws FileNotFoundException, IOException {
        String aBorrar = p.getPalabra() + "-" + p.getDefinicion1().toString();
        FileReader file = new FileReader("RepertorioPalabrasAlmacen.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> lineasDelFichero = new ArrayList<>();

        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            if (!linea.equals(aBorrar)) {
                lineasDelFichero.add(linea);
            }
        }
        FileWriter fileWriter = new FileWriter("RepertorioPalabrasAlmacen2.txt");
        for (int i = 0; i < lineasDelFichero.size(); i++) {
            fileWriter.write(lineasDelFichero.get(i) + "\n");
        }
        fileWriter.close();
        file.close();

        File newFile = new File("RepertorioPalabrasAlmacen.txt");
        File newFile2 = new File("RepertorioPalabrasAlmacen2.txt");

        if (newFile.delete()) {
            newFile2.renameTo(newFile);
        }

    }

    public static String mostrarHistoricoPartidas() throws FileNotFoundException, IOException {
        String Fichero = "";
        String cadena;
        FileReader f = new FileReader("AlmacenPartidas.txt");
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            Fichero += cadena + "\n";
        }
        b.close();
        return Fichero;
    }

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
            java.util.logging.Logger.getLogger(Pasapalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasapalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasapalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasapalabra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasapalabra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BmostrarPartidas;
    private javax.swing.JPasswordField Clave;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel TituloDelJuego;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cargarJugadores;
    private javax.swing.JButton guardarJugadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel mensajeSalida;
    // End of variables declaration//GEN-END:variables

   
}
