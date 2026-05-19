public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 5000.00;
        p1.quantidadeEstoque = 6;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 150.00;
        p2.quantidadeEstoque = 50;

        System.out.printf("O produto %s possui %.2f em estoque.\n", p1.nome, p1.preco * p1.quantidadeEstoque);
        System.out.printf("O produto %s possui %.2f em estoque.\n", p2.nome, p2.preco * p2.quantidadeEstoque);

        p1.adicionarEstoque(6);
        p2.adicionarEstoque(10);

        System.out.printf("O produto %s possui %.2f em estoque.\n", p1.nome, p1.preco * p1.quantidadeEstoque);
        System.out.printf("O produto %s possui %.2f em estoque.\n", p2.nome, p2.preco * p2.quantidadeEstoque);

        p1.editarPreco(8000.00);
        System.out.printf("O produto %s possui %.2f em estoque.\n", p1.nome, p1.preco * p1.quantidadeEstoque);
    }
}
