public class IngressoMeia extends Ingresso {

    public IngressoMeia(String ne, double vb) {
        super(ne, vb);
    }

    @Override
    public double calcularValorFinal() {
        return this.valorBase -= this.valorBase * 0.5;
    }
}
