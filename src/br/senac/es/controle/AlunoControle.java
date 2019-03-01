package br.senac.es.controle;

import br.senac.es.modelo.AlunoModelo;
import java.util.ArrayList;

/**
 * @author Turma182
 * @version 1.0
 */
public class AlunoControle {

    private ArrayList<AlunoModelo> bancoDeDados = new ArrayList();

    /**
     * Método salvarAluno - verifica nome, cpf e email de um objeto aluno (AlunoModelo)
     * Caso os dados estejam válidos, adiciona o objeto aluno dentro do ArrayList bancoDeDados
     * @param a um ojbeto da classe AlunoModelo
     * @return uma mensagem de confirmação ou rejeição
     */
    public String salvarAluno(AlunoModelo a) {
        if (a.getNome().length() < 3) {
            return "Nome Inválido\nDeve ter pelo menos 3 caracteres";
        } else if (!a.getEmail().contains("@") || !a.getEmail().contains(".com")) {
            return "E-mail Inválido\nDeve conter o caracter \"@\" e também a expressão \".com\" ";
        } else if (a.getCpf().length() != 11) {
            return "CPF Inválido\nDeve ter exatamente 11 dígitos";
        } else {
            bancoDeDados.add(a);
            return "Cadastro Realizado com sucesso";
        }
    }

    /**
     * Método obtemLista - Obtem todos os elementos 'AlunoModelo' do ArrayList e
     * retorna em forma de uma String concatenada.
     *
     * @return Uma String concatenando nome, cpf e email de todos os alunos
     */
    public String obtemLista() {
        String saida = "";
        
        for (int i = 0; i < bancoDeDados.size(); i++) {
            String nome = bancoDeDados.get(i).getNome();
            String cpf = bancoDeDados.get(i).getCpf();
            String email = bancoDeDados.get(i).getEmail();

            saida = saida + nome + " | " + cpf + " | " + email + "\n";
        }
        
        /*
        for (AlunoModelo aluno : bancoDeDados) {
            String nome = aluno.getNome();
            String cpf = aluno.getCpf();
            String email = aluno.getEmail();
            
             saida = saida + nome + " | " + cpf + " | " + email + "\n";
        }
        */        
        return saida;
    }

}
