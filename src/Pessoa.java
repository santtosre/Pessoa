class Pessoa {
    private String nome;
    private DadosPessoais dados;

    public Pessoa(String nome, DadosPessoais dados) {
        this.nome = nome;
        this.dados = dados;
    }

    public void validaDeIdade() {
        if (dados.getIdade() >= 18) {
            System.out.println( nome + " é maior de Idade");
        } else {
            System.out.println(nome + " é menor de Idade");
        }
    }

    @Override
    public String toString() {
        return "Olá " + nome + ", " + dados;

    }
}


