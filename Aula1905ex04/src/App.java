public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria("Yuri");
        System.out.println(conta.getSaldo());

        conta.depositar(500);
        System.out.println(conta.getSaldo());

        conta.sacar(1000);
        System.out.println(conta.getSaldo());

        conta.sacar(100);
        System.out.println(conta.getSaldo());
    }
}
