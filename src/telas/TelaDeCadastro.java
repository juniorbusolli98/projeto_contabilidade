
package telas;

import model.ModeloTelaDeCadastroFuncionario;

public class TelaDeCadastro extends javax.swing.JFrame {

    
    public TelaDeCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelsalarioLiquido = new javax.swing.JLabel();
        txtSalarioLiquido = new javax.swing.JTextField();
        jLabelhorasExtras = new javax.swing.JLabel();
        txtHorasExtras = new javax.swing.JTextField();
        jLabelquantidadeDeFilhos = new javax.swing.JLabel();
        txtQuantidadeDeFilhos = new javax.swing.JTextField();
        jLabelnivelDeInsalubridade = new javax.swing.JLabel();
        RBinsalubridadeSim = new javax.swing.JRadioButton();
        RBInsalubridadeNao = new javax.swing.JRadioButton();
        jTextFieldNivelDeInsalubridade = new javax.swing.JTextField();
        jLabelPericulosidade = new javax.swing.JLabel();
        RBPericulosidadeSim = new javax.swing.JRadioButton();
        RBPericulosidadeNao = new javax.swing.JRadioButton();
        jButtonGerar = new javax.swing.JButton();
        jLabelsalarioBruto = new javax.swing.JLabel();
        txtSalarioBruto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelsalarioLiquido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsalarioLiquido.setText("Salario Liquido");

        jLabelhorasExtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelhorasExtras.setText("Horas Extras");

        jLabelquantidadeDeFilhos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelquantidadeDeFilhos.setText("Quantidade de filhos");

        jLabelnivelDeInsalubridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelnivelDeInsalubridade.setText("Nivel de Insalubridade");

        RBinsalubridadeSim.setText("Sim");
        RBinsalubridadeSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBinsalubridadeSimActionPerformed(evt);
            }
        });

        RBInsalubridadeNao.setText("Não");

        jLabelPericulosidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPericulosidade.setText("Periculosidade");

        RBPericulosidadeSim.setText("Sim");

        RBPericulosidadeNao.setText("Não");

        jButtonGerar.setText("Gerar");
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });

        jLabelsalarioBruto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsalarioBruto.setText("Salario Bruto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelquantidadeDeFilhos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantidadeDeFilhos, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelhorasExtras)
                                .addComponent(jLabelsalarioLiquido)
                                .addComponent(jLabelsalarioBruto))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSalarioLiquido)
                                .addComponent(txtHorasExtras, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(txtSalarioBruto))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelnivelDeInsalubridade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBinsalubridadeSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBInsalubridadeNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNivelDeInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonGerar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPericulosidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBPericulosidadeSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBPericulosidadeNao)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsalarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsalarioBruto)
                    .addComponent(txtSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelhorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantidadeDeFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeDeFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBinsalubridadeSim)
                        .addComponent(RBInsalubridadeNao)
                        .addComponent(jTextFieldNivelDeInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelnivelDeInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPericulosidade)
                    .addComponent(RBPericulosidadeSim)
                    .addComponent(RBPericulosidadeNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtonGerar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed
        ModeloTelaDeCadastroFuncionario tela = new ModeloTelaDeCadastroFuncionario();
        tela.setsalarioLiquido(txtSalarioLiquido.getText());
        tela.setsalarioBruto(txtSalarioBruto.getText());
        tela.setquantidadeDeFilhos(txtQuantidadeDeFilhos.getText());
        tela.sethorasExtras(txtHorasExtras.getText());
        
        FolhaDePagamento frm = new FolhaDePagamento();
        
        frm.exportarComponentes(tela);
        frm.setVisible(true);
      
      
      
      
    }//GEN-LAST:event_jButtonGerarActionPerformed

    private void RBinsalubridadeSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBinsalubridadeSimActionPerformed
        txtSalarioLiquido.setVisible( true );
        txtSalarioBruto.setVisible( true );
        txtQuantidadeDeFilhos.setVisible( true );
        txtHorasExtras.setVisible( true );
    }//GEN-LAST:event_RBinsalubridadeSimActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBInsalubridadeNao;
    private javax.swing.JRadioButton RBPericulosidadeNao;
    private javax.swing.JRadioButton RBPericulosidadeSim;
    private javax.swing.JRadioButton RBinsalubridadeSim;
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JLabel jLabelPericulosidade;
    private javax.swing.JLabel jLabelhorasExtras;
    private javax.swing.JLabel jLabelnivelDeInsalubridade;
    private javax.swing.JLabel jLabelquantidadeDeFilhos;
    private javax.swing.JLabel jLabelsalarioBruto;
    private javax.swing.JLabel jLabelsalarioLiquido;
    private javax.swing.JTextField jTextFieldNivelDeInsalubridade;
    private javax.swing.JTextField txtHorasExtras;
    private javax.swing.JTextField txtQuantidadeDeFilhos;
    private javax.swing.JTextField txtSalarioBruto;
    private javax.swing.JTextField txtSalarioLiquido;
    // End of variables declaration//GEN-END:variables
}
