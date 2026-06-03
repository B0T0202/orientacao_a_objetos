public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double v) {
        super(v);
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Enviando dados para a operadora de cartão. Valor R$%.2f", this.valor);
    }

}
