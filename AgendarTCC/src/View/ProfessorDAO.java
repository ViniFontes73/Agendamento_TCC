/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Vinicius
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import View.ConexaoBD;


public class ProfessorDAO {

    public static void excluirProfessor(String cpf) {
        try (Connection conexao = ConexaoBD.obterConexao()) {
            String sql = "DELETE FROM professor WHERE CPF = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, cpf);

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
    }

    private static void exibirMensagemSucesso() {
        javax.swing.JOptionPane.showMessageDialog(
                null, "Professor excluído com sucesso!", "Sucesso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static void exibirMensagemErro() {
        javax.swing.JOptionPane.showMessageDialog(
                null, "Erro ao excluir professor.", "Erro",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }
}
