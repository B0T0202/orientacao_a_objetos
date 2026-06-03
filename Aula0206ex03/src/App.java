import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Notebook");
        produtos.add("TV");
        produtos.add("Controle Remoto");

        System.out.println(produtos.size());

        for (String produto : produtos) {
            System.out.println(produto);
        }

        produtos.remove(1);
        System.out.println(produtos.size());

        for (String produto : produtos) {
            System.out.println(produto);
        }

    }
}
