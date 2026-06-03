public class ProdutoDigital extends Produto {

    public ProdutoDigital(String n, double p) {
        super(n, p);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase;
    }
}
