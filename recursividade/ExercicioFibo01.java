package recursividade;

public class ExercicioFibo01 {
    public static void main(String[] args) {

        int fibonaci = seqfibo(9);

        System.out.println(fibonaci);
    }

    public static int seqfibo(int num) {
       
        if(num<2){
            return num;
        }
       
        
        return (seqfibo(num-1)) + (seqfibo(num-2));
    }
}