package heranca.exercicio.impostoRend;

import javax.lang.model.util.ElementScanner14;

public class PessoFisica extends Contribuinte {

    private double totalIr;

    

   
    @Override
    public String toString() {
        return "Pessoa Física [total IR=" + totalIr +"\n"+ " nome =" + nome + ", rendaBruta=" + rendaBruta
        + ", aliquota=" + aliquota + ", parcelaRed=" + parcelaRed + "]"+"\n";
    }




    public String calcularImposto(double rendaBruta) {
        if (this.rendaBruta > 0 && this.rendaBruta <= 1400) {
            this.aliquota = 0;
            this.parcelaRed = 0;

        } else if (this.rendaBruta > 1400 && this.rendaBruta <= 2100) {
            this.aliquota = 10;
            this.parcelaRed = 100;
        } else if (this.rendaBruta > 2100 && this.rendaBruta <= 2800) {
            this.aliquota = 15;
            this.parcelaRed = 270;
        } else if (this.rendaBruta > 2800 && this.rendaBruta <= 3600) {
            this.aliquota = 25;
            this.parcelaRed = 500;
        } else {
            this.aliquota = 30;
            this.parcelaRed = 500;
        }
        totalIr = (super.rendaBruta * (super.aliquota / 100)) - super.parcelaRed;
        return "Valor iR " + totalIr;
    }




    public double getTotalIr() {
        return totalIr;
    }




    public void setTotalIr(double totalIr) {
        this.totalIr = totalIr;
    }

}
