package interfaces.interfacesExercicios;

public class Cubo extends Figura3D {

    

    @Override
    public double calcularArea(double lado) {
        // TODO Auto-generated method stub
        return 6*(lado*lado);
    }

    @Override
    public double calcularVolume(double a) {
        // TODO Auto-generated method stub
        return a*a*a;
    }
    
}
