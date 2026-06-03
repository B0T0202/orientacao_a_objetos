public class Cachorro extends Animal {

    public Cachorro(String n, int i) {
        super(n, i);
    }

    public void latir() {
        System.out.printf("%s está latindo!\n", this.nome);
    }
}
