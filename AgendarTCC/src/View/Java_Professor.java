/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import View.ConexaoBD;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JScrollPane;
import View.Mensagens;




        

public class Java_Professor extends javax.swing.JFrame {
    
    private MainFrame mainFrame; // aqui recebe o mainFrame
    public Java_Professor(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }
    

    
     private void carregarDadosTabela() {
        try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "SELECT CPF, nome, instituicao, externo FROM professor";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpa a tabela antes de adicionar novos dados
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            // Adiciona os dados na tabela
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("CPF"),
                    resultSet.getString("nome"),
                    resultSet.getString("instituicao"),
                    resultSet.getString("externo")
                };
                model.addRow(row);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        exibirMensagemErro();
    }
     }
    
    
    
    
    
    
    
    private DefaultTableModel model; // Adicione esta linha


    
    public Java_Professor() {
        initComponents();
        
        carregarDadosTabela(); // Adicione esta linha para carregar os dados inicialmente
        
        // iniciar modelo tabela 
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("CPF");
        model.addColumn("Nome");
        model.addColumn("Instituição");
        model.addColumn("Externo");
        
        

        
    }

   
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnUpdateProf = new javax.swing.JButton();
        jbtnAddProf = new javax.swing.JButton();
        jbtnResetar = new javax.swing.JButton();
        jbtnListar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtExterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtInstituicao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Professor");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jbtnUpdateProf.setBackground(new java.awt.Color(32, 91, 139));
        jbtnUpdateProf.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnUpdateProf.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpdateProf.setText("Atualizar Professor");
        jbtnUpdateProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateProfActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUpdateProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, -1));

        jbtnAddProf.setBackground(new java.awt.Color(32, 91, 139));
        jbtnAddProf.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnAddProf.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAddProf.setText("Add Professor");
        jbtnAddProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddProfActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAddProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 60));

        jbtnResetar.setBackground(new java.awt.Color(32, 91, 139));
        jbtnResetar.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnResetar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnResetar.setText("Resetar");
        jbtnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnResetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, -1));

        jbtnListar.setBackground(new java.awt.Color(32, 91, 139));
        jbtnListar.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnListar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnListar.setText("Listar");
        jbtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 330, -1));

        jbtnSair.setBackground(new java.awt.Color(32, 91, 139));
        jbtnSair.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnSair.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 330, -1));

        jbtnDeletar.setBackground(new java.awt.Color(32, 91, 139));
        jbtnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jbtnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CPF Professor");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 30));

        jtxtCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCPFActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 370, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nome");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        jtxtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel5.add(jtxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 370, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Externo");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jtxtExterno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel5.add(jtxtExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 370, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Instituição");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 30));

        jtxtInstituicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel5.add(jtxtInstituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 370, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Instituição", "Externo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel9.setBackground(new java.awt.Color(32, 91, 139));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/univicosa_horizontal 3.png"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 14, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUpdateProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateProfActionPerformed
       String CPF = jtxtCPF.getText();
    String nome = jtxtNome.getText();
    String instituicao = jtxtInstituicao.getText();
    String externo = jtxtExterno.getText();

    try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "update professor set nome =?, instituicao =?, externo =? where CPF =? ";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, instituicao);
            preparedStatement.setString(3, externo);
            preparedStatement.setString(4, CPF);


            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                exibirMensagemSucesso();
            } else {
                exibirMensagemErro();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        exibirMensagemErro();
    }

    }//GEN-LAST:event_jbtnUpdateProfActionPerformed

    private void jtxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCPFActionPerformed
