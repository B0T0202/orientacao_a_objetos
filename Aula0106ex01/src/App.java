public class App {
    public static void main(String[] args) throws Exception {
        Vendedor v1 = new Vendedor("Yuri", 2000.0);
        Vendedor v2 = new Vendedor("Almir", 1700.0);

        System.out.println("Salario v1: " + v1.calcularSalario());
        System.out.println("Salario v2: " + v2.calcularSalario());

        Gerente g1 = new Gerente("Cleber", 10000.0);
        Gerente g2 = new Gerente("Pedro", 8000.0);

        System.out.println("Salario g1: " + g1.calcularSalario());
        System.out.println("Salario g2: " + g2.calcularSalario());
    }
}
