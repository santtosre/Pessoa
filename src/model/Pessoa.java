package model;

public class Pessoa {
    private String nome;
    private DadosPessoais dados;

    //construtor
    public Pessoa(){

    }

    public Pessoa(String nome, DadosPessoais dados) {
        this.nome = nome;
        this.dados = dados;
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DadosPessoais getDados() {
        return dados;
    }

    public void setDados(DadosPessoais dados) {
        this.dados = dados;
    }

    // verificar if idade > 18 || < 18
    public void validaDeIdade() {
        if (dados.getIdade() >= 18) {
            System.out.println( nome + ": Maior de Idade");
     } else {
          System.out.println(nome + ": Menor de Idade \n" ) ;
        }
    }

    //toString
    @Override
    public String toString() {
        return nome + ", " + dados;

    }
}


