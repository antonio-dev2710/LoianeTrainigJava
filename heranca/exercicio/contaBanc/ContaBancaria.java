package heranca.exercicio.contaBanc;

public abstract class ContaBancaria {
   private String numeroDaConta;
   private String nome;
   protected double saldo;


    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(){
        super();
    }

    public ContaBancaria(String numeroDaConta, String nome, double saldo) {
        super();
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "ContaBancaria [numeroDaConta=" + numeroDaConta + ", nome=" + nome + ", saldo=" + saldo + "]";
    }
    //metodos
    public abstract double sacar(double valor);
    //metodos
    public  abstract double depositar(double valor);

        



    

    
}