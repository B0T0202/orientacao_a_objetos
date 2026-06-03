public class App {
    public static void main(String[] args) throws Exception {
        Animal a1 = new Animal("Irineu, você não sabe nem eu", 9999);
        a1.dormir();

        Cachorro c1 = new Cachorro("Rex", 6);
        c1.dormir();
        c1.latir();

        Gato g1 = new Gato("Dr Otto", 5);
        g1.dormir();
        g1.miar();
    }
}
