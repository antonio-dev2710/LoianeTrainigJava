package heranca.exercicio.contaBanc;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    int diaRendimento;

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String numeroDaConta, String nome, double saldo, int diaRendimento) {
        super(numeroDaConta, nome, saldo);
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
    }

    public boolean calcularNovoSaldo() {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get((Calendar.DAY_OF_MONTH))) {
            saldo *= 1.5;
            return true;
        }
        return false;

    }

    @Override
    public double sacar(double valor) {

        if (valor > super.saldo) {
            System.out.println("Não pode ser realizado o saque");
            return saldo;
        }

        return saldo -= valor;
    }

    @Override
    public double depositar(double valor) {
        // TODO Auto-generated method stub
        return saldo += valor;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

}
