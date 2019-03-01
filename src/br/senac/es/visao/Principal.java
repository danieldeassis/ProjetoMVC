/*
 * Classe Principal - Interface com o usuário.
 */
package br.senac.es.visao;

import br.senac.es.controle.AlunoControle;
import br.senac.es.modelo.AlunoModelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Turma182
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args) {
        String leitura, opcao, retorno;
        
        String menu = "<html>"
                + "	<h3 align='center'>.: MENU :.</h3>"
                + "	<ol>"
                + "		<li>Cadastrar um aluno</li>"
                + "		<li>Listar os alunos</li>"
                + "		<li>Encerrar o programa</li>"
                + "	</ol>"
                + "</html>";
        
        /**
         * Objetos Importantes
         */       
        AlunoControle controle = new AlunoControle();
        
        do {

            opcao = JOptionPane.showInputDialog(menu);

            switch (opcao) {
                case "1":
                    AlunoModelo aluno = new AlunoModelo();
                    
                    leitura = JOptionPane.showInputDialog("Nome do aluno:");
                    aluno.setNome(leitura);
                    
                    leitura = JOptionPane.showInputDialog("CPF do aluno:");
                    aluno.setCpf(leitura);
                    
                    leitura = JOptionPane.showInputDialog("E-mail do aluno:");
                    aluno.setEmail(leitura);
                    
                    retorno = controle.salvarAluno(aluno);
                    
                    JOptionPane.showMessageDialog(null, retorno);
                    break;
                    
                case "2":   
                    retorno = controle.obtemLista();
                    
                    JOptionPane.showMessageDialog(null, retorno);
                    
                    break;
                case "3":
                    //não faz nada
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }

        } while (!opcao.equals("3"));

    }

}
