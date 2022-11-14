package interfaces.interfacesExercicios;

public class Piramide extends Figura3D {
    private double h;
    private double volumePiramide ;
    private double areaPiramide ;
    @Override
    public double calcularVolume(double a) {
        volumePiramide =(a*a)*getH()/3;
        return volumePiramide;
    }

    @Override
    public double calcularArea(double a) {
       
        areaPiramide= (a*a)+(2*a*getH());
        return  areaPiramide;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString()+" Volume= " + volumePiramide + ", Área= " + areaPiramide;
    }

    
    
    
}
