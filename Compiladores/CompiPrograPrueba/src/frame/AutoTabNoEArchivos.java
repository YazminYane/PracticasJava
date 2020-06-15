/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Yazmin Yane
 */
public class AutoTabNoEArchivos extends javax.swing.JFrame {

    private File archivo;
    private int transiciones[][];
    private ArrayList<Character> simbolos = new ArrayList<>();
    private int numEstados = 0;
    private int numEdosFinales = 0;
    private ArrayList<Integer> estadosFinales = new ArrayList<>();
    private boolean archivoCargado = false;
    private int actual = 0;
    private int indiceCaracter = 0;
    
    public AutoTabNoEArchivos() {
        initComponents();
        this.setLocationRelativeTo( null );
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonCargarArchivo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        evaluar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jLMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText(" con el nombre \"configuracion\", posteriormente selecciona tú");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 410, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Crea el automata de cualquier expresión insertando la tabla de ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("transición en un archivo .txt");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("la cadena que desees evaluar .");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 430, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("tú archivo y presiona el \" cargar archivo \", por ultimo escribe");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 430, 30));

        jButtonCargarArchivo.setText("Selecionar Archivo");
        jButtonCargarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Inserte palabra a Evaluar: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 40));

        txtCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, 30));

        evaluar.setText("Evaluar ");
        evaluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarActionPerformed(evt);
            }
        });
        jPanel1.add(evaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 140, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Crea un Archivo .Txt con la configuracion de tú tabla y guardalo ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 440, 30));

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 510, 30));

        btnCargar.setText("Cargar Archivo ");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 390));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Programa 4");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 160, 60));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        //Evento del icono cerrar
        this.dispose();
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        // Evento del icono minimizar

        this.setState(PortadaPrueba.ICONIFIED );
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void txtCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadenaActionPerformed

    }//GEN-LAST:event_txtCadenaActionPerformed

    private void evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarActionPerformed
        // Evento para evaliar la cadena
        actual = 0;
        indiceCaracter = 0;
        
        if (archivoCargado) {
            String cadena = txtCadena.getText();
            int error = 0;

            char cActual = siguienteCaracter(cadena);

            while (cActual != ' ' && error == 0) {
                try {
                    int posCActual = simbolos.indexOf(cActual);

                    if (actual != -1) {
                        actual = transiciones[actual][posCActual];
                    } else {
                        error = 1;
                        break;
                    }

                    cActual = siguienteCaracter(cadena);
                } catch (Exception ex) {
                    error = 1;
                    break;
                }
            }
            
            if (estadosFinales.contains(actual) && error == 0) {
                JOptionPane.showMessageDialog(null, "¡La cadena está en el lenguaje!", 
                        "Resultado del análisis", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La cadena no está en el lenguaje",
                        "Resultado del análisis", JOptionPane.WARNING_MESSAGE);
            }
            
            txtCadena.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden analizar cadenas sin cargar"
                    + " el archivo de configuración.\nAsegúrate de cargarlo y de que el"
                    + " botón de carga sea de color verde.", "Falta cargar configuración", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_evaluarActionPerformed

    private void jButtonCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de texto", "txt");
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this.getContentPane());
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            txtRuta.setText(archivo.getAbsolutePath());
        } else if (seleccion == JFileChooser.ERROR_OPTION) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo. Inténtalo de nuevo.");
        }
    }//GEN-LAST:event_jButtonCargarArchivoActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        
       String ruta = txtRuta.getText();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea = "";
            int numLinea = 0;
            numEstados = 0;
            numEdosFinales = 0;
            int numSimbolos = 0;
            int indiceTransiciones = 0;
            boolean error = false;
            simbolos = new ArrayList<>();
            archivoCargado = false;
            
            
            while ((linea = reader.readLine()) != null) {
                String props[] = linea.split(" ");
                
                if (numLinea == 0) { //Linea para inicializar arreglos.
                    numEstados = Integer.valueOf(props[0]);
                    numSimbolos = Integer.valueOf(props[1]);
                    transiciones = new int[numEstados][numSimbolos];
                    
                } else if (numLinea == 1) { //Linea con los símbolos.
                    if (props.length == numSimbolos) {
                        for (String prop : props) {
                            if (prop.length() > 1) {
                                JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                                    + " configuración.\nAsegúrate de que los símbolos constan de"
                                    + " un sólo caracter", "Error", JOptionPane.ERROR_MESSAGE);
                                btnCargar.setBackground(Color.red);
                                error = true;
                                break;
                            } else {
                                simbolos.add(prop.charAt(0));
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                            + " configuración.\nRevisa que el contenido corresponda con el"
                            + " formato indicado.", "Error", JOptionPane.ERROR_MESSAGE);
                        btnCargar.setBackground(Color.red);
                        error = true;
                        break;
                    }
                    
                } else if (numLinea == 2) { //Linea con los estados finales.
                    numEdosFinales = Integer.valueOf(props[0]);
                    
                    if (numEdosFinales == (props.length - 1)) {
                        for (int indice = 1; indice < props.length; indice++) {
                            estadosFinales.add(Integer.valueOf(props[indice]));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                            + " configuración.\nRevisa que el contenido corresponda con el"
                            + " formato indicado.", "Error", JOptionPane.ERROR_MESSAGE);
                        btnCargar.setBackground(Color.red);
                        error = true;
                        break;
                    }
                    
                } else if (numLinea >= 3 && numLinea <= (2 + numEstados)) { //Lineas de transiciones.
                    if (props.length == simbolos.size()) {            
                        int indice = 0;
                        for (String prop : props) {
                            if (prop.equals("E")) { //-1 para las transiciones con error.
                                transiciones[indiceTransiciones][indice++] = -1;
                            } else if (Integer.valueOf(prop) >= numEstados) {
                                JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                                    + " configuración.\nHay transiciones a estados que no existen."
                                    , "Error", JOptionPane.ERROR_MESSAGE);
                                btnCargar.setBackground(Color.red);
                                error = true;
                            } else {
                                transiciones[indiceTransiciones][indice++] = Integer.valueOf(prop);
                            }
                        }
                        if (error) {
                            break;
                        }
                        indiceTransiciones++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                            + " configuración.\nRevisa que el contenido corresponda con el"
                            + " formato indicado.", "Error", JOptionPane.ERROR_MESSAGE);
                        btnCargar.setBackground(Color.red);
                        error = true;
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                            + " configuración.\nRevisa que el contenido corresponda con el"
                            + " formato indicado.", "Error", JOptionPane.ERROR_MESSAGE);
                    btnCargar.setBackground(Color.red);
                    error = true;
                        break;
                }
                
                numLinea++;
            }
            
            if (numLinea <= (2 + numEstados)) {
                JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                        + " configuración.\nEl número de estados no coincide con el"
                        + " número de transiciones.", "Error", JOptionPane.ERROR_MESSAGE);
                btnCargar.setBackground(Color.red);
                error = true;
            }
            
            if (!error) {
                btnCargar.setBackground(Color.green);
                archivoCargado = true;
            }
            
        } catch (FileNotFoundException ex) {
            btnCargar.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                    + " configuración.\nAsegúrate de que el nombre sea correcto"
                    + " y de que se encuentre en su ubicación.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                    + " configuración.\nRevisa que su contenido no esté dañado"
                    + " e inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo de"
                    + " configuración.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private char siguienteCaracter(String cadena) {
        char c = ' ';
        
        if (indiceCaracter < cadena.length()) {
            c = cadena.charAt(indiceCaracter);
            indiceCaracter++;
        }
        
        return c;
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutoTabNoEArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoTabNoEArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoTabNoEArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoTabNoEArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoTabNoEArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton evaluar;
    private javax.swing.JButton jButtonCargarArchivo;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
