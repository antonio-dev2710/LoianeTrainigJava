package tratamentoErros.criandoPripiaExcessao;

public class MinhaException {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 4, 8, 5, 32, 21, 64, 128 };
        int[] denominador = { 2, 0, 4, 8, 0, 2, 4 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    // lançar a exception aq
                    //instacaindo excessão
                    throw new DivisaoNaoExata(numeros[i], denominador[i]);

                }
                System.out.println(numeros[i] + "/" + denominador[i] + " =" + (numeros[i] / denominador[i]));
                //capturando as execesões
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteu um erro");
                e.printStackTrace();

            }

        }
    }
}
