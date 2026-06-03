public class Gerente extends Funcionario {
    protected int senhaCofre;

    public Gerente(String n, double s, int sc) {
        super(n, s);
        this.senhaCofre = sc;
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.2;
    }
}
