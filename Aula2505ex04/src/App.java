public class App {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto("Acer Nitro 5", 5600);

        double precoFinal;

        precoFinal = p.calcularPrecoFinal();
        System.out.println(precoFinal);

        ProdutoFisico pf = new ProdutoFisico("Mouse Havit", 250);
        precoFinal = pf.calcularPrecoFinal();
        System.out.println(precoFinal);

        ProdutoDigital pd = new ProdutoDigital("Resident Evil 4 Remake", 169);
        precoFinal = pd.calcularPrecoFinal();
        System.out.println(precoFinal);
    }
}
