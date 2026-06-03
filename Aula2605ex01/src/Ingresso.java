public class Ingresso {
    protected String nomeEvento;
    protected double valorBase;

    public Ingresso(String ne, double vb) {
        this.nomeEvento = ne;
        this.valorBase = vb;
    }

    public double calcularValorFinal() {
        return this.valorBase;
    }

    public void imprimirTicket() {
        System.out.printf("Nome do Evento: %s\nValor Final: R$%.2f\n", this.nomeEvento, this.calcularValorFinal());
    }
}
