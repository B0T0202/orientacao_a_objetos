public class ContaCorrente extends Conta {

    public ContaCorrente(String t) {
        super(t);
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + 2;

        if (this.saldo < valorTotal) {
            return false;
        } else {
            this.saldo -= valorTotal;
            return true;
        }
    }
}
