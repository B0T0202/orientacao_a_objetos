public class Televisao implements DispositivoInteligente {
    protected String marca;

    public Televisao(String m) {
        this.marca = m;
    }

    @Override
    public void ligar() {
        System.out.println("Iniciando sistema " + this.marca);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV");
    }

}
