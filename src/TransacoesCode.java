import java.util.Scanner;

public class TransacoesCode implements IConta {

    private int acao;

    public TransacoesCode() {


        Scanner quest = new Scanner(System.in);

        System.out.println("Bem vindo! Gostaria de fazer uma transação?");
        System.out.println("Digite 1 para realizar um depósito");
        System.out.println("Digite 2 para realizar um saque");
        System.out.println("Digite 3 para realizar uma transferência");
        System.out.println("Digite 4 para sair");

        this.acao = quest.nextInt();

    }

    public int getAcao() {
        return acao;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {

    }


}
