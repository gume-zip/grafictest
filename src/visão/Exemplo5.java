/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo5 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo5
     */
    public Exemplo5() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRdbMasculino = new javax.swing.JRadioButton();
        jRdbFeminino = new javax.swing.JRadioButton();
        JBtnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jRdbMasculino);
        jRdbMasculino.setText("Masculino");
        jRdbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRdbFeminino);
        jRdbFeminino.setText("Feminino");
        jRdbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbFemininoActionPerformed(evt);
            }
        });

        JBtnVerificar.setText("Verificar");
        JBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnVerificar)
                    .addComponent(jRdbFeminino)
                    .addComponent(jRdbMasculino))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jRdbMasculino)
                .addGap(18, 18, 18)
                .addComponent(jRdbFeminino)
                .addGap(62, 62, 62)
                .addComponent(JBtnVerificar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRdbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdbMasculinoActionPerformed

    private void jRdbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdbFemininoActionPerformed

    private void JBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnVerificarActionPerformed
        if(jRdbFeminino.isSelected()){
            JOptionPane.showMessageDialog(null, "Feminino Selecionado");
        } else if(jRdbMasculino.isSelected()){
            JOptionPane.showMessageDialog(null, "Masculino Selecionado");
        }
    }//GEN-LAST:event_JBtnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnVerificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRdbFeminino;
    private javax.swing.JRadioButton jRdbMasculino;
    // End of variables declaration//GEN-END:variables
}
