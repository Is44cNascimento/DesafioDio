package Conta;

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

    public void entrarConta(int numero,String agencia, String nomeCliente, double saldo) {




    }

public  String mostrarConta() {
        String dados = getAgencia() + " " + getNumero() + " "+ getNomeCliente()+ " " + getSaldo();

        return dados;
}


}
