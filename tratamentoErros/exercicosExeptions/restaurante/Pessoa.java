package tratamentoErros.exercicosExeptions.restaurante;

import relacionamentoTemUm.Contato;

public class Pessoa {

    private String nome;
    private String telefone;
    private String cargo;
    private String salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private int id;
    private static int contador=0;
    
    public Pessoa() {
        id= contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", telefone="+telefone +"]";
    }

}
