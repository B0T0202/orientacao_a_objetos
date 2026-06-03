public class IngressoVIP extends Ingresso {

    public IngressoVIP(String ne, double vb) {
        super(ne, vb);
    }

    @Override
    public double calcularValorFinal() {
        return this.valorBase += 120;
    }

    @Override
    public void imprimirTicket() {
        System.out.println("-– ACESSO VIP LIBERADO --");
        System.out.printf("Nome do Evento: %s\nValor Final: R$%.2f\n", this.nomeEvento, this.calcularValorFinal());
    }
}
