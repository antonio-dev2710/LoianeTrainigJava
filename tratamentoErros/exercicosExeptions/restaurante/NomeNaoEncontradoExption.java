package tratamentoErros.exercicosExeptions.restaurante;

public class NomeNaoEncontradoExption extends Exception{

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Esse nome não foi registrado"+super.getMessage();
    }

    
}
