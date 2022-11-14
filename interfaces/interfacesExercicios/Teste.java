package interfaces.interfacesExercicios;

public class Teste {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        Triangulo triangulo = new Triangulo();
        Piramide piramide = new Piramide();

        cilindro.setNome("Cilindro");
        cilindro.setCor("Amarelo");
        cilindro.setH(5);
        

        piramide.setNome("Piramide");
        piramide.setCor("Vermelho");
        piramide.setH(8);
        

        triangulo.setNome("triangulo");
        triangulo.setCor("Vermelho");
        triangulo.setH(7);
        

        FiguraGeometrica[] fGeometricas = new FiguraGeometrica[3];

        // só a variável já chama o metodo toString

        fGeometricas[0] = cilindro;

        fGeometricas[1] = triangulo;
        fGeometricas[2] = piramide;

        System.out.println("Figura Geometricas");
        for (FiguraGeometrica f : fGeometricas) {

            // é usado na comparação de variaveis de referencia de objeto…para ser mais simples verifica se um objeto é de um tipo especifico
         
            
            // pode ser aplicado tambem em interfaces e subclasses, verificando se o objeto implementa uma determinada interface ou se extende uma superclasse
            if(f instanceof Figura2D){
                Figura2D figura2d=(Figura2D) f;
                System.out.println(figura2d.calcularArea(5));
            }
            if(f instanceof Figura3D){
                Figura3D figura3d=(Figura3D) f;
                System.out.println(figura3d.calcularArea(3));
                System.out.println(figura3d.calcularVolume(2.5));
            }
            //System.out.println(f);
            System.out.println("======================");
            
        }
        
    }
}
