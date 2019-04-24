/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.FuncionarioDAO;
import model.Funcionario;

/**
 *
 * @author juniorbusolli
 */
public class ExibirFp extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExibirFp
     */
    public ExibirFp() {
        initComponents();
    }
public ExibirFp(int i){
    initComponents();
    carregarDados(i);
}
  public void carregarDados(int i){
        Funcionario FuncionarioDAO = null;
      Funcionario func = FuncionarioDAO;
      lblNome.setText(func.getNome());
      lblFilhos.setText(String.valueOf(func.getQuantidadeDeFilhos()));
      lblInsalubridade.setText(String.valueOf(func.getNivelDeInsalubridade()));
      lblHorasExtras.setText(String.valueOf(func.getHorasExtras()));
      lblLiquido.setText(String.valueOf((func.getSalarioLiquido())));
      lblBruto.setText(String.valueOf(func.getSalarioBruto()));
      cbPericulosidade.setSelected(func.getPericulosidade());
      System.out.println(func.getPericulosidade());
      
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label55 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        labelSKRR = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblFilhos = new javax.swing.JLabel();
        cbPericulosidade = new javax.swing.JCheckBox();
        lblInsalubridade = new javax.swing.JLabel();
        lblHorasExtras = new javax.swing.JLabel();
        lblBruto = new javax.swing.JLabel();
        lblLiquido = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        label.setText("Nome:");

        label55.setText("Salario Bruto:");

        label1.setText("Filhos:");

        label2.setText("Periculosidade:");

        label3.setText("Nivel de Insalubridade:");

        label4.setText("Horas Extras:");

        labelSKRR.setText("Salario Liquido:");

        lblNome.setText("jLabel1");

        lblFilhos.setText("jLabel1");

        lblInsalubridade.setText("jLabel1");

        lblHorasExtras.setText("jLabel1");

        lblBruto.setText("jLabel1");

        lblLiquido.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(cbPericulosidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(18, 18, 18)
                                .addComponent(lblInsalubridade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(18, 18, 18)
                                .addComponent(lblHorasExtras))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label)
                                .addGap(18, 18, 18)
                                .addComponent(lblNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(18, 18, 18)
                                .addComponent(lblFilhos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSKRR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLiquido)
                                .addGap(0, 104, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(lblFilhos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(cbPericulosidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(lblInsalubridade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(lblHorasExtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label55)
                    .addComponent(lblBruto))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSKRR)
                    .addComponent(lblLiquido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbPericulosidade;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label55;
    private javax.swing.JLabel labelSKRR;
    private javax.swing.JLabel lblBruto;
    private javax.swing.JLabel lblFilhos;
    private javax.swing.JLabel lblHorasExtras;
    private javax.swing.JLabel lblInsalubridade;
    private javax.swing.JLabel lblLiquido;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
