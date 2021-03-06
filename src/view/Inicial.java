/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import conexao.Conectar;     //bibliotecas para a conexao
import java.awt.Color;

/**
 *
 * @author ViniciusIrikawa
 */
public class Inicial extends javax.swing.JFrame {
   Connection conexao = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        conexao = Conectar.conector();      //chama o metodo conector da classe Conectar
        //System.out.println(conexao);      //printa a conexao  
        if(conexao != null){                //verifica se ha conexao 
            labelStatus.setText("Conectado"); 
            labelStatus.setForeground(Color.green);
        }
        else{
            labelStatus.setText("Não conectado");
            labelStatus.setForeground(Color.red);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBranco = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCadastrarInicial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seja Bem-Vindo!");
        getContentPane().setLayout(null);

        panelAzul.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seja Bem-Vindo!");

        javax.swing.GroupLayout panelAzulLayout = new javax.swing.GroupLayout(panelAzul);
        panelAzul.setLayout(panelAzulLayout);
        panelAzulLayout.setHorizontalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(panelAzul);
        panelAzul.setBounds(0, 0, 400, 100);

        panelBranco.setBackground(new java.awt.Color(255, 255, 255));
        panelBranco.setMinimumSize(new java.awt.Dimension(400, 300));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCadastrarInicial.setText("Cadastrar");
        btnCadastrarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarInicialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Selecione uma das opções abaixo:");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Servidor:");
        jLabel6.setToolTipText("");

        labelStatus.setForeground(new java.awt.Color(0, 0, 0));
        labelStatus.setText("Status");

        javax.swing.GroupLayout panelBrancoLayout = new javax.swing.GroupLayout(panelBranco);
        panelBranco.setLayout(panelBrancoLayout);
        panelBrancoLayout.setHorizontalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(39, 39, 39)
                .addComponent(btnCadastrarInicial)
                .addGap(111, 111, 111))
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBrancoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBrancoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStatus)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelBrancoLayout.setVerticalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCadastrarInicial))
                .addGap(55, 55, 55)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelStatus))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(panelBranco);
        panelBranco.setBounds(0, 100, 400, 200);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastrarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarInicialActionPerformed
        // TODO add your handling code here:
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarInicialActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarInicial;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelBranco;
    // End of variables declaration//GEN-END:variables
}
