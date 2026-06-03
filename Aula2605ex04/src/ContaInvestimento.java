public class ContaInvestimento extends Conta {

    public ContaInvestimento(String t) {
        super(t);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = this.saldo * 0.01;
        double valorTotal = this.saldo + taxa;

        if (this.saldo < valorTotal) {
            return false;
        } else {
            this.saldo -= valorTotal;
            return true;
        }
    }
}
