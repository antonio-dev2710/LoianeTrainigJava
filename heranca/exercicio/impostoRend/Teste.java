package heranca.exercicio.impostoRend;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PessoFisica[] pessoaFisica= new PessoFisica [2];
        PessoaJud[] pessoaJuridica= new PessoaJud [2];
       Contribuinte contribuinte =new Contribuinte();
       
        for(int i =0;i<pessoaFisica.length;i++){
            PessoFisica pessoa= new PessoFisica();
            PessoaJud pJud =new PessoaJud();

            System.out.println("Digite o nome do contribuinte fisico");
            String nome=scan.next();

            System.out.println("Digite o nome do contribuinte Jurídico");
            String nomeJ=scan.next();
            
            //físico
           System.out.println("Digite o valor bruto");
            pessoa.setRendaBruta(scan.nextDouble());
            pessoa.setNome(nome);
            pessoa.calcularImposto(pessoa.getRendaBruta());

         //Jud
            System.out.println("Digite o valor bruto jud");
           pJud.setRendaBruta(scan.nextDouble());
           pJud.setNome(nomeJ);
           pJud.calcularImposto(pJud.getRendaBruta());


            //físico
            System.out.println( pessoa.calcularImposto(pessoa.getRendaBruta()));

            //juridico
             
             System.out.println( pJud.calcularImposto(pJud.getRendaBruta()));


    
            //todos os valores de pessoa para pessoa
            pessoaFisica[i]=pessoa;
            pessoaJuridica[i]=pJud;
            
        }
        contribuinte.setPessoaF(pessoaFisica);
        contribuinte.setPessoajD(pessoaJuridica);
        System.out.println("===============");
        System.out.println("Valor IR de pessoa física e Jurídica");
        System.out.println("===============");
        System.out.println(contribuinte.toString());
        
       
       

    
    }

   
    
}
