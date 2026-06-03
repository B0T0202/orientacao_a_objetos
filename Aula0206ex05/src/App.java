import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Tarefa> tarefasPendentes = new ArrayList<>();

        tarefasPendentes.add(new Tarefa("Lavar Louça"));
        tarefasPendentes.add(new Tarefa("Varrer a casa"));
        tarefasPendentes.add(new Tarefa("Salvar o planeta de um apocalipse zumbi"));
        tarefasPendentes.add(new Tarefa("Salvar a filha do presidente dos EUA"));

        tarefasPendentes.get(3).finalizarTarefa();
        tarefasPendentes.get(2).finalizarTarefa();

        for (Tarefa tarefa : tarefasPendentes) {
            if (tarefa.getConcluida() == false) {
                System.out.println(tarefa.getDescricao());
            }
        }
    }
}
