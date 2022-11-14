package heranca.exercicio.animal;

public class Teste {
    public static void main(String[] args) {
        Peixe tubarao = new Peixe();
        tubarao.setNome(null);
        tubarao.setComprimento(null);
        tubarao.setNumeroPatas(null);
        tubarao.setCor(null);
        tubarao.setVelociade(null);
        tubarao.setCaracteristicas(null);

        Animais camelo = new Animais();
        camelo.setNome(null);
        camelo.setComprimento(null);
        camelo.setNumeroPatas(null);
        camelo.setCor(null);
        camelo.setVelociade(null);
        camelo.setAmbiente(null);

        Mamifero urso = new Mamifero();
        urso.setNome(null);
        urso.setComprimento(null);
        urso.setNumeroPatas(null);
        urso.setCor(null);
        urso.setVelociade(null);
        urso.setAmbiente(null);
        urso.setAlimento(null);
       
        Animais [] animal= new Animais[3];
        animal[0]=tubarao;
        animal[1]=camelo;
        animal[2]= urso;

        System.out.println("Zoo:");
        for(Animais n:animal){
            System.out.println(n.toString());
            System.out.println("----------------");

        }

    }
    
}
