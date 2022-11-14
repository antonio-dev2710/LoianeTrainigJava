package relacionamentoTemUm.exercicio02;

public class Professor {
    String nome;
    String departamento;
    String email;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String obterInfoProfessor() {
        return "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "Departamento: " + this.departamento+ "\n";
    }

    
}
