class DadosPessoais {
    private int idade;
    private double altura;
    private int cpf;

    public DadosPessoais(int idade, double altura, int cpf) {
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
    }

    public int getIdade() {return idade;}

    public double getAltura() {
        return altura;
    }

    public int getCpf() {
        return cpf;
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

    @Override
    public String toString() {
        return "Idade: " + idade + ", " +
                "Altura: " +  altura + ", " +
                "Cpf: " +  cpf;
    }
}
