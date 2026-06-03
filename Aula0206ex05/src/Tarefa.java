public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String d) {
        this.descricao = d;
        this.concluida = false;
    }

    public void finalizarTarefa() {
        this.concluida = true;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida() {
        return this.concluida;
    }
}
