package proyecto2;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import net.sourceforge.barbecue.*;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Ramirez
 */
public class Codigo extends javax.swing.JFrame {

    /**
     * Creates new form Codigo
     */
    public Codigo() {
        initComponents();
    }
    
    Crear c = new Crear();
    Barcode barcode = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        genA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        genA.setText("Generar Aleatorio");
        genA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addGap(245, 245, 245)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Generar)
                        .addGap(50, 50, 50)
                        .addComponent(genA))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generar)
                    .addComponent(genA))
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if(barcode != null){
            try{
                FileOutputStream fos = new FileOutputStream("C:\\Users\\ADRIANA\\Desktop\\POO\\Proyecto2\\src\\proyecto2/"+barcode+".png");
                try{
                    BarcodeImageHandler.writePNG(barcode, fos);
                }
                catch(Exception a){
                    
                }
            }
            catch(Exception a){
            
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No se guardo ningun codigo", null, 2);
        }
        
        this.setVisible(false);
        //c.setVisible(true);
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
        //c.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        int t = Integer.valueOf(ingresar.getText());
        
        if(t < 999999999){
            try{
                barcode = BarcodeFactory.createCode39(ingresar.getText(), true);
            }
            catch(Exception e){

            }

            barcode.setDrawingText(true);
            barcode.setBarWidth(2);
            barcode.setBarHeight(60);
            BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D a = (Graphics2D) image.getGraphics();


            try{
                barcode.draw(a, 2, 10);
            }
            catch(Exception e){

            }

            ImageIcon i = new ImageIcon(image);
            jLabel1.setIcon(i);
            
            jLabel1.setText("");
        }
        else{
            jLabel1.setText("N??mero no valido");
            jLabel1.setIcon(null);
        }
        
    }//GEN-LAST:event_GenerarActionPerformed

    private void genAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genAActionPerformed
        Random r = new Random();
        
        int ga = r.nextInt(999999000)+999;
        String n = String.valueOf(ga);
        
        try{
            barcode = BarcodeFactory.createCode39(n, true);
        }
        catch(Exception e){
            
        }
        
        barcode.setDrawingText(true);
        barcode.setBarWidth(2);
        barcode.setBarHeight(60);
        BufferedImage image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D a = (Graphics2D) image.getGraphics();
        
        try{
            barcode.draw(a, 2, 10);
        }
        catch(Exception e){
            
        }
        
        ImageIcon i = new ImageIcon(image);
        jLabel1.setIcon(i);
    }//GEN-LAST:event_genAActionPerformed

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
            java.util.logging.Logger.getLogger(Codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton genA;
    private javax.swing.JTextField ingresar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
