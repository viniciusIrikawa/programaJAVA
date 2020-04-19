/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import java.sql.*;         
import conexao.Conectar;      
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author ViniciusIrikawa
 */
public class Login extends javax.swing.JFrame {
   Connection conexao = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
   
    private void logar(){
        String sql = "select * from dados_usuarios where login = ? and senha = ?";
        try {
            pst = conexao.prepareStatement(sql); 
            pst.setString(1, campoUsuario.getText());
            pst.setString(2, new String(campoSenha.getPassword()));
            rs = pst.executeQuery();
            if (campoUsuario.getText().isEmpty()|| campoSenha.getPassword().length ==0){
                JOptionPane.showMessageDialog(rootPane,"Há campos não preenchidos!");
            }
            else if(rs.next()){
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }
            else{
                lblUsuario.setForeground(Color.red);
                lblSenha.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s)!");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Login() {
        initComponents();     
        conexao = Conectar.conector();
        //System.out.println(conexao);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBranco = new javax.swing.JPanel();
        panelVerde = new javax.swing.JPanel();
        txtTelaLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        panelBranco.setBackground(new java.awt.Color(255, 255, 255));
        panelBranco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBranco.setOpaque(false);

        panelVerde.setBackground(new java.awt.Color(0, 255, 102));

        txtTelaLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtTelaLogin.setForeground(new java.awt.Color(204, 0, 204));
        txtTelaLogin.setText("Tela de Login");

        javax.swing.GroupLayout panelVerdeLayout = new javax.swing.GroupLayout(panelVerde);
        panelVerde.setLayout(panelVerdeLayout);
        panelVerdeLayout.setHorizontalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtTelaLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerdeLayout.setVerticalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTelaLogin)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha:");

        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        campoSenha.setBackground(new java.awt.Color(153, 153, 153));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });

        campoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyPressed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBrancoLayout = new javax.swing.GroupLayout(panelBranco);
        panelBranco.setLayout(panelBrancoLayout);
        panelBrancoLayout.setHorizontalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBrancoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(18, 18, 18)
                        .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBrancoLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnLogar)
                        .addGap(31, 31, 31)
                        .addComponent(btnCadastrar)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBrancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair))
        );
        panelBrancoLayout.setVerticalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addComponent(panelVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogar)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelBranco);
        panelBranco.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
         logar();         
         
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastro cadastrar = new Cadastro();
        cadastrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void campoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }
    }//GEN-LAST:event_campoUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelBranco;
    private javax.swing.JPanel panelVerde;
    private javax.swing.JLabel txtTelaLogin;
    // End of variables declaration//GEN-END:variables
}
