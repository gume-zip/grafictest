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
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        Login = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        jTxtlogin = new javax.swing.JTextField();
        jTxtsenha = new javax.swing.JPasswordField();
        jbtnlogar = new javax.swing.JButton();
        jbtncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Caddstro");

        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Login.setText("Login:");

        Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Senha.setText("Senha:");

        jTxtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtloginActionPerformed(evt);
            }
        });

        jTxtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtsenhaActionPerformed(evt);
            }
        });

        jbtnlogar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnlogar.setMnemonic('l');
        jbtnlogar.setText("Logar");
        jbtnlogar.setToolTipText("Logar no sistema");
        jbtnlogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogarActionPerformed(evt);
            }
        });
        jbtnlogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnlogarKeyPressed(evt);
            }
        });

        jbtncancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtncancelar.setMnemonic('c');
        jbtncancelar.setText("Cancelar");
        jbtncancelar.setToolTipText("Cancelar o cadastro");
        jbtncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncancelarActionPerformed(evt);
            }
        });
        jbtncancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtncancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnlogar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jbtncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtlogin)
                    .addComponent(jTxtsenha))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(jTxtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(jTxtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtncancelar)
                    .addComponent(jbtnlogar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtloginActionPerformed

    private void jTxtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtsenhaActionPerformed

    private void jbtncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtncancelarActionPerformed

    private void jbtnlogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogarActionPerformed
        String seNHa = String.valueOf(jTxtsenha.getPassword());
        if (jTxtlogin.getText().equals("java")&& seNHa.equals("java")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha, incorretos!");
            jTxtlogin.setText(null);
            jTxtsenha.setText(null);
            jTxtlogin.requestFocus();
        }
    }//GEN-LAST:event_jbtnlogarActionPerformed

    private void jbtnlogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnlogarKeyPressed
         String seNHa = String.valueOf(jTxtsenha.getPassword());
        if (jTxtlogin.getText().equals("java")&& seNHa.equals("java")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha, incorretos!");
    }       
    }//GEN-LAST:event_jbtnlogarKeyPressed

    private void jbtncancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtncancelarKeyPressed
        System.exit(0);
    }//GEN-LAST:event_jbtncancelarKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Senha;
    private javax.swing.JTextField jTxtlogin;
    private javax.swing.JPasswordField jTxtsenha;
    private javax.swing.JButton jbtncancelar;
    private javax.swing.JButton jbtnlogar;
    // End of variables declaration//GEN-END:variables
}
