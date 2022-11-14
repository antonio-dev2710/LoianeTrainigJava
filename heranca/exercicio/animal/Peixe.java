package heranca.exercicio.animal;

public class Peixe extends Animais {

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+" [Caracteristicas=" + caracteristicas + "]";
    }

}
