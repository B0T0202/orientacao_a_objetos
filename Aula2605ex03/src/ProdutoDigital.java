public class ProdutoDigital extends Produto {

    public ProdutoDigital(String n, double p) {
        super(n, p);
    }

    @Override
    public double calcularPrecoBase() {
        double desconto = this.precoBase * 0.1;
        return this.precoBase - desconto;
    }
}
