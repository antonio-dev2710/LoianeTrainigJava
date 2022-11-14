package heranca.exercicio.contaBanc;

public class ContaEspecial extends ContaBancaria {
    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString()+
        "\n"+"ContaEspecial [limite=" + limite + "]";
    }

    public ContaEspecial(String numeroDaConta, String nome, double saldo, double limite) {
        super(numeroDaConta, nome, saldo);
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        if(valor>super.saldo ||super.saldo<=0 ){
            return limite-=valor;
        }
        return super.saldo-=valor;
        
    }

    @Override
    public double depositar(double valor) {
        // TODO Auto-generated method stub
        return  saldo+=valor;
    }

}