private JFrame frame;
    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
       // frame = new JFrame("Sair");
      //  if (JOptionPane.showConfirmDialog(frame, "Confirmar","Professores", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      //  {
      //      System.exit(0);
      //  }
      // Feche o Java_Professor e volte para o MainFrame
        this.dispose();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetarActionPerformed
        // TODO add your handling code here:
        jtxtCPF.setText("");
        jtxtNome.setText("");
        jtxtInstituicao.setText("");
        jtxtExterno.setText(""); 
    }//GEN-LAST:event_jbtnResetarActionPerformed

    
    
    
    //-------- VALIDAR CPF ---------------------------------------------------
    private boolean validarCPF(String cpf) {
    // Remove qualquer caractere que não seja numérico
    cpf = cpf.replaceAll("[^\\d]", "");

    // Verifica se o CPF tem 11 dígitos e se todos são numéricos
    return cpf.length() == 11 && cpf.matches("\\d+");
}
    
    
    private void jbtnAddProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddProfActionPerformed
        // TODO add your handling code here:
        String CPF = jtxtCPF.getText();

         // Valida o CPF antes de prosseguir
        if (validarCPF(CPF)) {
        String nome = jtxtNome.getText();
        String instituicao = jtxtInstituicao.getText();
        String externo = jtxtExterno.getText();

        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "INSERT INTO professor (CPF, nome, instituicao, externo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, CPF);
                preparedStatement.setString(2, nome);
                preparedStatement.setString(3, instituicao);
                preparedStatement.setString(4, externo);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    Mensagens.exibirMensagemSucesso(this, "Dados Inseridos com sucesso");
                } else {
                    Mensagens.exibirMensagemErro(this,"Erro ao inserir dados");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exibirMensagemErro();
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(
            this, "CPF inválido. O CPF deve conter exatamente 11 dígitos numéricos.", 
            "Erro", javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_jbtnAddProfActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        System.out.println("Selected Row: " + selectedRow);
        System.out.println("Model Row Count: " + model.getRowCount());

        // Imprime os valores das colunas para depuração
        for (int i = 0; i < model.getColumnCount(); i++) {
            System.out.println("Column " + i + ": " + model.getValueAt(selectedRow, i));
        }

        jtxtCPF.setText(model.getValueAt(selectedRow, 0).toString());
        jtxtNome.setText(model.getValueAt(selectedRow, 1).toString());
        jtxtInstituicao.setText(model.getValueAt(selectedRow, 2).toString());
        jtxtExterno.setText(model.getValueAt(selectedRow, 3).toString());
    }
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListarActionPerformed
        // TODO add your handling code here: MOSTRAR TABLE
         carregarDadosTabela();

    // Exibe os dados em um JOptionPane
    //JOptionPane.showMessageDialog(this, new JScrollPane(jTable1), "Lista de Professores", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jbtnListarActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        // Obter o CPF do professor selecionado na tabela
    String cpf = jtxtCPF.getText();

    // Valida o CPF antes de prosseguir
    if (validarCPF(cpf)) {
        int confirmacao = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja excluir esse professor?",
                "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            // Chame o método excluirProfessor da classe ProfessorDAO
            ProfessorDAO.excluirProfessor(cpf);

            // Recarregue os dados na tabela após a exclusão
            carregarDadosTabela();
        }
    } else {
        JOptionPane.showMessageDialog(
                this,
                "CPF inválido. O CPF deve conter exatamente 11 dígitos numéricos.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbtnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(Java_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAddProf;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnListar;
    private javax.swing.JButton jbtnResetar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JButton jbtnUpdateProf;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtExterno;
    private javax.swing.JTextField jtxtInstituicao;
    private javax.swing.JTextField jtxtNome;
    // End of variables declaration//GEN-END:variables


private void exibirMensagemSucesso() {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Dados inseridos com sucesso!", "Sucesso", 
        javax.swing.JOptionPane.INFORMATION_MESSAGE
    );

    // Aqui você pode adicionar outras ações após o sucesso, se necessário
}

private void exibirMensagemErro() {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao inserir dados.", "Erro", 
        javax.swing.JOptionPane.ERROR_MESSAGE
    );

    // Aqui você pode adicionar outras ações após o erro, se necessário
}


    

}

