
package com.mycompany.compilerproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;
import javax.swing.text.*;
import java.io.FileWriter;

/**
 *
 * @author super
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        try { 
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}
        initComponents();
        this.setMinimumSize(new Dimension(1280, 720));
        this.setLocationRelativeTo(null);
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH); 
        
        editorTextoPanel.setFont(new Font("consolas", Font.PLAIN,15));
        fontSizeSpinner.setValue(20);
        
        
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPadre = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editorTextoPanel = new javax.swing.JTextPane();
        panelTabLeft = new javax.swing.JTabbedPane();
        panelLexico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelSintactico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        panelSemantico = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        panelCodInt = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        fontSizeSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        panelTabBottom = new javax.swing.JTabbedPane();
        panelErrores = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        panelResultados = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        barraDeOpciones = new javax.swing.JMenuBar();
        archivo_BDO = new javax.swing.JMenu();
        a_GuardarComo_BDO = new javax.swing.JMenuItem();
        a_Abrir_BDO = new javax.swing.JMenuItem();
        a_Salir_BDO = new javax.swing.JMenuItem();
        editar_BDO = new javax.swing.JMenu();
        formato_BDO = new javax.swing.JMenu();
        compilar_BDO = new javax.swing.JMenu();
        c_Compilar_BDO = new javax.swing.JMenuItem();
        ayuda_BDO = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PanelPrincipal");
        setSize(new java.awt.Dimension(1280, 720));

        jScrollPane2.setViewportView(editorTextoPanel);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelLexicoLayout = new javax.swing.GroupLayout(panelLexico);
        panelLexico.setLayout(panelLexicoLayout);
        panelLexicoLayout.setHorizontalGroup(
            panelLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLexicoLayout.setVerticalGroup(
            panelLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
        );

        panelTabLeft.addTab("L??xico", panelLexico);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout panelSintacticoLayout = new javax.swing.GroupLayout(panelSintactico);
        panelSintactico.setLayout(panelSintacticoLayout);
        panelSintacticoLayout.setHorizontalGroup(
            panelSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintacticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSintacticoLayout.setVerticalGroup(
            panelSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintacticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTabLeft.addTab("Sint??ctico", panelSintactico);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        javax.swing.GroupLayout panelSemanticoLayout = new javax.swing.GroupLayout(panelSemantico);
        panelSemantico.setLayout(panelSemanticoLayout);
        panelSemanticoLayout.setHorizontalGroup(
            panelSemanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemanticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSemanticoLayout.setVerticalGroup(
            panelSemanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemanticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTabLeft.addTab("Sem??ntico", panelSemantico);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        javax.swing.GroupLayout panelCodIntLayout = new javax.swing.GroupLayout(panelCodInt);
        panelCodInt.setLayout(panelCodIntLayout);
        panelCodIntLayout.setHorizontalGroup(
            panelCodIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodIntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCodIntLayout.setVerticalGroup(
            panelCodIntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodIntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTabLeft.addTab("C??digo intermedio", panelCodInt);

        fontSizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fontSizeSpinnerStateChanged(evt);
            }
        });

        jLabel1.setText("Tama??o del texto");

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelPadreLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fontSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelTabLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPadreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabLeft)
                    .addGroup(panelPadreLayout.createSequentialGroup()
                        .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fontSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        panelTabLeft.getAccessibleContext().setAccessibleName("jTabbedPane1");
        panelTabLeft.getAccessibleContext().setAccessibleDescription("");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        javax.swing.GroupLayout panelErroresLayout = new javax.swing.GroupLayout(panelErrores);
        panelErrores.setLayout(panelErroresLayout);
        panelErroresLayout.setHorizontalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelErroresLayout.setVerticalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        panelTabBottom.addTab("Errores", panelErrores);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane7.setViewportView(jTextArea6);

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        panelTabBottom.addTab("Resultados", panelResultados);

        barraDeOpciones.setBorder(null);
        barraDeOpciones.setForeground(new java.awt.Color(255, 255, 255));

        archivo_BDO.setText("Archivo");

        a_GuardarComo_BDO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        a_GuardarComo_BDO.setText("Guardar Como...");
        a_GuardarComo_BDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_GuardarComo_BDOActionPerformed(evt);
            }
        });
        archivo_BDO.add(a_GuardarComo_BDO);

        a_Abrir_BDO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        a_Abrir_BDO.setText("Abrir");
        a_Abrir_BDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_Abrir_BDOActionPerformed(evt);
            }
        });
        archivo_BDO.add(a_Abrir_BDO);

        a_Salir_BDO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        a_Salir_BDO.setBackground(new java.awt.Color(255, 102, 102));
        a_Salir_BDO.setText("Salir");
        a_Salir_BDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_Salir_BDOActionPerformed(evt);
            }
        });
        archivo_BDO.add(a_Salir_BDO);

        barraDeOpciones.add(archivo_BDO);

        editar_BDO.setText("Editar");
        barraDeOpciones.add(editar_BDO);

        formato_BDO.setText("Formato");
        barraDeOpciones.add(formato_BDO);

        compilar_BDO.setText("Compilar");

        c_Compilar_BDO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        c_Compilar_BDO.setText("Compilar");
        c_Compilar_BDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_Compilar_BDOActionPerformed(evt);
            }
        });
        compilar_BDO.add(c_Compilar_BDO);

        barraDeOpciones.add(compilar_BDO);

        ayuda_BDO.setText("Ayuda");
        ayuda_BDO.setName(""); // NOI18N
        barraDeOpciones.add(ayuda_BDO);

        setJMenuBar(barraDeOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabBottom))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabBottom)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void fontSizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fontSizeSpinnerStateChanged
        editorTextoPanel.setFont(new Font(editorTextoPanel.getFont().getFamily(), Font.PLAIN,(int) fontSizeSpinner.getValue()));
    }//GEN-LAST:event_fontSizeSpinnerStateChanged

    private void a_Salir_BDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_Salir_BDOActionPerformed
        System.exit(0);
    }//GEN-LAST:event_a_Salir_BDOActionPerformed

    //C??digo para guardar archivos
    private void a_GuardarComo_BDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_GuardarComo_BDOActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        int response = fileChooser.showSaveDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            File file;
            PrintWriter fileOut = null;

            file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            try {
                fileOut = new PrintWriter(file);
                fileOut.println(editorTextoPanel.getText());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                fileOut.close();
            }

        }
    }//GEN-LAST:event_a_GuardarComo_BDOActionPerformed

//C??digo para abrir archivos, editar
    private void a_Abrir_BDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_Abrir_BDOActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try{
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while(((linea=br.readLine())!=null)){
            texto+=linea+"\n";
        }
           editorTextoPanel.setText(texto);
           JOptionPane.showMessageDialog(null,"Archivo leido correctamente");
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_a_Abrir_BDOActionPerformed

/*C??digo para el compilador JAVACC, este recompila los archivos cada que se solicita la compilaci??n
    Busca a JAVACC desde su ruta absoluta para ser ejecutado por java y este a su vez compile el archivo correspondiente al compilador (MGCompiler.jj)
    JAVAC compila todos los archivos con extensi??n *.java
    Se ejecuta el c??digo compilado referente al compilador*/
    
    private void c_Compilar_BDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_Compilar_BDOActionPerformed
        
        //Comando para compilar MGCompiler.jj
        String[] commando = 
        {"java",
         "-cp",
         "C:/javac/javacc-7.0.10/bootstrap/javacc.jar", 
         "javacc", "-OUTPUT_DIRECTORY=./src/compiler" , 
         "./src/compiler/MGCompiler.jj"
        };
        
        //Comando para compilar los archivos con extensi??n .java
        String[] commando2 = 
        {"javac",
         "./src/compiler/*.java",
         "-d", "./src/compiler"
        };
        
        try {
            
            Process proc = new ProcessBuilder("java", "-cp", "C:/javac/javacc-7.0.10/bootstrap/javacc.jar", 
            "javacc", "-OUTPUT_DIRECTORY=./src/compiler", "./src/compiler/MGCompiler.jj").start();
            Process proc2 = new ProcessBuilder("javac", "-sourcepath", "./src/compiler/*.java", "-d", "./src/compiler").start();
            Process procx = new ProcessBuilder("javac", "-sourcepath", "./src/compiler/MGCompiler.java", "-d", "./src/compiler").start();
            Process proc3 = new ProcessBuilder("java", "-cp", "./src/compiler", "MGCompiler").redirectInput(new File("./src/compiler/code.txt")).start();
            
            //Para la lectura de las salidas de la terminal
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc3.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc3.getErrorStream()));
            
            //Para escribir la salida del analizador l??xico en un archivo txt
            FileWriter myWriter= new FileWriter("./src/compiler/Output.txt");
           
            //Lectura de la salida de cmd
            System.out.println("Salida de la linea de comandos:\n");
            
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                //Se escribe la salida del analizador l??xico en un txt
                myWriter.write(s+"\n");
            }
            myWriter.close();
            
            // Lectura de errores de la salida de cmd
            System.out.println("Salida de errores de la linea de comandos (Si existe alguno):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_c_Compilar_BDOActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem a_Abrir_BDO;
    private javax.swing.JMenuItem a_GuardarComo_BDO;
    private javax.swing.JMenuItem a_Salir_BDO;
    private javax.swing.JMenu archivo_BDO;
    private javax.swing.JMenu ayuda_BDO;
    private javax.swing.JMenuBar barraDeOpciones;
    private javax.swing.JMenuItem c_Compilar_BDO;
    private javax.swing.JMenu compilar_BDO;
    private javax.swing.JMenu editar_BDO;
    private javax.swing.JTextPane editorTextoPanel;
    private javax.swing.JSpinner fontSizeSpinner;
    private javax.swing.JMenu formato_BDO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JPanel panelCodInt;
    private javax.swing.JPanel panelErrores;
    private javax.swing.JPanel panelLexico;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelSemantico;
    private javax.swing.JPanel panelSintactico;
    private javax.swing.JTabbedPane panelTabBottom;
    private javax.swing.JTabbedPane panelTabLeft;
    // End of variables declaration//GEN-END:variables
}
