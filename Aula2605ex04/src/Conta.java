public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String t) {
        this.titular = t;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor) == true) {
            contaDestino.depositar(valor);
        } else {
            System.out.println("Impossível transferir esse valor!");
        }
    }
}
