/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Vinicius
 */
public class Mensagens {

    public static void exibirMensagemSucesso(javax.swing.JFrame frame, String mensagem) {
        javax.swing.JOptionPane.showMessageDialog(
                frame, mensagem, "Sucesso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );

        // Aqui você pode adicionar outras ações após o sucesso, se necessário
    }

    public static void exibirMensagemErro(javax.swing.JFrame frame, String mensagem) {
        javax.swing.JOptionPane.showMessageDialog(
                frame, mensagem, "Erro",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );

        // Aqui você pode adicionar outras ações após o erro, se necessário
    }
}
