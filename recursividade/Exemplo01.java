package recursividade;

public class Exemplo01 {
    public static void main(String[] args) {

        int fatorialRecursivo = fatorial(5);

        System.out.println(fatorialRecursivo);
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        System.out.println(num);
        return num * (fatorial(num-1));
    }
}