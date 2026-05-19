public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aqui é a main!");

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Yuri";
        cliente1.idade = 22;
        cliente1.cpf = "111.111.111-11";
        cliente1.saldoEmLoja = 2000.00f;

        Cliente cliente2 = new Cliente();

        cliente2.nome = "Matheus";
        cliente2.idade = 20;
        cliente2.cpf = "222.222.222-22";
        cliente2.saldoEmLoja = 3000.00f;

        System.out.println(cliente1.nome);
        System.out.println(cliente2.nome);
    }
}
