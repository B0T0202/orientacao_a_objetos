public class App {
    public static void main(String[] args) throws Exception {
        Assinatura a1 = new Assinatura(500);

        String beneficio;

        beneficio = a1.exibirBeneicios();
        System.out.println(beneficio);

        AssinaturaPremium a2 = new AssinaturaPremium(1000);
        beneficio = a2.exibirBeneicios();
        System.out.println(beneficio);
    }
}
