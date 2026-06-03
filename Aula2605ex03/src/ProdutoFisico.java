public class ProdutoFisico extends Produto {
    protected double pesoKg;

    public ProdutoFisico(String n, double p, double pkg) {
        super(n, p);
        this.pesoKg = pkg;
    }

    @Override
    public double calcularPrecoBase() {
        double frete = 5 * this.pesoKg;
        return this.precoBase + frete;
    }
}
