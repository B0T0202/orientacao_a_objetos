public class LampadaRGB implements DispositivoInteligente {
    protected String cor;

    public LampadaRGB(String c) {
        this.cor = c;
    }

    @Override
    public void ligar() {
        System.out.println("Acendendo luz " + this.cor);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando luz " + this.cor);
    }

}
