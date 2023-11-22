/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius
 */
public class Java_Alunos extends javax.swing.JFrame {
    
    private MainFrame mainFrame; // aqui recebe o mainFrame
    public Java_Alunos(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    
    
    
    private void carregarDadosTabela() {
        try (Connection conexao = ConexaoBD.obterConexao()) {
        String sql = "SELECT nome, matricula FROM alunos";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpa a tabela antes de adicionar novos dados
            DefaultTableModel model = (DefaultTableModel) jTableAlunos.getModel();
            model.setRowCount(0);

            // Adiciona os dados na tabela
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("nome"),
                    resultSet.getString("matricula"),
                };
                model.addRow(row);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        Mensagens.exibirMensagemErro(this, "erro");
    }
     }
    
    
    
    
    
    
    
    private DefaultTableModel model; // Adicione esta linha

    /**
     * Creates new form Java_Alunos
     */
    public Java_Alunos() {
        initComponents();
        carregarDadosTabela(); // Adicione esta linha para carregar os dados inicialmente
        
        // iniciar modelo tabela 
        model = new DefaultTableModel();
        jTableAlunos.setModel(model);
        model.addColumn("Nome");
        model.addColumn("Matricula");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbntUpdateAluno = new javax.swing.JButton();
        jbntListar = new javax.swing.JButton();
        jbntResetar = new javax.swing.JButton();
        jbntAdicionar = new javax.swing.JButton();
        jbntDeletar = new javax.swing.JButton();
        jbntSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNomeAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtMatricula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");

        jPanel2.setPreferredSize(new java.awt.Dimension(1285, 742));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbntUpdateAluno.setBackground(new java.awt.Color(32, 91, 139));
        jbntUpdateAluno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntUpdateAluno.setForeground(new java.awt.Color(255, 255, 255));
        jbntUpdateAluno.setText("Atualizar Aluno");
        jbntUpdateAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntUpdateAlunoActionPerformed(evt);
            }
        });

        jbntListar.setBackground(new java.awt.Color(32, 91, 139));
        jbntListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntListar.setForeground(new java.awt.Color(255, 255, 255));
        jbntListar.setText("Listar");
        jbntListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntListarActionPerformed(evt);
            }
        });

        jbntResetar.setBackground(new java.awt.Color(32, 91, 139));
        jbntResetar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntResetar.setForeground(new java.awt.Color(255, 255, 255));
        jbntResetar.setText("Resetar");
        jbntResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntResetarActionPerformed(evt);
            }
        });

        jbntAdicionar.setBackground(new java.awt.Color(32, 91, 139));
        jbntAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jbntAdicionar.setText("Add Aluno");
        jbntAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntAdicionarActionPerformed(evt);
            }
        });

        jbntDeletar.setBackground(new java.awt.Color(32, 91, 139));
        jbntDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntDeletar.setForeground(new java.awt.Color(255, 255, 255));
        jbntDeletar.setText("Deletar");
        jbntDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntDeletarActionPerformed(evt);
            }
        });

        jbntSair.setBackground(new java.awt.Color(32, 91, 139));
        jbntSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbntSair.setForeground(new java.awt.Color(255, 255, 255));
        jbntSair.setText("Sair");
        jbntSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbntDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbntResetar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbntListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbntAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbntUpdateAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jbntSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jbntAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbntUpdateAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbntListar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbntResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbntSair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 200, 370));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nome");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        jtxtNomeAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel5.add(jtxtNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 490, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Matrícula");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 30));

        jtxtMatricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel5.add(jtxtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 490, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 630, 210));

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matrícula"
            }
        ));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAlunos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 690, 200));

        jPanel4.setBackground(new java.awt.Color(32, 91, 139));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Alunos");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/univicosa_horizontal 3.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 1280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbntResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntResetarActionPerformed
        // Resetar o texto:
        jtxtNomeAluno.setText("");
        jtxtMatricula.setText("");

    }//GEN-LAST:event_jbntResetarActionPerformed

    private void jbntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntSairActionPerformed
         this.dispose();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jbntSairActionPerformed

    private void jbntAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntAdicionarActionPerformed
        // TODO add your handling code here:
        String nome = jtxtNomeAluno.getText();
        String matricula = jtxtMatricula.getText();
        
        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "INSERT INTO alunos (nome, matricula) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, nome);
                preparedStatement.setString(2, matricula);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    Mensagens.exibirMensagemSucesso(this, "Dados Inseridos com sucesso");
                } else {
                    Mensagens.exibirMensagemErro(this,"Erro ao inserir dados");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Mensagens.exibirMensagemErro(this, "ERROR");
        }
    }//GEN-LAST:event_jbntAdicionarActionPerformed

    private void jbntUpdateAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntUpdateAlunoActionPerformed
        String nome = jtxtNomeAluno.getText();
        String matricula = jtxtMatricula.getText();
        
        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "UPDATE alunos set nome =? where matricula =?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, nome);
                preparedStatement.setString(2, matricula);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    Mensagens.exibirMensagemSucesso(this, "Dados atualizados com sucesso");
                } else {
                    Mensagens.exibirMensagemErro(this,"Erro ao atualizar dados");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Mensagens.exibirMensagemErro(this, "ERROR");
        }
    }//GEN-LAST:event_jbntUpdateAlunoActionPerformed

    private void jbntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntListarActionPerformed
        // Listar minha table:
        carregarDadosTabela();
    }//GEN-LAST:event_jbntListarActionPerformed

    private void jbntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntDeletarActionPerformed
        // TODO add your handling code here:
        String matricula = jtxtMatricula.getText();

        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "DELETE FROM alunos WHERE matricula = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, matricula);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    Mensagens.exibirMensagemSucesso(this, "Deletado com sucesso!");
                } else {
                    Mensagens.exibirMensagemErro(this, "Erro ao deletar");

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Mensagens.exibirMensagemErro(this, "Erro ao deletar");
        }
    }//GEN-LAST:event_jbntDeletarActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        int selectedRow = jTableAlunos.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("Selected Row: " + selectedRow);
            System.out.println("Model Row Count: " + model.getRowCount());

        // Imprime os valores das colunas para depuração
            for (int i = 0; i < model.getColumnCount(); i++) {
                System.out.println("Column " + i + ": " + model.getValueAt(selectedRow, i));
            }

            jtxtNomeAluno.setText(model.getValueAt(selectedRow, 0).toString());
            jtxtMatricula.setText(model.getValueAt(selectedRow, 1).toString());

            
    }
    }//GEN-LAST:event_jTableAlunosMouseClicked

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
            java.util.logging.Logger.getLogger(Java_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JButton jbntAdicionar;
    private javax.swing.JButton jbntDeletar;
    private javax.swing.JButton jbntListar;
    private javax.swing.JButton jbntResetar;
    private javax.swing.JButton jbntSair;
    private javax.swing.JButton jbntUpdateAluno;
    private javax.swing.JTextField jtxtMatricula;
    private javax.swing.JTextField jtxtNomeAluno;
    // End of variables declaration//GEN-END:variables
}