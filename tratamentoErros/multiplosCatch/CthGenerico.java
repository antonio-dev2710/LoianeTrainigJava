package tratamentoErros.multiplosCatch;

public class CthGenerico {
    public static void main(String[] args) {
        int [] numeros = {4,8,6,32,64,128};
        int [] denominador = {2,0,4,8,0};
    
        for(int i =0; i<numeros.length;i++){
            try{
                System.out.println(numeros[i]+"/"+denominador[i]+" ="+(numeros[i]/denominador[i]));
                 //primeiro as excecoes mais específicas
            }catch(ArithmeticException e){
                System.out.println("Erro ao dividir por zero");

            }
            //super classe de todos os erros e exceções
            catch( Throwable e){
                System.out.println("Ocorreu um erro");


            }
            

           
            
        }
    }
   

    
}
