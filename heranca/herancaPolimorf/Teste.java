package heranca.herancaPolimorf;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno =new Aluno();
        Pessoa professor= new Professor();

        pessoa.setEndereco("Rua 1, num 1 ");
        aluno.setEndereco("Rua  2, num 2 ");
        professor.setEndereco("Rua 3, num 3");

        //por conta da heraça as classes filhas tem acesso ao método que está na classe pai sendo que na classe filha pode dar novas formas para este método
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());



    }
}
