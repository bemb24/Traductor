/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import static java.lang.System.out;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author bonni
 */
public class Traductor extends javax.swing.JFrame {

    /**
     * Creates new form Traductor
     */
    public Traductor() {
        initComponents();
    }

    String PathArchivo = "";
    private void analizarLexico() throws IOException{
        try {
            // TODO add your handling code here:
            File archivo = new File("archivo.txt");
            PrintWriter escribir;
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
         while (true) {
            Tokens tokens = lexer.yylex();
            if (tokens == null) {
                txt_Result.setText(resultado);
                return;
            }
            switch (tokens) {
                
                case ERROR:
                        resultado += "Palabra incorrecta\n";
                        break;
                    case hola:  
                        resultado += tokens + " ";
                        break;
                    case yo: 
                        resultado += tokens + " ";
                        break;
                    case tú: 
                        resultado += tokens + " ";
                        break;
                    case ella: 
                        resultado += tokens + " ";
                        break;
                    case él: 
                        resultado += tokens + " ";
                        break;
                    case ello: 
                        resultado += tokens + " ";
                        break;
                    case nosotros: 
                        resultado += tokens + " ";
                        break;
                    case ellos: 
                        resultado += tokens + " ";
                        break;
                    case rojo: 
                        resultado += tokens + " ";
                        break;
                    case amarillo: 
                        resultado += tokens + " ";
                        break;
                    case rosado: 
                        resultado += tokens + " ";
                        break;
                    case morado: 
                        resultado += tokens + " ";
                        break;
                    case azul: 
                        resultado += tokens + " ";
                        break;
                    case naranja: 
                        resultado += tokens + " ";
                        break;
                    case verde: 
                        resultado += tokens + " ";
                        break;
                    case blanco: 
                        resultado += tokens + " ";
                        break;
                    case gris: 
                        resultado += tokens + " ";
                        break;
                    case negro: 
                        resultado += tokens + " ";
                        break;
                    case bueno: 
                        resultado += tokens + " ";
                        break;
                    case malo: 
                        resultado += tokens + " ";
                        break;
                    case delgado: 
                        resultado += tokens + " ";
                        break;
                    case gordo: 
                        resultado += tokens + " ";
                        break;
                    case seco: 
                        resultado += tokens + " ";
                        break;
                    case corto: 
                        resultado += tokens + " ";
                        break;
                    case este: 
                        resultado += tokens + " ";
                        break;
                    case aquel: 
                        resultado += tokens + " ";
                        break;
                    case estos: 
                        resultado += tokens + " ";
                        break;
                    case aquellos: 
                        resultado += tokens + " ";
                        break;
                    case cada: 
                        resultado += tokens + " ";
                        break;
                    case todo: 
                        resultado += tokens + " ";
                        break;
                    case algún: 
                        resultado += tokens + " ";
                        break;
                    case cualquier: 
                        resultado += tokens + " ";
                        break;
                    case qué: 
                        resultado += tokens + " ";
                        break;
                    case cuál: 
                        resultado += tokens + " ";
                        break;
                    case de_quién: 
                        resultado += tokens + " ";
                        break;
                    case cuantos: 
                        resultado += tokens + " ";
                        break;
                    case mi: 
                        resultado += tokens + " ";
                        break;
                    case tu: 
                        resultado += tokens + " ";
                        break;
                    case su: 
                        resultado += tokens + " ";
                        break;
                    case nuestro: 
                        resultado += tokens + " ";
                        break;
                    case es: 
                        resultado += tokens + " ";
                        break;
                    case soy: 
                        resultado += tokens + " ";
                        break;
                    case eres: 
                        resultado += tokens + " ";
                        break;
                    case si: 
                        resultado += tokens + " ";
                        break;
                    case no: 
                        resultado += tokens + " ";
                        break;
                    case perro: 
                        resultado += tokens + " ";
                        break;
                    case gato: 
                        resultado += tokens + " ";
                        break;
                    case gallo: 
                        resultado += tokens + " ";
                        break;
                    case gallina: 
                        resultado += tokens + " ";
                        break;
                    case obeja: 
                        resultado += tokens + " ";
                        break;
                    case pato: 
                        resultado += tokens + " ";
                        break;
                    case pavo: 
                        resultado += tokens + " ";
                        break;
                    case conejo: 
                        resultado += tokens + " ";
                        break;
                    case cerdo: 
                        resultado += tokens + " ";
                        break;
                    case vaca: 
                        resultado += tokens + " ";
                        break;
                    case pingüino: 
                        resultado += tokens + " ";
                        break;
                    case venado: 
                        resultado += tokens + " ";
                        break;
                    case ballena: 
                        resultado += tokens + " ";
                        break;
                    case caballo: 
                        resultado += tokens + " ";
                        break;
                    case rana: 
                        resultado += tokens + " ";
                        break;
                    case toro: 
                        resultado += tokens + " ";
                        break;
                    case hombre: 
                        resultado += tokens + " ";
                        break;
                    case hombres: 
                        resultado += tokens + " ";
                        break;
                    case mujer: 
                        resultado += tokens + " ";
                        break;
                    case mujeres: 
                        resultado += tokens + " ";
                        break;
                    case niño: 
                        resultado += tokens + " ";
                        break;
                    case niños: 
                        resultado += tokens + " ";
                        break;
                    case niña: 
                        resultado += tokens + " ";
                        break;
                    case niñas: 
                        resultado += tokens + " ";
                        break;
                    case carro: 
                        resultado += tokens + " ";
                        break;
                    case avión: 
                        resultado += tokens + " ";
                        break;
                    case bicicleta: 
                        resultado += tokens + " ";
                        break;
                    case bus: 
                        resultado += tokens + " ";
                        break;
                    case barco: 
                        resultado += tokens + " ";
                        break;
                    case tren: 
                        resultado += tokens + " ";
                        break;
                    case empleos: 
                        resultado += tokens + " ";
                        break;
                    case enfermera: 
                        resultado += tokens + " ";
                        break;
                    case doctor: 
                        resultado += tokens + " ";
                        break;
                    case maestro: 
                        resultado += tokens + " ";
                        break;
                    case cocinero: 
                        resultado += tokens + " ";
                        break;
                    case granjero: 
                        resultado += tokens + " ";
                        break;
                    case cabello: 
                        resultado += tokens + " ";
                        break;
                    case cabeza: 
                        resultado += tokens + " ";
                        break;
                    case oreja: 
                        resultado += tokens + " ";
                        break;
                    case ojos: 
                        resultado += tokens + " ";
                        break;
                    case nariz: 
                        resultado += tokens + " ";
                        break;
                    case boca: 
                        resultado += tokens + " ";
                        break;
                    case hombro: 
                        resultado += tokens + " ";
                        break;
                    case brazo: 
                        resultado += tokens + " ";
                        break;
                    case mano: 
                        resultado += tokens + " ";
                        break;
                    case rodilla: 
                        resultado += tokens + " ";
                        break;
                    case pierna: 
                        resultado += tokens + " ";
                        break;
                    case pie: 
                        resultado += tokens + " ";
                        break;
                    case pies: 
                        resultado += tokens + " ";
                        break;
                    case libro: 
                        resultado += tokens + " ";
                        break;
                    case escritorio: 
                        resultado += tokens + " ";
                        break;
                    case silla: 
                        resultado += tokens + " ";
                        break;
                    case computadora: 
                        resultado += tokens + " ";
                        break;
                    case pegamento: 
                        resultado += tokens + " "; 
                        break;
                    default: 
                        resultado += tokens + " "; 
                        break;
                      
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Result = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Open = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_compiler = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traductor");

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        txt_Result.setEditable(false);
        txt_Result.setColumns(20);
        txt_Result.setRows(5);
        jScrollPane2.setViewportView(txt_Result);

        jToolBar1.setRollover(true);

        btn_Open.setBackground(new java.awt.Color(0, 0, 0));
        btn_Open.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Open.setForeground(new java.awt.Color(255, 255, 255));
        btn_Open.setText("Open");
        btn_Open.setFocusable(false);
        btn_Open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OpenActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Open);

        btn_Save.setBackground(new java.awt.Color(0, 0, 0));
        btn_Save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setText("Save");
        btn_Save.setFocusable(false);
        btn_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Save);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("New");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        btnRun.setBackground(new java.awt.Color(0, 0, 0));
        btnRun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRun.setForeground(new java.awt.Color(255, 255, 255));
        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRun);

        btn_Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Limpiar.setText("Clean");
        btn_Limpiar.setFocusable(false);
        btn_Limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Limpiar);

