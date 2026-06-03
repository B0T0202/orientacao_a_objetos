public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente c1 = new ContaCorrente("João");
        c1.depositar(100);

        ContaInvestimento c2 = new ContaInvestimento("Maria");
        c2.depositar(100);

        c1.transferir(c2, 50);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
