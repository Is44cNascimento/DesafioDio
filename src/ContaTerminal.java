import Conta.DadosBancarios;

public class ContaTerminal {
    public static void main(String[] args) {

        DadosBancarios dados = new DadosBancarios(2001,"000-1","Isaac Nascimento",2001);


        System.out.println(dados.mostrarConta());

        while(dados.continuarConta()){
            dados.entrarConta(dados.PermitirEntrar(dados.getNumero(), dados.getAgencia(), dados.getNomeCliente()));
        }



    }
}