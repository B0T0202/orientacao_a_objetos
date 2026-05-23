public class App {
    public static void main(String[] args) throws Exception {
        Funcionarios f1 = new Funcionarios();
        f1.nome = "Ana";
        f1.salario = 2000.00f;
        f1.receberAumento(200);
        System.out.printf("Salario atual R$%.2f\n", f1.salario);

        Funcionarios f2 = new Funcionarios();
        f2.nome = "Carlos";
        f2.salario = 3000.00f;
        f2.receberAumento(400);
        System.out.printf("Salario atual R$%.2f\n", f2.salario);
    }
}
