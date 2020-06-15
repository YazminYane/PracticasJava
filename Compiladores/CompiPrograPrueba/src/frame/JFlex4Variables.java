/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;


import JFlex_4P9.Lexico;
import JFlex_4P9.Tabla;
import JFlex_4P9.Tokens;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

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
 * @author Yazmin Yane
 */
public class JFlex4Variables extends javax.swing.JFrame {

   private List<Tabla>tokensLista; 
   private Tabla tablas = new Tabla();
   private int contadorToken = 0;
   private boolean error = false;
   
    public JFlex4Variables() {
        initComponents();
        this.setLocationRelativeTo( null );
    }
    
    private void analizarTokens()throws FileNotFoundException, IOException{
    
        tokensLista = new LinkedList<Tabla>();
        this.TxtArea.selectAll();
        this.TxtArea.replaceSelection("");
        int contadorID = 0;
        File fichero = new File ("Fuente.txt");
        PrintWriter writer;
        try{
        
            writer = new PrintWriter(fichero);
            writer.print(TxtCadena.getText());
            writer.close();
        }catch( FileNotFoundException ex){
        
            System.out.println("Archivo no encontrado");
            ex.printStackTrace();
        }
        
        Reader reader = new BufferedReader( new FileReader("Fuente.txt"));
        Lexico lexico = new Lexico( reader );
        String resultado = "";
        
        while( true ){
        
            Tokens token = lexico.yylex();
            if( token == null ){
//                for(int i = 0 ; i < tokensLista.size(); i++ ){
//                    System.out.println( tokensLista.get( i ).getNombre() + "=" + tokensLista.get( i ).getId());
//                }
                TxtArea.append( resultado );
                return;
            }
            // INT, FLOAT, BOOLEAN, STR, DOUBLE, PCOMA, COMA, ID, ERROR  
            Tabla tab = new Tabla();
            
            switch( token ){
            
                case INT:
                    resultado = resultado + "<int> ";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case FLOAT:
                    resultado = resultado + "<float> ";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case BOOLEAN:
                    resultado = resultado + "<boolean> ";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case STR:
                    resultado = resultado + "<String> ";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case DOUBLE:
                    resultado = resultado + "<double> ";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case PCOMA:
                    resultado = resultado +"< ; >";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case COMA:
                    resultado = resultado + "< , >";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case ERROR:
                    resultado = resultado + "Error, simbolo no reconocido";
                    tab.setNombre(lexico.yytext());
                    tokensLista.add(tab);
                    break;
                case ID:
                    contadorID ++;
                    Tabla tokens = new Tabla();
                    tokens.setTipo(1);
                    tokens.setNombre(lexico.yytext());
                    tokens.setId( contadorID );
                    tokensLista.add(tokens);
                    resultado = resultado + "<ID" +contadorID + "> ";
                    break;   
                    
                default:
                    resultado = resultado + "<" + lexico.lexema +"> ";
            }
            
        }
    }
    
    public Tabla getToken() {
        tablas = null;
        if (contadorToken < tokensLista.size()) {
            tablas = tokensLista.get(contadorToken ++);
        }
        return tablas;
    }
    
    private void Sintactico(){
    
         tablas = getToken();
         metodo_S();
    
    }
    
    private void metodo_S(){
    
        metodo_A();
        metodo_B();
        
        if( tablas != null && !tablas.getNombre().equals(";") || tablas == null ){
            
            error = true;
        }
        
    }
    private void metodo_A(){
        
        if( tablas != null && !tablas.getNombre().equals("String") && !tablas.getNombre().equals("int") && !tablas.getNombre().equals("double") &&
                !tablas.getNombre().equals("boolean") && !tablas.getNombre().equals("float"))
        {
            error = true;
        }
        
        tablas = getToken();
    }
    
    private void metodo_B(){
    
        if( tablas != null && tablas.getTipo() == 1 ){
            
            tablas = getToken();
            if( tablas != null && tablas.getNombre().equals(",") ){
                tablas = getToken();
                metodo_B();
           }
            
        }else {
            error = true;
        }      
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
        TxtCadena = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
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

        TxtCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCadenaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 220, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Es un analizador sintactico que recnoce declaraciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("double.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Inserte instrucción a evaluar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 290, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("de variables como: int,  boolean, string, double");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 450, 40));

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 30));

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 500, 310));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Programa 9");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 60));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

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

    private void TxtCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCadenaActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        error = false;
        tokensLista = new LinkedList< Tabla >();
        contadorToken = 0;
    
        
        try { analizarTokens(); }
        catch( IOException e ){
         e.printStackTrace(); //imprime la excepcion 
        }
        
        
        
        Sintactico();
        if( !this.error ){
            JOptionPane.showMessageDialog(null, "correcto");
        }else{
            JOptionPane.showMessageDialog(null, "incorrecto");
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

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
            java.util.logging.Logger.getLogger(JFlex4Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFlex4Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFlex4Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFlex4Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFlex4Variables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JTextField TxtCadena;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
