package tratamentoErros.multiplosCatch;

public class CthAgrupamento {
    public static void main(String[] args) {
        int[] numeros = { 4, 8, 6, 32, 64, 128 };
        int[] denominador = { 2, 0, 4, 8, 0 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominador[i] + " =" + (numeros[i] / denominador[i]));
                //familia parecida das exptions
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Um erro foi detectado");

            }

        }
    }

}
