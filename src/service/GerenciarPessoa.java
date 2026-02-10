package service;

import model.DadosPessoais;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import excessao.CpfInvalidoException;
import excessao.IdadeInvalidaException;

public class GerenciarPessoa {

    private List<Pessoa> listaPessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa){
        if(pessoa.getDados().getCpf().length() != 11){
           throw new CpfInvalidoException ("CPF Invalido");
        }
        listaPessoas.add(pessoa);
    }

    public int tamanhoLista(){
        return listaPessoas.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pessoas Cadastradas: \n");
        for (Pessoa p : listaPessoas) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}




