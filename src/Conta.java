public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        if (cliente.getIdade() < 18) {
            throw new IllegalArgumentException("Cliente deve ter mais de 18 anos para criar uma conta.");
        }

            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;


    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(String.format("Saque realizado com sucesso"));
        } else {
            System.out.println("Saldo insuficiente para saque");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(String.format("Deposito realizado"));

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência");
        }else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println(String.format("Transferência de %.2f para a conta %d realizada com sucesso.", valor, contaDestino.getNumero()));
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected  void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %S", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
