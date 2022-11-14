package tratamentoErros.exercicosExeptions.restaurante;

public class AgendaCheiaExption extends Exception{

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Posição preenchida"+super.getMessage();
    }

    
}
