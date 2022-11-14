package classObject;
//[modificadores de acesso]
//publico todo conseguem ter acesso
//defoult somente quem tá dentro do pacote
//private é somente dentro da própia classe 

import java.util.Arrays;

public class Aluno {
    private String curso;
    private double []notas;
    

    public Aluno(){
        super();
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

    //gerando metodo toString automaticamente
    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }


    //compara os atributos
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj)
            return true;
        if (obj == null)
            return false;
       
        Aluno other = (Aluno) obj;
       if(curso.equalsIgnoreCase(other.getCurso())){
        return true;
       }
        return false;
    }
    
    

    
}
