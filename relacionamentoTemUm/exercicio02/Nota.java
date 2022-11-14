package relacionamentoTemUm.exercicio02;

public class Nota {
    private Double notaAluno;
    
    
    public Double getNotaAluno() {
        return notaAluno;
    }
    public void setNotaAluno(Double notaAluno) {
        this.notaAluno = notaAluno;
    }
    public String obterNota() {

        String info="Nota: " + this.notaAluno + "\n";

        
        
        return info;
    }
    
}
