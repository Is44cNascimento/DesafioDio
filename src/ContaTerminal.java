import Conta.DadosBancarios;

public class ContaTerminal {
    public static void main(String[] args) {

        DadosBancarios dados = new DadosBancarios(2001,"000-1","Isaac Nascimento",200.01);


        System.out.println(dados.mostrarConta());
        dados.entrarConta(dados.PermitirEntrar(dados.getNumero(), dados.getAgencia(), dados.getNomeCliente()));

    }
}