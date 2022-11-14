import java.util.Arrays;

public class Contato {
    private int id;
    private String nome;
    private String telefone;
  
    private static int contador =0;
    // o id será controlado internamente assim como o contador
    public Contato(){
        id = contador++;
    }
    public int getId() {
        return id;
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
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    @Override
    public String toString() {
        return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
    }

    

    
  

    
}
