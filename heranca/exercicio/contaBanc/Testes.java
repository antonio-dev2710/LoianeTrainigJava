package heranca.exercicio.contaBanc;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaEspecial cEspecial = new ContaEspecial("234543", "Antonio", 500, 1000);

      ContaPoupanca cPoupanca = new ContaPoupanca("5785656", "André", 800,  15);

        System.out.println("=================================");
        System.out.println("Conta Especial");
        System.out.println("=================================");

        System.out.println(cEspecial);

        System.out.println("Deposite um valor");
        double valorDeposito = scan.nextDouble();

        System.out.println("Valor depositado: " + cEspecial.depositar(valorDeposito));

        System.out.println("Saque um valor");
        double valorSaque = scan.nextDouble();
        if (cEspecial.getSaldo() < valorSaque) {
            System.out.println(
                    "Seu saldo é maior que o valor que vc tem na conta logo será necessário utilizar seu limite de: "
                            + cEspecial.getLimite());
        }

        System.out.println("Valor Sacado: " + cEspecial.sacar(valorSaque));

        System.out.println("=================================");
        System.out.println("Conta Poupança");
        System.out.println("=================================");

        System.out.println(cPoupanca);

        System.out.println("Deposite um valor");
        valorDeposito = scan.nextDouble();

        System.out.println("Valor depositado: " + cPoupanca.depositar(valorDeposito));

        System.out.println("Saque um valor");
        valorSaque = scan.nextDouble();

        System.out.println("Valor depositado: " + cPoupanca.sacar(valorSaque));

        System.out.println("Rendimento: " + cPoupanca.calcularNovoSaldo());
        System.out.println(cPoupanca);

    }

}
