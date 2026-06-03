public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String n, double p) {
        this.nome = n;
        this.precoBase = p;
    }

    public double calcularPrecoBase() {
        return this.precoBase;
    }
}
