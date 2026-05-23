public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito concluido!");
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Erro! Impossível fazer o saque!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque concluido!");
        }
    }
}
