package view;

import excessao.CpfInvalidoException;
import model.Pessoa;
import service.GerenciarPessoa;
import model.DadosPessoais;

public class Main {
    public static void main(String[] args) {

        //criação dos objetos model.DadosPessoais
        DadosPessoais dados = new DadosPessoais(22,17.000,"45097173850");
        DadosPessoais dados2 = new DadosPessoais(32,30.000,"10293020301");


        //criação dos objetos model.Pessoa
        Pessoa pessoa = new Pessoa("Macelo", dados);
        Pessoa pessoa2 = new Pessoa("Fernando", dados2);

        // adicionando o objeto Pessoa a uma lista
        GerenciarPessoa gerenciar = new GerenciarPessoa();

        try {
            gerenciar.adicionarPessoa(pessoa);
            gerenciar.adicionarPessoa(pessoa2);
        }catch (CpfInvalidoException e){
            System.out.println("CPF Invalido");
        }

        System.out.println(gerenciar.tamanhoLista());
        System.out.println(gerenciar);


        }
    }
