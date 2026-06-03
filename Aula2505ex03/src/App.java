public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Igor", 5500);
        double bonusFuncionario = f1.calcularBonus();
        System.out.printf("O bonus de %s é igual a R$%.2f\n", f1.nome, bonusFuncionario);

        Gerente g1 = new Gerente("Yuri", 9500, 1234);
        double bonusGerente = g1.calcularBonus();
        System.out.printf("O bonus de %s é igual a R$%.2f\n", g1.nome, bonusGerente);
    }
}
