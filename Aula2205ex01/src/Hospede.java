public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;

    public Hospede(String nomeHospede, String cpfHospede, String telefoneHospede) {
        this.nome = nomeHospede;
        this.cpf = cpfHospede;
        this.telefone = telefoneHospede;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
