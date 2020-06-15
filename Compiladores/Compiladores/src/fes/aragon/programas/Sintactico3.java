/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.programas;

import AppPackage.AnimationClass;
import fes.aragon.Seleccion;
import fes.aragon.archivos.asint3.Lexico;
import fes.aragon.archivos.asint3.Tokens;
import fes.aragon.archivos.asint3.Token;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel
 */
public class Sintactico3 extends javax.swing.JFrame {
    private Seleccion ventanaSeleccion;
    
    private String cadena;
    private List<Token> tokensLista;
    private int contadorToken = 0;
    private Token tokens;
    private String resultadoSintactico = "";
    private boolean error = false;
    private boolean errorLexico = false;

    /**
     * Creates new form Sintactico3
     */
    public Sintactico3(Seleccion ventanaAnterior) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.ventanaSeleccion = ventanaAnterior;
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
        lblAtras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        sptCadena = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        lblCorrecto = new javax.swing.JLabel();
        lblIncorrecto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLex = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSint = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setBackground(new java.awt.Color(0, 153, 153));
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
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        lblMinimizar.setBackground(new java.awt.Color(0, 153, 153));
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
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Programa 10: Sintáctico 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 20));

        lblAtras.setBackground(new java.awt.Color(0, 153, 153));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jEditorPane1.setEditable(false);
        jEditorPane1.setBorder(null);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jEditorPane1.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p align=\"center\">Este programa es un analizador sintáctico que revisa cadenas según la gramática:</p>\r\n    <p>S := aAb;</p>\n    <p>A := c</p>\n  </body>\r\n</html>\r");
        jScrollPane1.setViewportView(jEditorPane1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 330, 140));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Cadena:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtCadena.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCadena.setForeground(new java.awt.Color(153, 153, 153));
        txtCadena.setText("Ingresa la cadena a buscar...");
        txtCadena.setBorder(null);
        txtCadena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCadenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCadenaFocusLost(evt);
            }
        });
        jPanel2.add(txtCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, -1));

        sptCadena.setBackground(new java.awt.Color(255, 255, 255));
        sptCadena.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        sptCadena.setForeground(new java.awt.Color(160, 160, 160));
        sptCadena.setText("__________________________________");
        jPanel2.add(sptCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 20));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Analizar");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);
        btnBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarMouseMoved(evt);
            }
        });
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 30));

        lblCorrecto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblCorrecto.setForeground(new java.awt.Color(39, 174, 96));
        lblCorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/correcto.png"))); // NOI18N
        lblCorrecto.setText("¡Correcto!");
        jPanel2.add(lblCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 100, -1));

        lblIncorrecto.setBackground(new java.awt.Color(255, 255, 255));
        lblIncorrecto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblIncorrecto.setForeground(new java.awt.Color(192, 57, 43));
        lblIncorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fes/aragon/imagenes/incorrecto.png"))); // NOI18N
        lblIncorrecto.setText("¡Incorrecto!");
        jPanel2.add(lblIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Salida léxico:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtLex.setEditable(false);
        txtLex.setColumns(20);
        txtLex.setRows(5);
        jScrollPane2.setViewportView(txtLex);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, 70));

        txtSint.setEditable(false);
        txtSint.setColumns(20);
        txtSint.setRows(5);
        jScrollPane3.setViewportView(txtSint);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, 70));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Salida sintáctico:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseMoved
        lblMinimizar.setBackground(Color.blue);
    }//GEN-LAST:event_lblMinimizarMouseMoved

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseMoved
        lblAtras.setBackground(Color.blue);
    }//GEN-LAST:event_lblAtrasMouseMoved

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        ventanaSeleccion.setState(NORMAL);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        lblAtras.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_lblAtrasMouseExited

    private void txtCadenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCadenaFocusGained
        sptCadena.setForeground(new Color(0, 153, 153));
        txtCadena.setText("");
        txtCadena.setForeground(Color.black);
    }//GEN-LAST:event_txtCadenaFocusGained

    private void txtCadenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCadenaFocusLost
        sptCadena.setForeground(new Color(160, 160, 160));
        if (txtCadena.getText().isEmpty()) {
            txtCadena.setText("Ingresa la cadena a buscar...");
            txtCadena.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCadenaFocusLost

    private void btnBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseMoved
        btnBuscar.setBackground(new Color(0, 153, 153));
        btnBuscar.setForeground(Color.white);
    }//GEN-LAST:event_btnBuscarMouseMoved

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        btnBuscar.requestFocus();
        cadena = "";
        lblCorrecto.setLocation(140, 470);
        lblIncorrecto.setLocation(140, 470);
        cadena = txtCadena.getText();
        error = false;
        errorLexico = false;

        if (cadena.isEmpty() || cadena.equals("Ingresa la cadena a buscar...")) {
            JOptionPane.showMessageDialog(null, "Ingresa una cadena.");
        } else {
            
            try {
                analisisLexico();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            analisisSintactico();

            if (!error && !errorLexico) {
                AnimationClass anim = new AnimationClass();
                anim.jLabelYUp(470, 400, 10, 5, lblCorrecto);
            } else {
                AnimationClass anim = new AnimationClass();
                anim.jLabelYUp(470, 400, 10, 5, lblIncorrecto);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(Color.white);
        btnBuscar.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_btnBuscarMouseExited

    public Token getToken() {
        tokens = null;
        if (contadorToken < tokensLista.size()) {
            tokens = tokensLista.get(contadorToken++);
        }
        return tokens;
    }
    
    private void analisisLexico() throws FileNotFoundException, IOException {
        tokensLista = new LinkedList<>();
        this.txtLex.selectAll();
        this.txtLex.replaceSelection("");
        
        File fuente = new File("Fuente.txt");
        PrintWriter writer;
        
        try {        
            writer = new PrintWriter(fuente);
            writer.print(txtCadena.getText());
            writer.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        Reader reader = new BufferedReader(new FileReader("Fuente.txt"));
        Lexico lexico = new Lexico(reader);
        String resultado = "";
        
        while(true){
        
            Tokens token = lexico.yylex();
            
            if(token == null) {
                txtLex.append(resultado);
                return;
            }
            
            switch(token){
            
                case A:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "<A>";
                    break;
                    
                case B:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "<B>";
                    break;
                    
                case C:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "<C>";
                    break;
                    
                case ERROR:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "Error, simbolo " + lexico.yytext() + " no reconocido ";
                    errorLexico = true;
                    break;
                    
                case PYC:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "<" + lexico.yytext() + ">";
                    break;
                    
                default:
                    tokens = new Token();
                    tokens.setNombre(lexico.yytext());
                    tokensLista.add(tokens);
                    resultado = resultado + "<" + lexico.yytext() + ">";
            }
        }
    }
    
    private void analisisSintactico() {
        if (tokensLista != null) {
            txtSint.setText("");

            contadorToken = 0;
            error = false;
            resultadoSintactico = "";

            tokens = null;
            tokens = getToken();
            
            metodo_S();
            
            if (!error && !errorLexico) {
                resultadoSintactico = "Correcto.";
            }
            
            txtSint.append(resultadoSintactico);
        }
    }
    
    private void metodo_S() {
        if (tokens != null && tokens.getNombre().equals("a")) {
            tokens = getToken();
            metodo_A();
            
            if (tokens != null && tokens.getNombre().equals("b")) {
                tokens = getToken();
                
                if (tokens != null && tokens.getNombre().equals(";")) {
                    return;
                } else {
                    error = true;
                    error(true);
                }
            } else {
                error = true;
                error(false);
                
                if (tokens != null && tokens.getNombre().equals(";")) {
                    return;
                } else {
                    error = true;
                    error(true);
                }
            }
        } else {
            error = true;
            error(false);
            
            tokens = getToken();
            metodo_A();
            
            if (tokens != null && tokens.getNombre().equals("b")) {
                tokens = getToken();
                
                if (tokens != null && tokens.getNombre().equals(";")) {
                    return;
                } else {
                    error = true;
                    error(true);
                }
            } else {
                error = true;
                error(false);
                
                if (tokens != null && tokens.getNombre().equals(";")) {
                    return;
                } else {
                    error = true;
                    error(true);
                }
            }
        }
    }
    
    private void metodo_A() {
        if (tokens != null && tokens.getNombre().equals("c")) {
            tokens = getToken();
            return;
        } else if (tokens != null) {
            error = true;
            error(false);
            tokens = getToken();
        }
    }
    
    private void error(boolean esPyc) {
        if (tokens != null && !esPyc) {
            resultadoSintactico += "Error de sintaxis en " + tokens.getNombre() + "\n";
        } else if (esPyc && !cadena.contains(";")) {
            resultadoSintactico += "Error de sintaxis, falta ';'\n";
        }
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
            java.util.logging.Logger.getLogger(Sintactico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sintactico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sintactico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sintactico3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sintactico3(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCorrecto;
    private javax.swing.JLabel lblIncorrecto;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel sptCadena;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextArea txtLex;
    private javax.swing.JTextArea txtSint;
    // End of variables declaration//GEN-END:variables
}
