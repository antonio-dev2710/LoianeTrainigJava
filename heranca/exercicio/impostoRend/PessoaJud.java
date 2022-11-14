package heranca.exercicio.impostoRend;

public class PessoaJud extends Contribuinte {
    private double totalIr;

    @Override
    public String toString() {
        return "Pessoa jurídica [total IR =" + totalIr + "\n" + " nome =" + nome + ", renda Bruta =" + rendaBruta
                + "]" + "\n";
    }

    public String calcularImposto(double rendaBruta) {

        totalIr = (10 / 100) * rendaBruta;
        return "Valor iR " + totalIr;
    }

}
