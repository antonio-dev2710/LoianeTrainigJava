package interfaces.intanceofHereanca;

public class Teste02 {
    public static void main(String[] args) {

        //transformacao de classe menor em uma classe maior
        //Upcasting
        //upcasting é automático
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;
     
        //ou:
        Pessoa aluno01= new Aluno();
        //é o mesmo que:
        Pessoa aluno03=(Pessoa) new Aluno();

        //exemplo de downcasting
        Pessoa aluno04 =(Aluno) aluno03;
        Object ob1 =obterString();
        //tentativa de downcasting
        // String é uma subclass do object
        //é possivel fzr um dowcasting pois o metodo está retornando uma String
        String s1=(String) ob1;

        //aq já sgnifica um Updcasting
        Object ob2 = "Minha String";
        //downcasting o objeto(ob2) está referenciando uma string 
        String s2 = (String) ob2;

        //Falha em tempo de execução o objeto não pode ser convertido em String
        //Não está fazendo refencia a uma String
        Object obj3 = new Object();
        String s3=(String) obj3;

        //O downcasting funciona só so vc estiver referenciando aquele tipo particular
        Object obj4 = obterInteiro();
        String s4=(String) obj4;
        



        
    }
    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
    
}
