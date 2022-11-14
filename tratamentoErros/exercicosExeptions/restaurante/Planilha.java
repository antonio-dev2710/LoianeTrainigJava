package tratamentoErros.exercicosExeptions.restaurante;

import java.util.Arrays;

public class Planilha {

    Pessoa[] pessoas;
    int aux;
    @Override
    public String toString() {
        return "Planilha [pessoas=" + Arrays.toString(pessoas) + "]";
    }

    public Planilha() {
        pessoas = new Pessoa[4];
    }

    public String criarPessoa(Pessoa pessoa) throws AgendaCheiaExption {
        String s = " " + "\n";
        boolean cheia = false;
        int i=0;
        for ( i = aux; i < pessoas.length;){
            aux++;
            if (pessoas[i] != null) {
                cheia = true;
                throw new AgendaCheiaExption();
            } else {
                pessoas[i] = pessoa;
                s += pessoa;
                break;
            }
            
        }
        return s;

    }

    public int verificarNome(String nome) throws NomeNaoEncontradoExption {
        for (int j = 0; j < pessoas.length; j++) {
            if (pessoas[j].getNome().equalsIgnoreCase(nome)) {
                return j;
            }

        }
        throw new NomeNaoEncontradoExption();

    }
}
