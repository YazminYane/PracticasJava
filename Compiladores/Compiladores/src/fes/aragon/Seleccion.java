/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

import fes.aragon.programas.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author Axel
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion
     */
    public Seleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAtras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        prog2 = new javax.swing.JLabel();
        prog1 = new javax.swing.JLabel();
        prog4 = new javax.swing.JLabel();
        prog8 = new javax.swing.JLabel();
        prog3 = new javax.swing.JLabel();
        prog5 = new javax.swing.JLabel();
        prog6 = new javax.swing.JLabel();
        prog7 = new javax.swing.JLabel();
        prog9 = new javax.swing.JLabel();
        prog10 = new javax.swing.JLabel();
        prog11 = new javax.swing.JLabel();
        prog12 = new javax.swing.JLabel();
        prog13 = new javax.swing.JLabel();
        prog14 = new javax.swing.JLabel();
        prog15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/Cerrar.png"))); // NOI18N
        lblCerrar.setToolTipText("Cerrar");
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrarMouseMoved(evt);
            }
        });
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        lblMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/Minimizar.png"))); // NOI18N
        lblMinimizar.setToolTipText("Minimizar");
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseMoved(evt);
            }
        });
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Seleccionar un programa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 540, 10));

        lblAtras.setBackground(new java.awt.Color(255, 255, 255));
        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/atras.png"))); // NOI18N
        lblAtras.setToolTipText("Atrás");
        lblAtras.setOpaque(true);
        lblAtras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAtrasMouseMoved(evt);
            }
        });
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAtrasMouseExited(evt);
            }
        });
        jPanel1.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prog2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog2.setText("Programa 2: Léxico 2");
        prog2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog2MouseMoved(evt);
            }
        });
        prog2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog2MouseExited(evt);
            }
        });
        jPanel2.add(prog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        prog1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog1.setText("Programa 1: Léxico 1");
        prog1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog1MouseMoved(evt);
            }
        });
        prog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog1MouseExited(evt);
            }
        });
        jPanel2.add(prog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        prog4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog4.setText("Programa 4: Léxico 4");
        prog4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog4MouseMoved(evt);
            }
        });
        prog4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog4MouseExited(evt);
            }
        });
        jPanel2.add(prog4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        prog8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog8.setText("Programa 8: Sintáctico 1");
        prog8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog8MouseMoved(evt);
            }
        });
        prog8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog8MouseExited(evt);
            }
        });
        jPanel2.add(prog8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        prog3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog3.setText("Programa 3: Léxico 3");
        prog3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog3MouseMoved(evt);
            }
        });
        prog3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog3MouseExited(evt);
            }
        });
        jPanel2.add(prog3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        prog5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog5.setText("Programa 5: Léxico 5");
        prog5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog5MouseMoved(evt);
            }
        });
        prog5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog5MouseExited(evt);
            }
        });
        jPanel2.add(prog5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        prog6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog6.setText("Programa 6: JFlex 1");
        prog6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog6MouseMoved(evt);
            }
        });
        prog6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog6MouseExited(evt);
            }
        });
        jPanel2.add(prog6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        prog7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog7.setText("Programa 7: JFlex 2");
        prog7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog7MouseMoved(evt);
            }
        });
        prog7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog7MouseExited(evt);
            }
        });
        jPanel2.add(prog7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        prog9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog9.setText("Programa 9: Sintáctico 2");
        prog9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog9MouseMoved(evt);
            }
        });
        prog9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog9MouseExited(evt);
            }
        });
        jPanel2.add(prog9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        prog10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog10.setText("Programa 10: Sintáctico 3");
        prog10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog10MouseMoved(evt);
            }
        });
        prog10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog10MouseExited(evt);
            }
        });
        jPanel2.add(prog10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        prog11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog11.setText("Programa 11: Sintáctico 4");
        prog11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog11MouseMoved(evt);
            }
        });
        prog11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog11MouseExited(evt);
            }
        });
        jPanel2.add(prog11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        prog12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog12.setText("Programa 12: Sintáctico 5");
        prog12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog12MouseMoved(evt);
            }
        });
        prog12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog12MouseExited(evt);
            }
        });
        jPanel2.add(prog12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        prog13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog13.setText("Programa 13: Sintáctico 6");
        prog13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog13MouseMoved(evt);
            }
        });
        prog13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog13MouseExited(evt);
            }
        });
        jPanel2.add(prog13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        prog14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog14.setText("Programa 14: Sintáctico 7");
        prog14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog14MouseMoved(evt);
            }
        });
        prog14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog14MouseExited(evt);
            }
        });
        jPanel2.add(prog14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        prog15.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        prog15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/flecha.png"))); // NOI18N
        prog15.setText("Programa 15: Sintáctico 8");
        prog15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prog15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                prog15MouseMoved(evt);
            }
        });
        prog15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prog15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prog15MouseExited(evt);
            }
        });
        jPanel2.add(prog15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(Color.white);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseMoved
        lblMinimizar.setBackground(Color.blue);
    }//GEN-LAST:event_lblMinimizarMouseMoved

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseMoved
        lblAtras.setBackground(Color.blue);
    }//GEN-LAST:event_lblAtrasMouseMoved

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        lblAtras.setBackground(Color.white);
    }//GEN-LAST:event_lblAtrasMouseExited

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        Compiladores ventanaPrin = new Compiladores();
        ventanaPrin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void prog1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog1MouseMoved
        agregarBordeAzul(prog1);
    }//GEN-LAST:event_prog1MouseMoved

    private void prog2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog2MouseMoved
        agregarBordeAzul(prog2);
    }//GEN-LAST:event_prog2MouseMoved

    private void prog3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog3MouseMoved
        agregarBordeAzul(prog3);
    }//GEN-LAST:event_prog3MouseMoved

    private void prog4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog4MouseMoved
        agregarBordeAzul(prog4);
    }//GEN-LAST:event_prog4MouseMoved

    private void prog5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog5MouseMoved
        agregarBordeAzul(prog5);
    }//GEN-LAST:event_prog5MouseMoved

    private void prog6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog6MouseMoved
        agregarBordeAzul(prog6);
    }//GEN-LAST:event_prog6MouseMoved

    private void prog7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog7MouseMoved
        agregarBordeAzul(prog7);
    }//GEN-LAST:event_prog7MouseMoved

    private void prog8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog8MouseMoved
        agregarBordeAzul(prog8);
    }//GEN-LAST:event_prog8MouseMoved

    private void prog9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog9MouseMoved
        agregarBordeAzul(prog9);
    }//GEN-LAST:event_prog9MouseMoved

    private void prog10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog10MouseMoved
        agregarBordeAzul(prog10);
    }//GEN-LAST:event_prog10MouseMoved

    private void prog11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog11MouseMoved
        agregarBordeAzul(prog11);
    }//GEN-LAST:event_prog11MouseMoved

    private void prog12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog12MouseMoved
        agregarBordeAzul(prog12);
    }//GEN-LAST:event_prog12MouseMoved

    private void prog13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog13MouseMoved
        agregarBordeAzul(prog13);
    }//GEN-LAST:event_prog13MouseMoved

    private void prog14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog14MouseMoved
        agregarBordeAzul(prog14);
    }//GEN-LAST:event_prog14MouseMoved

    private void prog15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog15MouseMoved
        agregarBordeAzul(prog15);
    }//GEN-LAST:event_prog15MouseMoved

    private void prog1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog1MouseExited
        quitarBordeAzul(prog1);
    }//GEN-LAST:event_prog1MouseExited

    private void prog2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog2MouseExited
        quitarBordeAzul(prog2);
    }//GEN-LAST:event_prog2MouseExited

    private void prog3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog3MouseExited
        quitarBordeAzul(prog3);
    }//GEN-LAST:event_prog3MouseExited

    private void prog4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog4MouseExited
        quitarBordeAzul(prog4);
    }//GEN-LAST:event_prog4MouseExited

    private void prog5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog5MouseExited
        quitarBordeAzul(prog5);
    }//GEN-LAST:event_prog5MouseExited

    private void prog6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog6MouseExited
        quitarBordeAzul(prog6);
    }//GEN-LAST:event_prog6MouseExited

    private void prog7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog7MouseExited
        quitarBordeAzul(prog7);
    }//GEN-LAST:event_prog7MouseExited

    private void prog8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog8MouseExited
        quitarBordeAzul(prog8);
    }//GEN-LAST:event_prog8MouseExited

    private void prog9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog9MouseExited
        quitarBordeAzul(prog9);
    }//GEN-LAST:event_prog9MouseExited

    private void prog10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog10MouseExited
        quitarBordeAzul(prog10);
    }//GEN-LAST:event_prog10MouseExited

    private void prog11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog11MouseExited
        quitarBordeAzul(prog11);
    }//GEN-LAST:event_prog11MouseExited

    private void prog12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog12MouseExited
        quitarBordeAzul(prog12);
    }//GEN-LAST:event_prog12MouseExited

    private void prog13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog13MouseExited
        quitarBordeAzul(prog13);
    }//GEN-LAST:event_prog13MouseExited

    private void prog14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog14MouseExited
        quitarBordeAzul(prog14);
    }//GEN-LAST:event_prog14MouseExited

    private void prog15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog15MouseExited
        quitarBordeAzul(prog15);
    }//GEN-LAST:event_prog15MouseExited

    private void prog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog1MouseClicked
        Lexico1 prog1 = new Lexico1(this);
        prog1.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog1MouseClicked

    private void prog2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog2MouseClicked
        Lexico2 prog2 = new Lexico2(this);
        prog2.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog2MouseClicked

    private void prog3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog3MouseClicked
        Lexico3 prog3 = new Lexico3(this);
        prog3.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog3MouseClicked

    private void prog4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog4MouseClicked
        Lexico4 prog4 = new Lexico4(this);
        prog4.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog4MouseClicked

    private void prog5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog5MouseClicked
        Lexico5 prog5 = new Lexico5(this);
        prog5.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog5MouseClicked

    private void prog6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog6MouseClicked
        JFlex1 prog6 = new JFlex1(this);
        prog6.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog6MouseClicked

    private void prog7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog7MouseClicked
        JFlex2 prog7 = new JFlex2(this);
        prog7.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog7MouseClicked

    private void prog8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog8MouseClicked
        Sintactico1 prog8 = new Sintactico1(this);
        prog8.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog8MouseClicked

    private void prog9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog9MouseClicked
        Sintactico2 prog9 = new Sintactico2(this);
        prog9.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog9MouseClicked

    private void prog10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog10MouseClicked
        Sintactico3 prog10 = new Sintactico3(this);
        prog10.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog10MouseClicked

    private void prog11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog11MouseClicked
        Sintactico4 prog11 = new Sintactico4(this);
        prog11.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog11MouseClicked

    private void prog12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog12MouseClicked
        Sintactico5 prog12 = new Sintactico5(this);
        prog12.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog12MouseClicked

    private void prog13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog13MouseClicked
        Sintactico6 prog13 = new Sintactico6(this);
        prog13.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog13MouseClicked

    private void prog14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog14MouseClicked
        Sintactico7 prog14 = new Sintactico7(this);
        prog14.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog14MouseClicked

    private void prog15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog15MouseClicked
        Sintactico8 prog15 = new Sintactico8(this);
        prog15.setVisible(true);
        this.setState(ICONIFIED);
    }//GEN-LAST:event_prog15MouseClicked

    private void agregarBordeAzul (JLabel label) {
        label.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204), 2, true));
    }
    
    private void quitarBordeAzul (JLabel label) {
        label.setBorder(BorderFactory.createLineBorder(Color.white));
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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel prog1;
    private javax.swing.JLabel prog10;
    private javax.swing.JLabel prog11;
    private javax.swing.JLabel prog12;
    private javax.swing.JLabel prog13;
    private javax.swing.JLabel prog14;
    private javax.swing.JLabel prog15;
    private javax.swing.JLabel prog2;
    private javax.swing.JLabel prog3;
    private javax.swing.JLabel prog4;
    private javax.swing.JLabel prog5;
    private javax.swing.JLabel prog6;
    private javax.swing.JLabel prog7;
    private javax.swing.JLabel prog8;
    private javax.swing.JLabel prog9;
    // End of variables declaration//GEN-END:variables
}
