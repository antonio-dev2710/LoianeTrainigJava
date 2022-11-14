package relacionamentoTemUm.exercicio02;

public class Curso {
   private String nome;
   private String horario;
   private Professor professor;
   private Aluno[] alunos;
    private double medidaTurma;
    

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getMedidaTurma() {
        return medidaTurma;
    }

    public void setMedidaTurma(double medidaTurma) {
        this.medidaTurma = medidaTurma;
    }

    public String obterInfo() {
        String info = "Nome da disciplina: " + this.nome + "\n" +
                "Horario das aulas: " + this.horario + "\n" +
                "\n" +
                "Dados do Professor: " + this.professor.obterInfoProfessor() +
                "\n";

        for (Aluno a : alunos) {
            info += a.obterInfo() + "\n";
        }
        info+="Média global: "+this.medidaTurma;
        return info;
    }
}
