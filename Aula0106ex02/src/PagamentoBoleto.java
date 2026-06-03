public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double v) {
        super(v);
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Gerando código de barras para o valor R$%.2f\n", this.valor);
    }

}
