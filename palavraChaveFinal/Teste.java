package palavraChaveFinal;

public class Teste {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        //como a variável de esta pulbic qualquer classe pode acessar
        //como é static n precisa instaciar
        System.out.println(Constantes.URL_BLOG);
        //não pode ser alterado
        //Constantes.URL_BLOG="ksdmfksmd";

    }
}
