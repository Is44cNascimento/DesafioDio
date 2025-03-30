package Conta;

import java.util.Scanner;

public class DadosBancarios {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public DadosBancarios() {
    }

    public DadosBancarios(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Boolean PermitirEntrar(int numero,String agencia,String nomeCliente) {

        if (numero == this.numero && agencia.equals(this.agencia) && nomeCliente.equals(this.nomeCliente)) {
            return true;
        }else {
            return false;
        }

    }

    public void entrarConta(boolean entrada) {
        if (entrada == true) {
            operacoes();


        }


    }

    private void operacoes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacoes da conta:\n 1-Sacar (Sacar) \n 2-Depositar (Depositar) \n 3-Sair");

        System.out.println("Digite o numero: ");
        int op = sc.nextInt();

        if (op == 1) {
            double saldo = getSaldo();
            System.out.println("Seu saldo disponivel é: " + saldo);
            System.out.println("Digite o valor de saque: ");
            double valorSaque = sc.nextDouble();
            setSaldo(saldo - valorSaque);

        }
    }



public  String mostrarConta() {
        String dados = getAgencia() + " " + getNumero() + " "+ getNomeCliente()+ " " + getSaldo();

        return dados;
}


}
