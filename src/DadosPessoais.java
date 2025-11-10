public class DadosPessoais {
    private String nome;
    private int idade;
    private double altura;
    private int cpf;

    public DadosPessoais(String nome, int idade, double altura, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
