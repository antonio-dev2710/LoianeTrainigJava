package tratamentoErros.stacktracethrowable;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        //quem for utilizar esse método precisará tratar essa excessão
        System.out.println( "Entre com um número decimal");
        try {
            double numDecimal = lerNumero();
            System.out.println("voce digitou um numero:" + numDecimal );
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