        btn_compiler.setBackground(new java.awt.Color(0, 0, 0));
        btn_compiler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_compiler.setForeground(new java.awt.Color(255, 255, 255));
        btn_compiler.setText("Compiler");
        btn_compiler.setFocusable(false);
        btn_compiler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_compiler.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_compiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compilerActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_compiler);

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane3.setViewportView(txtEntrada);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:
            analizarLexico ();
        } catch (IOException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String ST = txt_Result.getText().toLowerCase();
       Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtSalida.setText("Analisis realizado correctamente");
            txtSalida.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtSalida.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtSalida.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_btnRunActionPerformed

    private void btn_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OpenActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST= new String(Files.readAllBytes(archivo.toPath()));
            txt_Result.setText(ST);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_OpenActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
        txt_Result.setText(null);
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        // TODO add your handling code here:
        
        String nombre = "";
        JFileChooser file = new JFileChooser();
        file.showSaveDialog(this);
        File save = file.getSelectedFile();
        
        if (save != null) {
            try {
                FileWriter guardar = new FileWriter(save+ ".ccp");
                guardar.write(txt_Result.getText());
                PathArchivo = save.getAbsolutePath();
                
                JOptionPane.showMessageDialog(null,"Archivo guardado exitosamente"+" "+PathArchivo, "Informacion", JOptionPane.WARNING_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"No se ha podido guardar el archivo", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_compilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compilerActionPerformed
        
        PrintWriter out = null;
        try {
            // TODO add your handling code here:
            out = new PrintWriter("traductor.bat");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
         out.println("Hecho off");
         out.println("title Traductor");
         out.println("CD C:\\MinGW\\bin");
         out.println("dcc"+" "+PathArchivo+".cpp"+"-o"+" "+PathArchivo+".obj");
         out.println("dcc"+" "+PathArchivo+".cpp"+"-o"+" "+PathArchivo+".exe");
         out.println("cls");
         out.println(PathArchivo+".exe");
         out.println("exit");
         out.println("pause");
         out.close();
         Runtime rn = Runtime.getRuntime();
         
        try {
            rn.exec("cmd /c start "+"traductor.bat");
        } catch (IOException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_compilerActionPerformed

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
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Open;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_compiler;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextArea txt_Result;
    // End of variables declaration//GEN-END:variables
}
