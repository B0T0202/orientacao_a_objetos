public class App {
    public static void main(String[] args) throws Exception {
        Produto[] lista = new Produto[4];
        lista[0] = new Produto("TV Oled 50 Polegadas", 5000);
        lista[1] = new ProdutoDigital("Red Dead Redemption 2", 300);
        lista[2] = new ProdutoFisico("Geladeira", 1000, 50);
        lista[3] = new ProdutoPerecivel("Queijo", 10, 1, 2);

        double valorTotal = 0;

        for (Produto item : lista) {
            valorTotal += item.calcularPrecoBase();
        }

        System.out.println("O valor total a se pagar é igual a R$" + valorTotal);
    }
}
