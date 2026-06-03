public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Yuri");

        c1.depositar(100);
        double saldoAtual = c1.getSaldo();
        System.out.println("Saldo atual: " + saldoAtual);

        ContaPoupanca p1 = new ContaPoupanca("Yuri");
        p1.depositar(100);
        saldoAtual = p1.getSaldo();
        System.out.println("Saldo atual: " + saldoAtual);
        p1.renderJuros();
        saldoAtual = p1.getSaldo();
        System.out.println("Saldo atual: " + saldoAtual);
    }
}
