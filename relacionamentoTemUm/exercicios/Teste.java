package relacionamentoTemUm.exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String nomeagnd;
        System.out.println("Digite o nome da agenda");
        agenda.setNomeAgenda(scan.next());
        nomeagnd = agenda.getNomeAgenda();

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato();
            System.out.println("Digite o nome");
            contato.setNomeContato(scan.next());
            System.out.println("Digite o email");
            contato.setEmail(scan.next());
            System.out.println("Digite o telefone");
            contato.setTelefone(scan.next());
            //todos os sets da classe contato vai para o array de contatos que é um objeto da classe contato
            contatos[i] = contato;
        }

        agenda.setContatos(contatos);

       
        // Passar o metodo para listar todo os contatos
        if(agenda!=null){ 
            System.out.println( agenda.obterInfo());
        }
        
       

    }
}
