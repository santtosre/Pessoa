import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //criação dos objetos DadosPessoais
        DadosPessoais dados = new DadosPessoais(22,17.000,"00000000000");
        DadosPessoais dados1 = new DadosPessoais(7,50.000,"057633758657");
        DadosPessoais dados2 = new DadosPessoais(15,40.000,"027587337");
        DadosPessoais dados3 = new DadosPessoais(27,300.000,"43572876697");
        DadosPessoais dados4 = new DadosPessoais(33,100.000,"09730722767");

        //criação dos objetos Pessoa
        Pessoa pessoa = new Pessoa("Macelo", dados);
        Pessoa pessoa1 = new Pessoa("Lilian", dados1);
        Pessoa pessoa2 = new Pessoa("Julio", dados2);
        Pessoa pessoa3 = new Pessoa("Roberto", dados3);
        Pessoa pessoa4 = new Pessoa("Daniela", dados4);

        //lista
        List<Pessoa> listaPessoas = new ArrayList<>();
        //adicionando objetos a lista
        listaPessoas.add(pessoa);
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);

        System.out.println("a lista possui " + listaPessoas.size() + " adicionados");

        //imprimir informações das pessoas
        System.out.println(pessoa);
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);

        //validar idade de cada pessoa
        pessoa.validaDeIdade();
        pessoa1.validaDeIdade();
        pessoa2.validaDeIdade();
        pessoa3.validaDeIdade();
        pessoa4.validaDeIdade();

        //imprime o segundo indice da lista
        System.out.println(listaPessoas.get(2));

        //limpa os dados da lista
        listaPessoas.clear();
        System.out.println("a lista possui " + listaPessoas.size() + " adicionados");







        }
    }
