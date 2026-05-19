public class Conta {
    String titular;
    double saldo;

    public void depositar(double valor) {
        this.saldo += valor;

        System.out.println("Valor depositado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Erro! Valor maior que o saldo!");
        } else {
            this.saldo -= valor;

            System.out.println("Valor sacado com sucesso!");
        }
    }
}
