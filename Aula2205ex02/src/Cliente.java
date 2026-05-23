public class Cliente {
    private String nome;
    private String cnh;
    private String numero;

    public Cliente(String nome, String cnh, String numero) {
        this.nome = nome;
        this.cnh = cnh;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnh() {
        return this.cnh;
    }

    public String getNumero() {
        return this.numero;
    }
}
