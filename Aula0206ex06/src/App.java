import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Contato> listaContatos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        listaContatos.add(new Contato("Irineu", "11 11111-1111"));
        listaContatos.add(new Contato("Mateus", "22 22222-2222"));
        listaContatos.add(new Contato("Pedro", "33 33333-3333"));
        listaContatos.add(new Contato("João", "44 44444-4444"));

        System.out.print("Digite o nome que deseja buscar: ");
        String nome = teclado.nextLine();

        for (Contato item : listaContatos) {
            if (item.getNome().equals(nome)) {
                System.out.println(item.getTelefone());
            }
        }

        teclado.close();
    }
}
