import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }
    int i =0;
    int aux=0;
    public void adicionarContato(Contato c) throws AgendaCheiaExeption {
        boolean cheia = true;
      
        for (i=aux; i < contatos.length;) {

            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                aux++;
                break;
            }

            if (cheia) {
                // vai passar a exception criada aq
                // indica que a posicao da agenda está cheia
                throw new AgendaCheiaExeption();
            }

        }
    }

    public int consultarContato(String nome) throws ContatoNaoExisteExeption {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {

                    return i;
                }
            }

        }
        // exeption
        throw new ContatoNaoExisteExeption(nome);

    }

    @Override
    public String toString() {
        String s =" ";
        for(Contato c: contatos){
            if(c!=null){
                    s+=c.toString()+"\n";
            }
           
        }
        return s;
    }

   

    

}
