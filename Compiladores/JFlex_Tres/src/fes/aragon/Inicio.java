//3er. programa de  JFlex
//se empezo en clase, de tarea terminarlo 
//acepta expresiones de suma y restas y deben terminar en ";" 
//por ejemplo : num + num ;  / num - num ; / num + num + nunm ; etc.


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

/**
 *
 * @author PC2
 */
public class Inicio extends javax.swing.JFrame {

    //Más que tabla era un objeto que guardaba un identificador
    //Guarda el id y el nombre
    //la clase LinkedList, ésta se basa en la implementación de listas doblemente enlazadas. se buca que la eliminacion
    //e insercion sea lo mas rapido posible
    private List<Tabla>tokensLista;
   
    
    public Inicio() {
        initComponents();
    }

    
    private void analizarTokens()throws FileNotFoundException, IOException{
    
        tokensLista = new LinkedList<>();
        this.jTextArea1.selectAll();
        this.jTextArea1.replaceSelection("");
        int contadorID = 0;
        File fichero = new File ("Fuente.txt");
        PrintWriter writer;
        try{
        
            writer = new PrintWriter(fichero);
            writer.print(jTextField1.getText());
            writer.close();
        }catch( FileNotFoundException ex){
        
            System.out.println("Archivo no encontrado");
            ex.printStackTrace();
        }
        
        Reader reader = new BufferedReader( new FileReader("Fuente.txt"));
        Lexico lexico = new Lexico( reader );
        String resultado = "";
        
        while( true ){
            
            //yylex(): lee la secuencia de entrada genera tokens, devuelve cero al final de la secuencia de entrada. 
            //Se llama para invocar al lexer (o escáner) y cada vez que se invoca yylex (),
            // el escáner continúa procesando la entrada desde donde se dejó por última vez.
        
            
            Tokens token = lexico.yylex();
            if( token == null ){
                for(int i = 0 ; i < tokensLista.size(); i++ ){
                    System.out.println( tokensLista.get( i ).getNombre() + "=" + tokensLista.get( i ).getId());
                }
                jTextArea1.append(resultado );
                return;
            }
            
            switch( token ){
            
                case SUMA:
                    resultado = resultado + "<+>";
                    break;
                    
                case RESTA:
                    resultado = resultado + "<->";
                    break;
                    
                case PCOMA:
                    resultado = resultado + "<;>";
                    break;
                    
                case IGUAL:
                    resultado = resultado + "<=>";
                    break;
                    
                case ERROR:
                    resultado = resultado + "Error, simbolo no reconocido";
                    break;
                    
                case ID:
                    contadorID ++;
                    Tabla tokens = new Tabla();
                    tokens.setNombre(lexico.yytext());
                    tokens.setId( contadorID );
                    tokensLista.add(tokens);
                    resultado = resultado + "<ID" +contadorID + ">";
                    break;   
                    
                case INT:
                    resultado = resultado + "<" + lexico.lexema + ">";
                    break;
                    
                default:
                    resultado = resultado + "<" + lexico.lexema +">";
            }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadenas");

        jLabel2.setText("Salidas");

        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Iniciar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(Iniciar)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
       //en este boton se manda a llamar la funcion analizarTokens 
        
        try { analizarTokens(); }
        catch( IOException e ){
         e.printStackTrace(); //imprime la excepcion 
        }
            
        
    }//GEN-LAST:event_IniciarActionPerformed

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
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
