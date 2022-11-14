package heranca.superHeranca;

public class Aluno extends Pessoa{
    private String curso;
    private double []notas;

    public Aluno(){
        super();
    }
   
    //super da acesso a classe mãe
    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
       
    }





    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        //acesso a classe mae
        super.setCpf("464563-34542");
        //acesso a propia classe ou a super classe
        this.setCpf(curso);
        this.setCurso(curso);
        
    }
}
