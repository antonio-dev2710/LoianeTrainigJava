public class ContatoNaoExisteExeption extends Exception {
    private String nomeDoContato;

    
    public ContatoNaoExisteExeption(String nomeDoContato) {
        this.nomeDoContato = nomeDoContato;
    }


    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        
        return "Contato: "+ nomeDoContato+" não existe na agenda";
        
    }
    

}
