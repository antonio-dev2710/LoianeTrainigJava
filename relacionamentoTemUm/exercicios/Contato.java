package relacionamentoTemUm.exercicios;

public class Contato {
    String nomeContato;
    String email;
    String telefone;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String obterInfo() {
        return "Nome: " + this.nomeContato + "\n" +
                "Email: " + this.email + "\n" +
                "Telefone: " + this.telefone;
    }

}
