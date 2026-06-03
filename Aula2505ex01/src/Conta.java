public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String t) {
        this.titular = t;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito concluído!");
    }

    public double getSaldo() {
        return this.saldo;
    }
}
