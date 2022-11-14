package tratamentoErros.exercicosExeptions.restaurante;

import java.io.PipedWriter;
import java.util.Scanner;

import relacionamentoTemUm.exercicios.Agenda;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Planilha planilha = new Planilha();
        int opcao = 1;
        while (opcao != 3) {
            System.out.println(lerOpcao());
            opcao = scan.nextInt();

            System.out.println("verificando as opções");
            switch (opcao) {
                case 1:
                    criarPessoa(planilha, scan);
                    break;
                case 2:
                    verificarNome(scan, planilha);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void criarPessoa(Planilha planilha, Scanner scan) {
        System.out.println("Criando funcinário...");

        System.out.println("Digite o  nome do funcionário");
        String nome = lerMenssagem(scan, "nome do funcionário");

        System.out.println("Digite o cargo do funcionário");
        String cargo = lerMenssagem(scan, "cargo do funcionário");

        System.out.println("Digite o telefone do funcionário");
        String telefone = lerMenssagem(scan, "telefone do funcionário");

        System.out.println("Digite o salário do funcionário");
        String salario = lerMenssagem(scan, "Salário do funcionário");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setSalario(salario);
        pessoa.setCargo(cargo);
        try {
            planilha.criarPessoa(pessoa);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        System.out.println(planilha);

    }

    public static void verificarNome(Scanner scan, Planilha planilha) {
        System.out.println("Digite o nome do funcionário: ");
        String nome = lerMenssagem(scan, "Nome do funcionário");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        int num = 0;
        String nomeExiste = "veficando nome...";
        try {
            num = planilha.verificarNome(nome);
            nomeExiste = "Esse nome está no banco de dados ";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            nomeExiste = "Esse nome não no banco de dados ";
        } finally {
            System.out.println(num);
            System.out.println(nomeExiste);
        }

    }

    public static String lerMenssagem(Scanner scan, String msg) {
        String mensagem = "Capturando mensagem... ";
        String entrada = scan.next();
        return entrada;

    }

    public static String lerOpcao( ) {
        String s = "digite uma opção: 1-criar, 2-verificar, 3-sair";
        
        return s;

    }

}
