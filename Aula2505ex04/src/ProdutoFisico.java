public class ProdutoFisico extends Produto {

    public ProdutoFisico(String n, double p) {
        super(n, p);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase += this.precoBase * 0.1 + 50;
    }
}
