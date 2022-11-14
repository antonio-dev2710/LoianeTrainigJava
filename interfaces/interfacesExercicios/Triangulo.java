package interfaces.interfacesExercicios;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
    private double h;
    private double areaTriangulo;

    @Override
    public double calcularArea(double lado) {
        areaTriangulo= lado*getH()/2;
        return areaTriangulo;
    }


    public double getH() {
        return h;
    }


    public void setH(double h) {
        this.h = h;
    }


    @Override
    public String toString() {
        return super.toString()+" "+ "Área= " + areaTriangulo ;
    }
    
    
}
