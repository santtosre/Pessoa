package view;

import excessao.CpfInvalidoException;
import model.Pessoa;
import service.GerenciarPessoa;
import model.DadosPessoais;

public class Main {
    public static void main(String[] args) {

        //criação dos objetos DadosPessoais
        DadosPessoais dados = new DadosPessoais(22,17.000,"45097173850");
        DadosPessoais dados2 = new DadosPessoais(13,30.000,"12231234218");


        //criação dos objetos Pessoa
        Pessoa pessoa = new Pessoa("Macelo", dados);
        Pessoa pessoa2 = new Pessoa("Fernando", dados2);

        // adicionando o objeto Pessoa a uma lista
        GerenciarPessoa gerenciar = new GerenciarPessoa();

        try {
            gerenciar.adicionarPessoa(pessoa);
            gerenciar.adicionarPessoa(pessoa2);
        }catch (CpfInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println(gerenciar);
        pessoa.validaDeIdade();
        pessoa2.validaDeIdade();

        System.out.println("A lista possui: " +gerenciar.tamanhoLista() + " Cadastros");

        }
    }
