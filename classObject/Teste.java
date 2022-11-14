package classObject;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        //inicialisar o array
        double [] notas ={10,9,8,7};
        aluno.setNotas(notas);
        //endereco pra onde ta mandando classObject.Aluno@3fee733d
        //ponteiro: aponta um local na memómoria de referencia onde está sendo guardado esse dados
        System.out.println(aluno);

        String s1="dfgdfgd";
        String s2="dfgdfgD";
        //não está comparando os valores está sendo comparado a referencia
        System.out.println(s1==s2);

        //está comparando os valores
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Análise e Desenvolvimento de Sistemas");
        //inicialisar o array
        double [] notas2 ={10,9,8,7};
        aluno.setNotas(notas2);
        //endereco pra onde ta mandando classObject.Aluno@3fee733d
        //ponteiro: aponta um local na memómoria de referencia onde está sendo guardado esse dados
        System.out.println("Aluno: ");
        System.out.println(aluno.equals(aluno2));




    }

   
    
}
