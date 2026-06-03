public class Gato extends Animal {

    public Gato(String n, int i) {
        super(n, i);
    }

    public void miar() {
        System.out.printf("%s está miando!\n", this.nome);
    }
}
