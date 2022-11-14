package interfaces.interfacesExercicios;

public class Cilindro extends Figura3D{

    private double h;
    private double volumeCilindro;
    private double areaCilindro;
    
    @Override
    public double calcularVolume(double a) {
        volumeCilindro=PI*(a*a)*getH();
        return volumeCilindro;
    }

    @Override
    public double calcularArea(double lado) {
        areaCilindro=2*PI*lado*(lado + getH());
        return  areaCilindro;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString()+"Volume=  "  + volumeCilindro + ", Área= " + areaCilindro;
    }
    


    
}
