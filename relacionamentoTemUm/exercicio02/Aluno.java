package relacionamentoTemUm.exercicio02;

public class Aluno {
    private String nome;
    private String matricula;
    private Nota [] notas;
    private double media;

    
    
    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public Nota[] getNotas() {
        return notas;
    }


    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }


    public void setMedia(double media) {
        this.media = media;
    }
    
    public String obterInfo() {

        String info="Nome: " + this.nome + "\n" +
        "matricula: " + this.matricula + "\n";
        
        for(Nota n: notas){
            info+=n.obterNota()+"\n";
           
        }
        info+="Média: "+this.media+"\n";

        if(this.media>=7 && this.media<=10){
            info+="\n"+"---Aprovado---"+"\n";
        }
        else{
            info+="\n"+"---Reprovado---"+"\n";
        }
        return info;
    }


   
    
}
