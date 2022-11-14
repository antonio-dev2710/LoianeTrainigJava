package relacionamentoTemUm;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Tyrion");
       
        //contato.setTelefone("(99)456049839");

        //tipo Endereco
        Endereco endereco = new Endereco();

        endereco.setCidade("Cidade");
        endereco.setNomeRua("Rua");
        endereco.setComplemento("Complemento da rua");

        //tipo telefone
        Telefone tel = new Telefone();
        Telefone tel1 = new Telefone();

        tel.setTipo("Casa");
        tel.setDdd("71");
        tel.setNumero("9939450694");

         tel1.setTipo("Trabalho");
        tel1.setDdd("21");
        tel1.setNumero("9847303872");
        
        Telefone [] telefone = new Telefone[2];
        telefone[0]=tel;
        telefone[1]=tel1;
        //setar nos contatos
       contato.setTelefones(telefone);



        
       contato.setEndereco(endereco);
        //a mesma coisa para o telefone
        if(contato!=null && contato.getEndereco()!=null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato!=null && contato.getTelefones()!=null){
            for(Telefone t:contato.getTelefones())
            System.out.println(t.getDdd());
        }
        
        
    }
       


    

    
}
