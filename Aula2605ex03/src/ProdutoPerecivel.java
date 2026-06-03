public class ProdutoPerecivel extends ProdutoFisico {
    protected int diasParaVencer;

    public ProdutoPerecivel(String n, double p, double pkg, int d) {
        super(n, p, pkg);
        this.diasParaVencer = d;
    }

    @Override
    public double calcularPrecoBase() {
        double precoFinal = super.calcularPrecoBase();

        if (this.diasParaVencer <= 3) {
            double desconto = this.precoBase * 0.3;
            return precoFinal - desconto;
        } else {
            return precoFinal;
        }
    }
}
