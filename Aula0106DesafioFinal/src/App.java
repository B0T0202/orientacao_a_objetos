public class App {
    public static void main(String[] args) throws Exception {
        Televisao tv = new Televisao("Tv Sansung");
        tv.ligar();
        tv.desligar();

        LampadaRGB l = new LampadaRGB("Branca");
        l.ligar();
        l.desligar();
    }
}
