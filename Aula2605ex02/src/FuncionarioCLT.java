public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularSalarioLiquido() {
        double descontoINSS = this.salarioBase * 0.08;
        double descontoValeTransporte = this.salarioBase * 0.06;
        return this.salarioBase - descontoINSS - descontoValeTransporte;
    }
}
