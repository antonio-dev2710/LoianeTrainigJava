package relacionamentoTemUm.exercicios;

public class Agenda {

    private String nomeAgenda;
    private Contato [] contatos;

    public String getNomeAgenda() {
        return nomeAgenda;
    }
    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }
    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo() {
        String info ="Nome: "+this.nomeAgenda;
        if (contatos != null ) {
            for (Contato c : contatos){
                info+=c.obterInfo()+"\n";
            }

        }
        return info;
    }



    
}
