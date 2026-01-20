package model;

public class Pessoa {
    private String nome;
    private DadosPessoais dadosSensiveis;

    //construtor
    public Pessoa(){

    }

    public Pessoa(String nome, DadosPessoais dadosSensiveis) {
        this.nome = nome;
        this.dadosSensiveis = dadosSensiveis;
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DadosPessoais getDadosSensiveis() {
        return dadosSensiveis;
    }

    public void setDadosSensiveis(DadosPessoais dadosSensiveis) {
        this.dadosSensiveis = dadosSensiveis;
    }

    // verificar if idade > 18 || < 18
    public void validaDeIdade() {
        if (dadosSensiveis.getIdade() >= 18) {
            System.out.println( nome + " é maior de Idade");
     } else {
          System.out.println(nome + " é menor de Idade");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Olá " + nome + ", " + dadosSensiveis;

    }
}


