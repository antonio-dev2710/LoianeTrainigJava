package heranca.exercicio.impostoRend;

import java.util.Arrays;

public class Contribuinte {
    private  PessoFisica [] pessoaF;
    private  PessoaJud [] pessoajD;
   protected String  nome;
    protected double rendaBruta;
    protected double aliquota;
    protected double parcelaRed;
    

    public double getRendaBruta() {
        return rendaBruta;
    }


    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }


    public double getAliquota() {
        return aliquota;
    }


    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }


    public double getParcelaRed() {
        return parcelaRed;
    }


    public void setParcelaRed(double parcelaRed) {
        this.parcelaRed = parcelaRed;
    }

    public PessoFisica[] getPessoaF() {
        return pessoaF;
    }


    public void setPessoaF(PessoFisica[] pessoaF) {
        this.pessoaF = pessoaF;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    


    @Override
    public String toString() {
        return "Contribuintes [Pessoa física=" + Arrays.toString(pessoaF) + "\n"+ "\n"+", Pessoa jurídica=" + Arrays.toString(pessoajD);
    }


    public PessoaJud[] getPessoajD() {
        return pessoajD;
    }


    public void setPessoajD(PessoaJud[] pessoajD) {
        this.pessoajD = pessoajD;
    }

}
