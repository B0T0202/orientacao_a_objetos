public class App {
    public static void main(String[] args) throws Exception {
        PagamentoBoleto p1 = new PagamentoBoleto(2000);
        PagamentoCartao p2 = new PagamentoCartao(2500.50);

        p1.processarPagamento();
        p2.processarPagamento();
    }
}
