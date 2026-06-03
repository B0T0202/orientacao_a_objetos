public class Diretor extends FuncionarioCLT {
    protected double bonusParticipacao;

    public Diretor(String n, double s, double b) {
        super(n, s);
        this.bonusParticipacao = b;
    }

    @Override
    public double calcularSalarioLiquido() {
        double valorComDesconto = super.calcularSalarioLiquido();
        return valorComDesconto += bonusParticipacao;
    }
}
