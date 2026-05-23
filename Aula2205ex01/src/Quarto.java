public class Quarto {
    private int numero;
    private String tipo;
    private double valorDiaria;
    private int diasOcupados;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo) {
        this.numero = numero;

        if (tipo.equals("Simples")) {
            this.tipo = tipo;
            this.valorDiaria = 100.00;
        } else if (tipo.endsWith("Luxo")) {
            this.tipo = tipo;
            this.valorDiaria = 250.00;
        } else {
            System.out.println("Tipo inválido!");
        }

        this.ocupado = false;
        this.diasOcupados = 0;
        this.hospedeAtual = null;
    }

    public void checkIn(Hospede novoHospede, int dias) {
        if (this.ocupado == false) {
            this.ocupado = true;
            this.hospedeAtual = novoHospede;
            this.diasOcupados = dias;
        } else {
            System.out.println("O quarto já está ocupado!");
        }
    }

    public double checkOut() {
        double valorTotal = this.diasOcupados * this.valorDiaria;
        this.ocupado = false;
        this.diasOcupados = 0;
        this.hospedeAtual = null;
        return valorTotal;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public int getDiasOcupados() {
        return this.diasOcupados;
    }

    public boolean getOcupado() {
        return this.ocupado;
    }

    public Hospede getHospedeAtual() {
        return this.hospedeAtual;
    }
}
