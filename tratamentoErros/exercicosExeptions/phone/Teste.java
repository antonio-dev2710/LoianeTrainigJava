import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;
        while (opcao != 3) {
            opcao = obterMenu(scan);
            switch (opcao) {
                // consultar contato
                case 1:
                    ConsultarContato(scan, agenda);
                    break;
                case 2:
                    adicionarContato(scan, agenda);
                    break;
                case 3:
                    System.out.println("VC saiu da agenda");
                    System.exit(0);

            }
        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        System.out.println("Criando contato, entre com as informações");
        String nome = lerInformacao(scan, "Entre com o nome do contato");
        String telfone = lerInformacao(scan, "Entre com o telfone do contato");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telfone);

        System.out.println("Contato a ser criado");
        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaExeption e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        System.out.println("Contatos da agenda");
        System.out.println(agenda);

    }

    public static void ConsultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacao(scan, "Entre com o nome para pesquisar");
        try {
            if (agenda.consultarContato(nomeContato) >= 0) {
                System.out.println("Contato existe");
            } else {
                System.out.println("Contato não existe");
            }
        } catch (ContatoNaoExisteExeption e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());

        }
    }

    public static String lerInformacao(Scanner scan, String msg) {

        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;

    }

    public static int obterMenu(Scanner scan) {
        boolean entradaValida = false;
        int numero = 3;
        while (!entradaValida) {
            System.out.println("Digite um número");
            System.out.println("1: Consultar contato ");
            System.out.println("2: adicionar contato ");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();
                numero = Integer.parseInt(entrada);

                if (numero == 1 || numero == 2 || numero == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada inválida, digite novamente");
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente");
                e.printStackTrace();
            }

        }
        return numero;
    }
}
