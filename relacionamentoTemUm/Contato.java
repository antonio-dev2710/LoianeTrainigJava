package relacionamentoTemUm;

public class Contato {
    private String nome;
   
    private Telefone [] telefones;
    private Endereco endereco;



    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Telefone[] getTelefones() {
        return telefones;
    }
    public void setTelefones(Telefone[] telefone) {
        this.telefones = telefone;
    }
   
   



    
}
