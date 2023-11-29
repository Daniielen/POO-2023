/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import conexao.ConexaoMySQL;
import dao.CanetaDAO;
import dao.DAOFactory;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Caneta;
/**
 *
 * @author aluno
 */
public class frmPrincipal extends javax.swing.JFrame {
    CanetaDAO canetaDAO = DAOFactory.criarCanetaDAO();
    private DefaultTableModel modelo = null;
    
    /**
     * Creates new form frmPrincipal
     */
    Connection conexao = null;
    public frmPrincipal() throws Exception {
        initComponents();
        
        modelo = (DefaultTableModel) tblCaneta.getModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Modelo");
        modelo.addColumn("Cor");
        modelo.addColumn("Ponta");
        modelo.addColumn("Carga");
        modelo.addColumn("Tampada");
        
        conexao = ConexaoMySQL.getConexao();
        
        if (conexao == null) {
             lblMensagem.setText("Sem conexao com o banco de dados");
        } else {
            // lblMensagem.setText("Aplicação conectada ao banco");
        }
    }
    
    public void editar () {
        try {
            int codigo = (Integer) modelo.getValueAt(tblCaneta.getSelectedRow(), 0);
            String modelo_caneta = (String) modelo.getValueAt(tblCaneta.getSelectedRow(), 1);
            String cor = (String) modelo.getValueAt(tblCaneta.getSelectedRow(), 2);
            Float ponta = (Float) modelo.getValueAt(tblCaneta.getSelectedRow(), 3);
            int carga = (Integer) modelo.getValueAt(tblCaneta.getSelectedRow(), 4);
            Boolean tampada = (Boolean) modelo.getValueAt(tblCaneta.getSelectedRow(), 5);
        
            Caneta caneta = new Caneta();
            
            caneta.setCodigo(codigo);
            caneta.setModelo(modelo_caneta);
            caneta.setCor(cor);
            caneta.setPonta(ponta);
            caneta.setCarga(carga);
            caneta.setTampada(tampada);
            
            new frmCaneta(caneta).setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Por favor, selecionar uma linha da tabela");
        }
    }
    
    private void preencherTabela() {
        modelo.getDataVector().clear();
        try {
            for (Caneta caneta : canetaDAO.listar()) {
                modelo.addRow(new Object[]{caneta.getCodigo(), caneta.getModelo(), caneta.getCor(),
                            caneta.getPonta(), caneta.getCarga(), caneta.getTampada()});
            }
        } catch (Exception e) {
            throw e;
        }
    }
    private void apagar() {
       try {
           Integer id = (Integer) modelo.getValueAt(tblCaneta.getSelectedRow(), 0);

           int linha = canetaDAO.apagar(id);
           if (linha > 0) {
               modelo.removeRow(tblCaneta.getSelectedRow());
               JOptionPane.showMessageDialog(this, "Item excluído com sucesso!");
           } else {
               JOptionPane.showMessageDialog(this, "Erro ao excluir.");
           }

       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Por favor, selecionar uma linha da tabela");
       } 
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tblCaneta = new javax.swing.JTable();
        btnInserir = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        btnApagar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(205, 221, 238));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        scroll.setBackground(new java.awt.Color(204, 204, 255));
        scroll.setForeground(new java.awt.Color(255, 255, 255));
        scroll.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scrollFocusGained(evt);
            }
        });

        tblCaneta.setBackground(new java.awt.Color(222, 235, 250));
        tblCaneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCaneta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scroll.setViewportView(tblCaneta);

        btnInserir.setBackground(new java.awt.Color(140, 164, 246));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(140, 164, 246));
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnApagar.setBackground(new java.awt.Color(140, 164, 246));
        btnApagar.setText("Apagar");
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(204, 207, 255));
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblMensagem.setForeground(new java.awt.Color(255, 102, 102));
        lblMensagem.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblMensagem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(146, Short.MAX_VALUE)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagar, btnEditar, btnInserir, btnSair});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnEditar)
                    .addComponent(btnApagar)
                    .addComponent(btnSair))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_btnSairMouseClicked

    private void scrollFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scrollFocusGained
        
    }//GEN-LAST:event_scrollFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencherTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked

    }//GEN-LAST:event_btnApagarMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Object[] opcao = {"Não", "Sim"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente apagar?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 1) {
            apagar();
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        new frmCaneta(null).setVisible(true);
    }//GEN-LAST:event_btnInserirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmPrincipal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnApagar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnInserir;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblCaneta;
    // End of variables declaration//GEN-END:variables
}
