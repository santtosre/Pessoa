class Pessoa {
    private String nome;
    private DadosPessoais dadosSensiveis;

    //construtor
    public Pessoa(String nome, DadosPessoais dadosSensiveis) {
        this.nome = nome;
        this.dadosSensiveis = dadosSensiveis;
    }
    public Pessoa(){

    }

    //metodos
    public void adicionarPessoa(){

    }
    public void quantidadePessoas(){

    }
    public void buscar(){

    }
    //metodo utilizado para verificar se o usuaruio é maior de idade ou não
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


