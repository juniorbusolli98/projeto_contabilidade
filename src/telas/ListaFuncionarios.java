/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
import model.Funcionario;
import dao.FuncionarioDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juniorbusolli
 */
public class ListaFuncionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaFuncionarios
     */
    public ListaFuncionarios() {
        initComponents();
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpLista = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnGerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tblFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jdpLista.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLista.setLayer(btnGerar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpListaLayout = new javax.swing.GroupLayout(jdpLista);
        jdpLista.setLayout(jdpListaLayout);
        jdpListaLayout.setHorizontalGroup(
            jdpListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpListaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnGerar)
                .addGap(25, 25, 25))
        );
        jdpListaLayout.setVerticalGroup(
            jdpListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpListaLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnGerar)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(jdpListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpLista)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpLista)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
       int linha = tblFuncionarios.getSelectedRow();
    valor = String.valueOf(tblFuncionarios.getValueAt(linha, 0));
    int i = Integer.parseInt(valor);
        ExibirFp funcionario = new ExibirFp(i);
        jdpLista.add(funcionario);
        funcionario.setVisible(true);
    }//GEN-LAST:event_btnGerarActionPerformed

    private void tblFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionariosMouseClicked
int linha = tblFuncionarios.getSelectedRow();
int coluna = tblFuncionarios.getSelectedColumn();     
    valor = String.valueOf(tblFuncionarios.getValueAt(linha, coluna));//; TODO add your handling code here:
    }//GEN-LAST:event_tblFuncionariosMouseClicked
    private void carregarTabela(){
    String[] colunas = {"Nome"};
        List<Funcionario> listaDeFuncionarios = FuncionarioDAO.getFuncionarios();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        
        for( Funcionario fun : listaDeFuncionarios ){
            Object[] obj = { fun.getNome() };
            modelo.addRow( obj );
            tblFuncionarios.setModel(modelo);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdpLista;
    private javax.swing.JTable tblFuncionarios;
    // End of variables declaration//GEN-END:variables
String valor;
}

