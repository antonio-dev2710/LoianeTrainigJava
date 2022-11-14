package relacionamentoTemUm.exercicio02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        double mediaAluno = 0;
        double mediaTds=0;

        System.out.println("Digite o nome do curso ");
        curso.setNome(scan.next());
        System.out.println("Digite o horário do curso ");
        curso.setHorario(scan.next());
        

        Professor professor = new Professor();
        System.out.println("Digite o nome do professor ");
        professor.setNome(scan.next());
        System.out.println("Digite o email do professor ");
        professor.setEmail(scan.next());
        System.out.println("Digite o departamento do professor ");
        professor.setDepartamento(scan.next());
        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[2];
        
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            Nota[] notas = new Nota[5];
            System.out.println("Digite o nome do aluno");
            aluno.setNome(scan.next());
            System.out.println("Digite a matricula do aluno");
            aluno.setMatricula(scan.next());

            
            // digitar as 5 notas
            mediaAluno=0;
            for (int j = 0; j < notas.length; j++) {
                Nota nota = new Nota();
                System.out.println("Digite a nota  " + j);
                double nt = scan.nextDouble();
                nota.setNotaAluno(nt);
                notas[j] = nota;

                mediaAluno +=nota.getNotaAluno();
            }

            mediaAluno=mediaAluno/notas.length;
            mediaTds+=mediaAluno;
            
            //setar as notas
            aluno.setNotas(notas);
            //setar a media em aluno
            aluno.setMedia(mediaAluno);

            //passar todas as info de aluno para o array de alunos
            alunos[i] = aluno;
        }
        mediaTds=mediaTds/alunos.length;
        //setar media global da sala
        curso.setMedidaTurma(mediaTds);
        //setar todas as infos de alunos em curso
        curso.setAlunos(alunos);
        if(curso!=null){ 
            System.out.println( curso.obterInfo());
        }

    }
    
}
