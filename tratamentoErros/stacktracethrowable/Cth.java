package tratamentoErros.stacktracethrowable;

public class Cth {
    public static void main(String[] args) {
        int[] numeros = { 4, 8, 6, 32, 64, 128 };
        int[] denominador = { 2, 0, 4, 8, 0 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominador[i] + " =" + (numeros[i] / denominador[i]));
            } catch (Exception e) {
                
                e.printStackTrace();

            }

        }
    }

}