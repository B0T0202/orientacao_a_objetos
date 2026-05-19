public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();

        c1.titular = "Yuri";
        c1.depositar(100);

        c1.sacar(150);
        System.out.println(c1.saldo);

        c1.sacar(50);
        System.out.println(c1.saldo);
    }
}
