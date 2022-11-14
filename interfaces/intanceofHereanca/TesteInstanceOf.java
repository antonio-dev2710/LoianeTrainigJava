package interfaces.intanceofHereanca;

public class TesteInstanceOf {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Aluno aluno= new Aluno();

        Professor prof = new Professor();

        //a variável pessoa é uma instacia da classe Pessoa
        if(pessoa instanceof Pessoa){

            System.out.println("é do tipo Pessoa");
        }
        if(aluno instanceof Aluno){

            System.out.println("é do tipo Aluno");
        }
        if( prof instanceof Professor){

            System.out.println("é do tipo Professor");
        }



    }
}
