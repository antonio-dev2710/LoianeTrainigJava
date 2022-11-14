package tratamentoErros.tryCath;

public class Exececao {
    public static void main(String[] args) {

        try{
            int [] vetor = new int[4];

            System.out.println("Antes do Exception");
    
            //nesse caso pode ser acessado até a posição do 0-3.
            vetor[4]=1;
    
            System.out.println("Esse texto não será impresso");
            //captura e tratamento da excessão
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Execeção ao acessar um indice do vetor que não existe");
            
        }
        System.out.println("Esse texto será impresso após a exception");
       
    }
}
