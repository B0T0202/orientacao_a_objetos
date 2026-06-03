public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1, 100);
        c1.cobrarTarifa();

        ContaEstudante c2 = new ContaEstudante(2, 100);
        c2.cobrarTarifa();

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
