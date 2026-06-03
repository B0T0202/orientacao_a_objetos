public class App {
    public static void main(String[] args) throws Exception {
        Ingresso[] lista = new Ingresso[5];
        lista[0] = new Ingresso("Filme das Backrooms", 50);
        lista[1] = new IngressoMeia("Show de Rock", 200);
        lista[2] = new IngressoVIP("Show de Rock", 300);
        lista[3] = new Ingresso("Show Michaell Jackson", 100);
        lista[4] = new IngressoVIP("Show Michaell Jackson", 200);

        double faturamentoTotal = 0.0;

        for (Ingresso item : lista) {
            item.imprimirTicket();
            faturamentoTotal += item.calcularValorFinal();
        }

        System.out.printf("O faturamento total da bilheteria é igual a R$%.2f\n", faturamentoTotal);
    }
}
