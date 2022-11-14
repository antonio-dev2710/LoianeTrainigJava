package heranca.exercicio.animal;

public  class Animais {
    private String nome;
    private String comprimento;
    private String numeroPatas;
    private String cor;
    private String ambiente;
    private String velociade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(String numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getVelociade() {
        return velociade;
    }

    public void setVelociade(String velociade) {
        this.velociade = velociade;
    }

    @Override
    public String toString() {
        return " [ Animal=" + nome+"\n" + " Comprimento=" + comprimento +"\n" + " Patas=" + numeroPatas +"\n" + " Cor="+ cor +"\n" + " Ambiente=" + ambiente +"\n" + ", Velociade=" + velociade + "]";
    }

}
