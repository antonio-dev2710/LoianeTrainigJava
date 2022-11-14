package heranca.herancaPolimorf;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

   
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLinq(){
        return 0;
    }
    public String obterEtiquetaEndereco(){
        String s ="Endereco do Professor: ";
        s+=super.getEndereco();

        return s;
    }

}
