import Conta.DadosBancarios;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String nomeCliente;
        String agencia;

        System.out.println("Bem vindo ao banco bradesco");

        System.out.print("Digite o numero: ");
        numero = sc.nextInt();

        System.out.print("Digite a agencia com o digito: ");
        agencia = sc.next();

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = sc.next();






        DadosBancarios dados = new DadosBancarios(numero,agencia,nomeCliente,2001);


        System.out.println(dados.mostrarConta());


        System.out.println("Para entrar na conta digite: ");

        System.out.print("Digite o numero  da conta: ");
        int numero2 = sc.nextInt();


        System.out.print("Digite a agencia com o digito: ");
        String agencia2 = sc.next();





        while(dados.continuarConta()){
            dados.entrarConta(dados.PermitirEntrar(numero2, agencia2, dados.getNomeCliente()));
        }



    }
}