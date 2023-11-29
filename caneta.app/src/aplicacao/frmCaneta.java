
package aplicacao;

import dao.CanetaDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Caneta;
/**
 *
 * @author Danielen Santana
 * @since 04/10/2023
 * @details Criação da frmCaneta a partir do exemplo demonstrado no slide
 * @note Exemplo criado no curso de Programação Orientada a Objeto 
 * ministrada pelo professor Dr.Fabio Marques.
 */
public class frmCaneta extends javax.swing.JFrame {

    Caneta caneta = new Caneta();
    CanetaDAO canetaDAO = DAOFactory.criarCanetaDAO();
    
    public frmCaneta(Caneta caneta) {
        initComponents();
        
        this.caneta = caneta; 
        
        if (this.caneta != null) {
            btnSalvar.setText("Editar");
            
            txtModelo.setText(this.caneta.getModelo());
            
            String cor = this.caneta.getCor();
            
            Float ponta = this.caneta.getPonta();
            
            if (cor.equals(rbAzul.getText())) {
                rbAzul.setSelected(true);
            } else if (cor.equals(rbVermelha.getText())) {
                rbVermelha.setSelected(true);
            } else if (cor.equals(rbPreta.getText())) {
                rbPreta.setSelected(true);
            } else {
                rbVerde.setSelected(true);
            }
           
            if (ponta == (Float.parseFloat(rb07.getText()))) {
                rb07.setSelected(true);
            } else if (ponta.equals(Float.parseFloat(rb10.getText()))) {
                rb10.setSelected(true);
            } else if (ponta.equals(Float.parseFloat(rb14.getText()))) {
                rb14.setSelected(true);
            } else {
                rb16.setSelected(true);
            }
            
            if(this.caneta.isTampada()){
                rbTampada.setSelected(false);
                rbDestampada.setSelected(true);
            } else{
                rbDestampada.setSelected(false);
                rbTampada.setSelected(true);
            }
            
            jSlider1.setValue(this.caneta.getCarga());
        }
    }
     private void editar() {
        Caneta canetaEditada = new Caneta();
        canetaEditada.setCodigo(caneta.getCodigo());
        canetaEditada.setModelo(txtModelo.getText());
        if (rbAzul.isSelected()) {
            canetaEditada.setCor(rbAzul.getText());
        } else if (rbVermelha.isSelected()) {
            canetaEditada.setCor(rbVermelha.getText());
        } else if (rbPreta.isSelected()) {
            canetaEditada.setCor(rbPreta.getText());
        } else {
            canetaEditada.setCor(rbVerde.getText());
        }

        if (rb07.isSelected()) {
            canetaEditada.setPonta(Float.parseFloat(rb07.getText()));
        } else if (rb10.isSelected()) {
            canetaEditada.setPonta(Float.parseFloat(rb10.getText()));
        } else if (rb14.isSelected()) {
            canetaEditada.setPonta(Float.parseFloat(rb14.getText()));
        } else {
            canetaEditada.setPonta(Float.parseFloat(rb16.getText()));
        }

        canetaEditada.setCarga(Integer.parseInt(nivelCarga.getText()));
        canetaEditada.setTampada(rbTampada.isSelected());
        
        int linha = canetaDAO.editar(canetaEditada);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Caneta editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao editar Caneta.");
        }
    }
    
    private void inserir() {
        Caneta canetaInserida = new Caneta();
        
        canetaInserida.setModelo(txtModelo.getText());
        
        if (rbAzul.isSelected()) {
            canetaInserida.setCor(rbAzul.getText());
        } else if (rbVermelha.isSelected()) {
            canetaInserida.setCor(rbVermelha.getText());
        } else if (rbPreta.isSelected()) {
            canetaInserida.setCor(rbPreta.getText());
        } else {
            canetaInserida.setCor(rbVerde.getText());
        }

        if (rb07.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb07.getText()));
        } else if (rb10.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb10.getText()));
        } else if (rb14.isSelected()) {
            canetaInserida.setPonta(Float.parseFloat(rb14.getText()));
        } else {
            canetaInserida.setPonta(Float.parseFloat(rb16.getText()));
        }

        canetaInserida.setCarga(Integer.parseInt(nivelCarga.getText()));
        canetaInserida.setTampada(rbTampada.isSelected());
        
        int linha = canetaDAO.inserir(canetaInserida);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Caneta inserida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Caneta.");
        }
    }
    
    public void cancelar() {
        Object[] opcao = {"Não", "Sim"};
        
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        
        if (opcaoSelecionada == 1) {
            this.dispose();
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

        jRadioButton3 = new javax.swing.JRadioButton();
        Pontas = new javax.swing.ButtonGroup();
        Cores = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        rbVermelha = new javax.swing.JRadioButton();
        rbAzul = new javax.swing.JRadioButton();
        rbPreta = new javax.swing.JRadioButton();
        rbVerde = new javax.swing.JRadioButton();
        estado = new javax.swing.JPanel();
        rbTampada = new javax.swing.JRadioButton();
        rbDestampada = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        nivelCarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel11 = new javax.swing.JPanel();
        rb07 = new javax.swing.JRadioButton();
        rb10 = new javax.swing.JRadioButton();
        rb14 = new javax.swing.JRadioButton();
        rb16 = new javax.swing.JRadioButton();

        jRadioButton3.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton3.setText("Azul");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canetas");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 102, 153));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Modelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(18, 27, 56))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(37, 37, 37));
        jPanel1.setName(""); // NOI18N

        txtModelo.setBackground(new java.awt.Color(255, 204, 204));
        txtModelo.setForeground(new java.awt.Color(24, 43, 69));
        txtModelo.setAlignmentX(0.25F);
        txtModelo.setAlignmentY(0.25F);
        txtModelo.setCaretColor(new java.awt.Color(24, 43, 69));
        txtModelo.setDisabledTextColor(new java.awt.Color(24, 43, 69));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtModelo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtModelo)
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Cor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(18, 27, 56))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(37, 37, 37));
        jPanel7.setName(""); // NOI18N

        rbVermelha.setBackground(new java.awt.Color(255, 204, 204));
        Cores.add(rbVermelha);
        rbVermelha.setForeground(new java.awt.Color(37, 37, 37));
        rbVermelha.setText("Vermelha");
        rbVermelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVermelhaActionPerformed(evt);
            }
        });

        rbAzul.setBackground(new java.awt.Color(255, 204, 204));
        Cores.add(rbAzul);
        rbAzul.setForeground(new java.awt.Color(37, 37, 37));
        rbAzul.setText("Azul");

        rbPreta.setBackground(new java.awt.Color(255, 204, 204));
        Cores.add(rbPreta);
        rbPreta.setForeground(new java.awt.Color(37, 37, 37));
        rbPreta.setText("Preta");

        rbVerde.setBackground(new java.awt.Color(255, 204, 204));
        Cores.add(rbVerde);
        rbVerde.setForeground(new java.awt.Color(37, 37, 37));
        rbVerde.setText("Verde");
        rbVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAzul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbVermelha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPreta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVerde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbVerde)
                    .addComponent(rbPreta)
                    .addComponent(rbVermelha)
                    .addComponent(rbAzul))
                .addContainerGap())
        );

        estado.setBackground(new java.awt.Color(255, 204, 204));
        estado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(18, 27, 56))); // NOI18N
        estado.setForeground(new java.awt.Color(37, 37, 37));
        estado.setName(""); // NOI18N

        rbTampada.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup3.add(rbTampada);
        rbTampada.setText("destampada");
        rbTampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTampadaActionPerformed(evt);
            }
        });

        rbDestampada.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup3.add(rbDestampada);
        rbDestampada.setForeground(new java.awt.Color(37, 37, 37));
        rbDestampada.setText("tampada");
        rbDestampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDestampadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout estadoLayout = new javax.swing.GroupLayout(estado);
        estado.setLayout(estadoLayout);
        estadoLayout.setHorizontalGroup(
            estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDestampada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTampada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        estadoLayout.setVerticalGroup(
            estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbTampada)
                    .addComponent(rbDestampada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setBackground(new java.awt.Color(255, 102, 153));
        btnSalvar.setForeground(new java.awt.Color(37, 37, 37));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 102, 153));
        btnSair.setForeground(new java.awt.Color(37, 37, 37));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Carga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(18, 27, 56))); // NOI18N
        jPanel12.setName(""); // NOI18N

        jSlider1.setBackground(new java.awt.Color(255, 204, 204));
        jSlider1.setForeground(new java.awt.Color(240, 100, 178));
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        nivelCarga.setForeground(new java.awt.Color(37, 37, 37));
        nivelCarga.setText("0");

        jLabel1.setForeground(new java.awt.Color(37, 37, 37));
        jLabel1.setText("%");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nivelCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nivelCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Ponta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(18, 27, 56))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(37, 37, 37));
        jPanel11.setName(""); // NOI18N

        rb07.setBackground(new java.awt.Color(255, 204, 204));
        Pontas.add(rb07);
        rb07.setText("1.4");

        rb10.setBackground(new java.awt.Color(255, 204, 204));
        Pontas.add(rb10);
        rb10.setText("1.0");
        rb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb10ActionPerformed(evt);
            }
        });

        rb14.setBackground(new java.awt.Color(255, 204, 204));
        Pontas.add(rb14);
        rb14.setForeground(new java.awt.Color(37, 37, 37));
        rb14.setText("0.7");
        rb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb14ActionPerformed(evt);
            }
        });

        rb16.setBackground(new java.awt.Color(255, 204, 204));
        Pontas.add(rb16);
        rb16.setText("1.6");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb07)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb16)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rb16)
                    .addComponent(rb07)
                    .addComponent(rb10)
                    .addComponent(rb14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSair, btnSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSair)
                            .addComponent(btnSalvar))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSair, btnSalvar});

        estado.getAccessibleContext().setAccessibleName("Estado");
        estado.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     if (caneta != null) {
            editar();
        } else {
            inserir();
        }
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        cancelar();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        nivelCarga.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void rbVermelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVermelhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVermelhaActionPerformed

    private void rbTampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTampadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTampadaActionPerformed

    private void rbDestampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDestampadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDestampadaActionPerformed

    private void rbVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVerdeActionPerformed

    private void rb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb10ActionPerformed

    private void rb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb14ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Cores;
    private javax.swing.ButtonGroup Pontas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel nivelCarga;
    private javax.swing.JRadioButton rb07;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb14;
    private javax.swing.JRadioButton rb16;
    private javax.swing.JRadioButton rbAzul;
    private javax.swing.JRadioButton rbDestampada;
    private javax.swing.JRadioButton rbPreta;
    private javax.swing.JRadioButton rbTampada;
    private javax.swing.JRadioButton rbVerde;
    private javax.swing.JRadioButton rbVermelha;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
