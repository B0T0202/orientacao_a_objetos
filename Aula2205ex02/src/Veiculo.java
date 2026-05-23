public class Veiculo {
    private String placa;
    private String modelo;
    private String categoria;
    private double valorDiaria;
    private boolean disponivel;
    private int diasAlugados;
    private Cliente clienteAtual;

    public Veiculo(String placa, String modelo, String categoria) {
        this.placa = placa;
        this.modelo = modelo;

        if (categoria.equals("Hatch")) {
            this.categoria = "Hatch";
            this.valorDiaria = 120;
        } else if (categoria.equals("Sedan")) {
            this.categoria = "Sedan";
            this.valorDiaria = 180;
        } else if (categoria.equals("SUV")) {
            this.categoria = "SUV";
            this.valorDiaria = 280;
        } else {
            System.out.println("Categoria inexistente!");
        }

        this.disponivel = true;
        this.diasAlugados = 0;
        this.clienteAtual = null;
    }

    public void alugarCarro(Cliente motorista, int dias) {
        if (this.disponivel == true) {
            this.disponivel = false;
            this.clienteAtual = motorista;
            this.diasAlugados = dias;
            System.out.println("Veículo alugado com sucesso!");
        } else {
            System.out.println("Esse veículo já foi alugado!");
        }
    }

    public double devolverCarro() {
        double valorTotal = this.valorDiaria * this.diasAlugados;
        this.disponivel = true;
        this.clienteAtual = null;
        this.diasAlugados = 0;
        return valorTotal;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public int getDiasAlugados() {
        return this.diasAlugados;
    }

    public Cliente getClienteAtual() {
        return this.clienteAtual;
    }
}
