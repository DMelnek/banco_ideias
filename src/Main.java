import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente newClient = new Cliente();
        newClient.getNome();
        newClient.getIdade();

        System.out.println("Seu nome: " + newClient.getNome());
        System.out.println("Sua idade: " + newClient.getIdade() + " anos");


        if (newClient.getIdade() < 18) {
            throw new IllegalArgumentException("Cliente deve ter 18 anos ou mais para abrir uma conta.");


        } else {
            TransacoesCode transacao = new TransacoesCode();
            int acao = transacao.getAcao();

            switch (acao) {
                case 1:
                    System.out.println("Depósito selecionado.");

                    break;
                case 2:
                    System.out.println("Saque selecionado.");
                    // Lógica para saque
                    break;
                case 3:
                    System.out.println("Transferência selecionada.");
                    // Lógica para transferência
                    break;
                case 4:
                    System.out.println("Saindo...");
                    // Lógica para sair
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;


                Conta corrente = new ContaCorrente(newClient);
                corrente.depositar(500);

                Conta poupanca = new ContaPoupanca(newClient);

                corrente.transferir(50, poupanca);

                corrente.imprimirExtrato();
                poupanca.imprimirExtrato();
            }
        }
    }
}