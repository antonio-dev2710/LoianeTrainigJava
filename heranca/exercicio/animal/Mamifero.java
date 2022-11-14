package heranca.exercicio.animal;

public class Mamifero extends Animais {
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+" [Alimento=" + alimento + "]";
    }

    
    
    
}
