/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author user
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        panelBrancoPrincipal = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelInternal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadMedicos = new javax.swing.JMenuItem();
        cadEnfermeiras = new javax.swing.JMenuItem();
        cadUsuarios = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuFerramentas = new javax.swing.JMenu();
        telaBemVindo = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Principal");
        getContentPane().setLayout(null);

        panelBrancoPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame1.setTitle("Bem-Vindo!");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        panelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInternal.setLayout(null);
        jInternalFrame1.getContentPane().add(panelInternal);
        panelInternal.setBounds(0, 40, 400, 130);

        javax.swing.GroupLayout panelBrancoPrincipalLayout = new javax.swing.GroupLayout(panelBrancoPrincipal);
        panelBrancoPrincipal.setLayout(panelBrancoPrincipalLayout);
        panelBrancoPrincipalLayout.setHorizontalGroup(
            panelBrancoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        panelBrancoPrincipalLayout.setVerticalGroup(
            panelBrancoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBrancoPrincipalLayout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelBrancoPrincipal);
        panelBrancoPrincipal.setBounds(0, -20, 400, 300);

        menuCadastro.setForeground(new java.awt.Color(0, 0, 0));
        menuCadastro.setText("Cadastros");

        cadMedicos.setText("Médicos");
        cadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadMedicosActionPerformed(evt);
            }
        });
        menuCadastro.add(cadMedicos);

        cadEnfermeiras.setText("Enfermeiras");
        menuCadastro.add(cadEnfermeiras);

        cadUsuarios.setText("Usuários");
        menuCadastro.add(cadUsuarios);

        jMenuBar1.add(menuCadastro);

        menuRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        menuRelatorio.setText("Relatórios");
        jMenuBar1.add(menuRelatorio);

        menuFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        menuFerramentas.setText("Ferramentas");

        telaBemVindo.setText("Tela Inicial");
        telaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaBemVindoActionPerformed(evt);
            }
        });
        menuFerramentas.add(telaBemVindo);

        jMenuBar1.add(menuFerramentas);

        menuSair.setForeground(new java.awt.Color(0, 0, 0));
        menuSair.setText("Sair");

        jMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        menuSair.add(jMenuSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadMedicosActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void telaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaBemVindoActionPerformed
        // TODO add your handling code here:
        Inicial telaInicial = new Inicial();
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_telaBemVindoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadEnfermeiras;
    private javax.swing.JMenuItem cadMedicos;
    private javax.swing.JMenuItem cadUsuarios;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPanel panelBrancoPrincipal;
    private javax.swing.JPanel panelInternal;
    private javax.swing.JMenuItem telaBemVindo;
    // End of variables declaration//GEN-END:variables
}