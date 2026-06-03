public class App {
    public static void main(String[] args) throws Exception {
        Aluno[] alunos = new Aluno[4];
        alunos[0] = new Aluno("Yuri", 10, 8);
        alunos[1] = new Aluno("Pedro", 5, 7);
        alunos[2] = new Aluno("Ana", 8, 9);
        alunos[3] = new Aluno("Claudia", 7, 5);

        double somaNotas = 0;

        for (int i = 0; i < alunos.length; i++) {
            somaNotas += alunos[i].getMedia();
        }

        System.out.println("Média da turma: " + somaNotas / alunos.length);
    }
}
