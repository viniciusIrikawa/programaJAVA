/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import java.sql.*;
import conexao.Conectar;

/**
 *
 * @author user
 */
public class Cadastro extends javax.swing.JFrame {
   Connection conexao = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
   
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        conexao = Conectar.conector();
        //System.out.println(conexao);
    }
    private void adicionar(){
        String sql = "insert into dados_usuarios(login, senha)values(?,?)";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioCadastro.getText());
            pst.setString(2, new String(txtConfirmar.getPassword()));
           
           
            if(txtUsuarioCadastro.getText().isEmpty()||txtSenhaCadastro.getPassword().length ==0 ||
            txtConfirmar.getPassword().length == 0){
        JOptionPane.showMessageDialog(rootPane, "Há campos não preenchidos!");
    }else{
        if (new String(txtSenhaCadastro.getPassword()).equals(new String(txtConfirmar.getPassword()))){
            JOptionPane.showMessageDialog(null, "Cadastro efetuado!");
            pst.executeUpdate();
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();}
            else{
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
        }
    }         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        txtUsuarioCadastro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmar = new javax.swing.JPasswordField();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        radioMedico = new javax.swing.JRadioButton();
        radioEnfermeiro = new javax.swing.JRadioButton();
        radioUsuario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tela de Cadastro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 100);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome de Usuário:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 130, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nova senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 140, 87, 19);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(80, 340, 100, 32);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar);
        btnLimpar.setBounds(200, 340, 100, 32);

        txtSenhaCadastro.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtSenhaCadastro);
        txtSenhaCadastro.setBounds(150, 140, 230, 22);

        txtUsuarioCadastro.setBackground(new java.awt.Color(153, 153, 153));
        txtUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuarioCadastro);
        txtUsuarioCadastro.setBounds(150, 106, 230, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirmar senha:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 170, 140, 19);

        txtConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        txtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfirmar);
        txtConfirmar.setBounds(150, 170, 230, 22);

        radioMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(radioMasc);
        radioMasc.setForeground(new java.awt.Color(0, 0, 0));
        radioMasc.setText("Masc.");
        radioMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMascActionPerformed(evt);
            }
        });
        jPanel1.add(radioMasc);
        radioMasc.setBounds(10, 250, 80, 20);

        radioFem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(radioFem);
        radioFem.setForeground(new java.awt.Color(0, 0, 0));
        radioFem.setText("Fem.");
        radioFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemActionPerformed(evt);
            }
        });
        jPanel1.add(radioFem);
        radioFem.setBounds(100, 250, 70, 20);

        radioMedico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMedico);
        radioMedico.setForeground(new java.awt.Color(0, 0, 0));
        radioMedico.setText("Médico");
        radioMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(radioMedico);
        radioMedico.setBounds(10, 210, 80, 20);

        radioEnfermeiro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioEnfermeiro);
        radioEnfermeiro.setForeground(new java.awt.Color(0, 0, 0));
        radioEnfermeiro.setText("Enferm.");
        radioEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermeiroActionPerformed(evt);
            }
        });
        jPanel1.add(radioEnfermeiro);
        radioEnfermeiro.setBounds(100, 210, 80, 20);

        radioUsuario.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioUsuario);
        radioUsuario.setForeground(new java.awt.Color(0, 0, 0));
        radioUsuario.setText("Usuário");
        radioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(radioUsuario);
        radioUsuario.setBounds(200, 210, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 390);

        setSize(new java.awt.Dimension(412, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadastroActionPerformed

    private void txtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarActionPerformed

    private void radioMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMascActionPerformed

    private void radioFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemActionPerformed

    private void radioMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMedicoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_radioMedicoActionPerformed

    private void radioEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEnfermeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEnfermeiroActionPerformed

    private void radioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtUsuarioCadastro.setText(null);
        txtSenhaCadastro.setText(null);
        txtConfirmar.setText(null);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
       
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        adicionar();
       /* if(txtUsuarioCadastro.getText().isEmpty()||txtSenhaCadastro.getPassword().length ==0 ||
                txtConfirmar.getPassword().length == 0){
            JOptionPane.showMessageDialog(rootPane, "Há campos não preenchidos!");
        }else{
            if (new String(txtSenhaCadastro.getPassword()).equals(new String(txtConfirmar.getPassword())))
                JOptionPane.showMessageDialog(null, "Cadastro efetuado!");
            else{
                JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
            }
        }*/
    }//GEN-LAST:event_btnCadastrarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radioEnfermeiro;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.JRadioButton radioMedico;
    private javax.swing.JRadioButton radioUsuario;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JPasswordField txtSenhaCadastro;
    private javax.swing.JTextField txtUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
}
