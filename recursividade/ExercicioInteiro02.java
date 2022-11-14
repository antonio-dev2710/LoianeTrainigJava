package recursividade;

public class ExercicioInteiro02 {
    public static void main(String[] args) {

        int fibonaci = seqfibo(5);

        System.out.println(fibonaci);
    }

    public static int seqfibo(int num) {
       
        if(num==0){
            return 1;
        }
       
        
        return num+ (seqfibo(num-1));
    }
}