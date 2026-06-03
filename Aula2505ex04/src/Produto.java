public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String n, double p) {
        this.nome = n;
        this.precoBase = p;
    }

    public double calcularPrecoFinal() {
        return this.precoBase += this.precoBase * 1.1;
    }
}
