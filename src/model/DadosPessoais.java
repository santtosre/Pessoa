package model;

public class DadosPessoais {
    private int idade;
    private double saldo;
    private String cpf;

    //construtor
    public DadosPessoais(int idade, double saldo, String cpf) {
        this.idade = idade;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    //get and set
    public int getIdade() {return idade;}

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString
    @Override
    public String toString() {
        return "CPF: " +  cpf +
                " / " + idade + " Anos ";
    }
}
