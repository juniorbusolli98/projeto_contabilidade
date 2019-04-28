
package telas;

import dao.FuncionarioDAO;
import java.sql.Time;
import model.Funcionario;

public class TelaDeCadastro extends javax.swing.JFrame {

    
    public TelaDeCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        rbnInsBaixo = new javax.swing.JRadioButton();
        jLabelsalarioLiquido = new javax.swing.JLabel();
        txtSalarioBruto = new javax.swing.JTextField();
        jLabelhorasExtras = new javax.swing.JLabel();
        txtHorasExtras = new javax.swing.JTextField();
        jLabelquantidadeDeFilhos = new javax.swing.JLabel();
        txtQuantidadeDeFilhos = new javax.swing.JTextField();
        jLabelnivelDeInsalubridade = new javax.swing.JLabel();
        jLabelPericulosidade = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblnome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        rbnInsMedio = new javax.swing.JRadioButton();
        rbnInsAlto = new javax.swing.JRadioButton();
        cbPericulosidade = new javax.swing.JCheckBox();
        jLabelInss = new javax.swing.JLabel();
        cbInss = new javax.swing.JCheckBox();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(rbnInsBaixo);
        rbnInsBaixo.setText("10%");
        rbnInsBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnInsBaixoActionPerformed(evt);
            }
        });

        jLabelsalarioLiquido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsalarioLiquido.setText("Salario  (Bruto)");

        txtSalarioBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioBrutoActionPerformed(evt);
            }
        });

        jLabelhorasExtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelhorasExtras.setText("Horas Extras");

        txtHorasExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasExtrasActionPerformed(evt);
            }
        });

        jLabelquantidadeDeFilhos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelquantidadeDeFilhos.setText("Quantidade de filhos");

        txtQuantidadeDeFilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeDeFilhosActionPerformed(evt);
            }
        });

        jLabelnivelDeInsalubridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelnivelDeInsalubridade.setText("Nivel de Insalubridade");

        jLabelPericulosidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPericulosidade.setText("Periculosidade");

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnome.setText("Nome");

        buttonGroup1.add(rbnInsMedio);
        rbnInsMedio.setText("20%");
        rbnInsMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnInsMedioActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnInsAlto);
        rbnInsAlto.setText("40%");

        jLabelInss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInss.setText("Inss");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelhorasExtras)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelnivelDeInsalubridade)
                            .addGap(18, 18, 18)
                            .addComponent(rbnInsBaixo)
                            .addGap(18, 18, 18)
                            .addComponent(rbnInsMedio)
                            .addGap(18, 18, 18)
                            .addComponent(rbnInsAlto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelquantidadeDeFilhos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantidadeDeFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelInss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPericulosidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbPericulosidade)
                                .addComponent(cbInss))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelsalarioLiquido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblnome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsalarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelhorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantidadeDeFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeDeFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnivelDeInsalubridade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnInsBaixo)
                    .addComponent(rbnInsMedio)
                    .addComponent(rbnInsAlto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPericulosidade)
                    .addComponent(cbPericulosidade))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInss)
                    .addComponent(cbInss))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Funcionario tela = new Funcionario();
       double salario;
        tela.setNome(txtnome.getText());
        tela.setFilhos(Integer.parseInt(txtQuantidadeDeFilhos.getText()));
        tela.setHorasExtras(Double.parseDouble(txtHorasExtras.getText()));
        if(rbnInsBaixo.isSelected()){
            tela.setNivelDeInsalubridade(10);
        }else if(rbnInsMedio.isSelected()){
            tela.setNivelDeInsalubridade(20);
        }else tela.setNivelDeInsalubridade(40);
        tela.setPericulosidade(cbPericulosidade.isSelected());
        salario = Integer.parseInt(txtSalarioBruto.getText());
        
        if(tela.getInss()){
            
        }
        
        if(tela.getPericulosidade()){
            salario = salario + 0.3*salario;
        }
        switch(tela.getNivelDeInsalubridade()){
            case 10: salario = salario + 119.6;
                    tela.setSalarioBruto(salario);
                    break;
            case 20: salario = salario + 232.2;
                    tela.setSalarioBruto(salario);
                    break;
            case 40: salario = salario + 478.4;
                    tela.setSalarioBruto(salario);
                    break;
        }
        
        FuncionarioDAO.inserir(tela);
         
        

        
        
        
        
        

      
      
      
      
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtHorasExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasExtrasActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void txtQuantidadeDeFilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeDeFilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeDeFilhosActionPerformed

    private void rbnInsBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnInsBaixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnInsBaixoActionPerformed

    private void rbnInsMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnInsMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnInsMedioActionPerformed

    private void txtSalarioBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioBrutoActionPerformed

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
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbInss;
    private javax.swing.JCheckBox cbPericulosidade;
    private javax.swing.JLabel jLabelInss;
    private javax.swing.JLabel jLabelPericulosidade;
    private javax.swing.JLabel jLabelhorasExtras;
    private javax.swing.JLabel jLabelnivelDeInsalubridade;
    private javax.swing.JLabel jLabelquantidadeDeFilhos;
    private javax.swing.JLabel jLabelsalarioLiquido;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblnome;
    private javax.swing.JRadioButton rbnInsAlto;
    private javax.swing.JRadioButton rbnInsBaixo;
    private javax.swing.JRadioButton rbnInsMedio;
    private javax.swing.JTextField txtHorasExtras;
    private javax.swing.JTextField txtQuantidadeDeFilhos;
    private javax.swing.JTextField txtSalarioBruto;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
