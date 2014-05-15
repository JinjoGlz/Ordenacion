/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visual;
import Datos.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jinjo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Archivos archivos= new Archivos();
    Fila[] datos;
      final JFileChooser fc = new JFileChooser();
      private Tiempo reloj= new  Tiempo();
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCargar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelComparaciones = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemBurbuja = new javax.swing.JMenuItem();
        jMenuItemShell = new javax.swing.JMenuItem();
        jMenuItemInsercion = new javax.swing.JMenuItem();
        jMenuItemQuickSort = new javax.swing.JMenuItem();
        jMenuItemShaker = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCargar.setText("Cargar Archivo");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar Archivo");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Comparaciones");

        jLabel2.setText("Tiempo (milisegundos)");

        jLabelComparaciones.setForeground(new java.awt.Color(255, 0, 0));

        jLabelTiempo.setForeground(new java.awt.Color(204, 0, 0));

        jMenu1.setText("Ordenar:");

        jMenuItemBurbuja.setText("Burbuja");
        jMenuItemBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBurbujaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemBurbuja);

        jMenuItemShell.setText("Shell");
        jMenu1.add(jMenuItemShell);

        jMenuItemInsercion.setText("Insercion");
        jMenuItemInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsercionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemInsercion);

        jMenuItemQuickSort.setText("QuickSort");
        jMenuItemQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuickSortActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemQuickSort);

        jMenuItemShaker.setText("Shaker");
        jMenuItemShaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShakerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemShaker);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCargar)
                    .addComponent(jButtonGuardar))
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jLabelComparaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCargar)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        File f=null;
        int returnVal = fc.showOpenDialog(this);
        
       if(returnVal==0){
          f=fc.getSelectedFile();
          datos=archivos.leer(datos, f);
       }
         
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(archivos.isCargado()){
        File f=null;
         fc.setSelectedFile(new File("Datos Ordenados.csv"));
        int returnVal = fc.showSaveDialog(this);
        
       if(returnVal==0){
          f=fc.getSelectedFile();
          archivos.escribir(datos, f);
       
        }}else{
            
            JOptionPane.showMessageDialog(null, "Cargue un archivo antes de ordenar");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jMenuItemQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuickSortActionPerformed
        if(archivos.isCargado()){
            
            reloj.inicio();
            int a=QuickSort.quicksort(datos, 0, datos.length-1,0);
            reloj.termina();
            jLabelTiempo.setText(reloj.diferencia());
            jLabelComparaciones.setText(""+a);
        }else{
            
            JOptionPane.showMessageDialog(null, "Cargue un archivo antes de ordenar");
        }
    }//GEN-LAST:event_jMenuItemQuickSortActionPerformed

    private void jMenuItemInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsercionActionPerformed
        if(archivos.isCargado()){
            reloj.inicio();
            int a=Insercion.insercion(datos,0);
            reloj.termina();
            jLabelTiempo.setText(reloj.diferencia());
            jLabelComparaciones.setText(""+a);
        }else{
            
            JOptionPane.showMessageDialog(null, "Cargue un archivo antes de ordenar");
        }
    }//GEN-LAST:event_jMenuItemInsercionActionPerformed

    private void jMenuItemShakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShakerActionPerformed
        if(archivos.isCargado()){
            reloj.inicio();
            int a=Shaker.ordenacionShaker(datos,0);
            reloj.termina();
            jLabelTiempo.setText(reloj.diferencia());
            jLabelComparaciones.setText(""+a);
        }else{
            
            JOptionPane.showMessageDialog(null, "Cargue un archivo antes de ordenar");
        }
    }//GEN-LAST:event_jMenuItemShakerActionPerformed

    private void jMenuItemBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBurbujaActionPerformed
        if(archivos.isCargado()){
            reloj.inicio();
            int a=Burbuja.burbuja(datos,0);
            reloj.termina();
            jLabelTiempo.setText(reloj.diferencia());
            jLabelComparaciones.setText(""+a);
        }else{
            
            JOptionPane.showMessageDialog(null, "Cargue un archivo antes de ordenar");
        }
    }//GEN-LAST:event_jMenuItemBurbujaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
         });}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelComparaciones;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBurbuja;
    private javax.swing.JMenuItem jMenuItemInsercion;
    private javax.swing.JMenuItem jMenuItemQuickSort;
    private javax.swing.JMenuItem jMenuItemShaker;
    private javax.swing.JMenuItem jMenuItemShell;
    // End of variables declaration//GEN-END:variables
}
