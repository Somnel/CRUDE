/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.helper.CadastroHelper;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Compaq
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form cadastro
     */
    public Cadastro() {
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

        jLabelCadastro = new javax.swing.JLabel();
        jLabelApelido = new javax.swing.JLabel();
        jFieldApelido = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jFieldSenha = new javax.swing.JPasswordField();
        jLinkLogin = new javax.swing.JLabel();
        jBtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCadastro.setText("Cadastro de Usuário");

        jLabelApelido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelApelido.setText("Apelido");

        jFieldApelido.setMinimumSize(new java.awt.Dimension(64, 30));

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha");

        jFieldSenha.setPreferredSize(new java.awt.Dimension(64, 30));
        jFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldSenhaActionPerformed(evt);
            }
        });

        jLinkLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLinkLogin.setText("Já é cadastrado?");
        jLinkLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLinkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLinkLoginMousePressed(evt);
            }
        });

        jBtnCadastrar.setText("CADASTRAR");
        jBtnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnCadastrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabelCadastro))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabelApelido))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jFieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabelSenha))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLinkLogin))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelCadastro)
                .addGap(48, 48, 48)
                .addComponent(jLabelApelido)
                .addGap(14, 14, 14)
                .addComponent(jFieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelSenha)
                .addGap(14, 14, 14)
                .addComponent(jFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLinkLogin)
                .addGap(30, 30, 30)
                .addComponent(jBtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldSenhaActionPerformed

    private void jLinkLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinkLoginMousePressed
        Login view = new Login();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLinkLoginMousePressed

    private void jBtnCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCadastrarMousePressed
        CadastroHelper helper = new CadastroHelper(this);
        helper.cadastrar();
    }//GEN-LAST:event_jBtnCadastrarMousePressed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JTextField jFieldApelido;
    private javax.swing.JPasswordField jFieldSenha;
    private javax.swing.JLabel jLabelApelido;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLinkLogin;
    // End of variables declaration//GEN-END:variables

    
    public JTextField getjFieldApelido() {
        return jFieldApelido;
    }

    public JPasswordField getjFieldSenha() {
        return jFieldSenha;
    }

    
}
