package palavraChaveFinal;
//[modificadores de acesso]
//publico todo conseguem ter acesso
//defoult somente quem tá dentro do pacote
//private é somente dentro da própia classe 

public class Aluno {
    private String curso;
    private double []notas;
    

   
    public Aluno(){
        super();
    }
   
    //super da acesso a classe mãe
    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
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
        //super.setCpf("464563-34542");
        //acesso a propia classe ou a super classe
        //this.setCpf(curso);
        this.setCurso(curso);
    }

    //sobreposição do método e modificando o comportamento dele
    public String obterEtiquetaEndereco(){
        String s ="Endereco do aluno: ";
        //s+=super.getEndereco();

        return s;
    }
}
