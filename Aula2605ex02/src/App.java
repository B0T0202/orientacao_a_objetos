public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] lista = new Funcionario[4];
        lista[0] = new Funcionario("Matheus", 1500);
        lista[1] = new FuncionarioCLT("Gabriel", 2000);
        lista[2] = new FuncionarioPJ("Yuri", 7000);
        lista[3] = new Diretor("Pedro", 4500, 1000);

        double valorTotal = 0;

        for (Funcionario item : lista) {
            System.out.printf("Nome: %s\nSalario: R$%.2f\n", item.nome, item.calcularSalarioLiquido());
            valorTotal += item.calcularSalarioLiquido();
        }

        System.out.printf("Custo total da folha: R$%.2f\n", valorTotal);
    }
}
