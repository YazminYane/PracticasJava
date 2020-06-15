/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

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
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    
   private List<Tabla>tokensLista; 
   private Tabla tablas = new Tabla();
   private int contadorToken = 0;
   private boolean error = false;
            
    public Inicio() {
        initComponents();
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
        
        if( tablas != null && !tablas.getNombre().equals(";") ){
            
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

        btnAnalizar = new javax.swing.JButton();
        TxtCadena = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        TxtCadena.setText("jTextField1");

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAnalizar)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtCadena)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JTextField TxtCadena;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
