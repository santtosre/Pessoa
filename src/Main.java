public class Main {
    public static void main(String[] args) {
        DadosPessoais infoDadosPessoais1 = new DadosPessoais(20,1.81,123);
        DadosPessoais infoDadosPessoais2 = new DadosPessoais(30,1.66, 456);
        DadosPessoais infoDadosPessoais3 = new DadosPessoais(10,1.53, 789);

        Pessoa pessoa1 = new Pessoa("Renan", infoDadosPessoais1);
        Pessoa pessoa2 = new Pessoa("Maria", infoDadosPessoais2);
        Pessoa pessoa3 = new Pessoa("Jose", infoDadosPessoais3);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        pessoa1.validaDeIdade();
        pessoa2.validaDeIdade();
        pessoa3.validaDeIdade();
        }
    }
