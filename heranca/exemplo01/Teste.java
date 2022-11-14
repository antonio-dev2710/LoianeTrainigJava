package heranca.exemplo01;

public class Teste {
    public static void main(String[] args) {
        // Aluno aluno = new Aluno();
        // Professor professor= new Professor();
        // Pessoa pessoa = new Pessoa();

        //aluno.setNome("Jão");
        //pessoa é uma super classe da classe
        // só tem acesso para classe pessoa
        //A herança é um tipo de relacionamento é um é uma
        Pessoa aluno =new Aluno();
        aluno.setCpf(null);

        Pessoa professor =new Professor();
        professor.getNome();



    }
}
