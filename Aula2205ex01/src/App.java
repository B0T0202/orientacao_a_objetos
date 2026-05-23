import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Quarto[] quartos = {
                new Quarto(1, "Simples"),
                new Quarto(2, "Simples"),
                new Quarto(3, "Luxo"),
                new Quarto(4, "Luxo"),
                new Quarto(5, "Simples"),
                new Quarto(6, "Simples"),
                new Quarto(7, "Luxo"),
                new Quarto(8, "Simples"),
                new Quarto(9, "Luxo"),
                new Quarto(10, "Luxo")
        };

        int opcao = 0;
        int numQuarto;
        double faturamento = 0;

        do {
            System.out.println("========================");
            System.out.println("   Hotel Transilvânia   ");
            System.out.println("========================");
            System.out.println("""
                    1. Mapa de Quartos
                    2. Fazer Check-in
                    3. Fazer Check-out
                    4. Buscar Hospede
                    5. Encerrar Expediente""");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    for (Quarto quarto : quartos) {
                        if (quarto.getOcupado() == true) {
                            System.out.printf("O quarto %d está ocupado por %s\n", quarto.getNumero(),
                                    quarto.getHospedeAtual().getNome());
                        } else {
                            System.out.printf("O quarto %d está livre!\n", quarto.getNumero());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite o número do quarto: ");
                    numQuarto = teclado.nextInt();
                    teclado.nextLine();

                    for (Quarto quarto : quartos) {
                        if (quarto.getNumero() == numQuarto && quarto.getOcupado() == false) {
                            System.out.println("Digite os dados do cliente: ");
                            System.out.print("Nome: ");
                            String nome = teclado.nextLine();
                            System.out.print("CPF: ");
                            String cpf = teclado.nextLine();
                            System.out.print("Telefone: ");
                            String telefone = teclado.nextLine();

                            System.out.println("Digite o número de dias que o hospede ficará: ");
                            int dias = teclado.nextInt();
                            teclado.nextLine();

                            quarto.checkIn(new Hospede(nome, cpf, telefone), dias);
                        } else if (quarto.getNumero() == numQuarto && quarto.getOcupado() == true) {
                            System.out.println("O quarto já está ocupado!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do quarto: ");
                    numQuarto = teclado.nextInt();
                    teclado.nextLine();

                    for (Quarto quarto : quartos) {
                        if (quarto.getNumero() == numQuarto) {
                            faturamento += quarto.checkOut();
                            System.out.println("Checkout concluido!");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do hospede: ");
                    String nomeHospede = teclado.nextLine();

                    for (Quarto quarto : quartos) {
                        if (quarto.getHospedeAtual() != null) {
                            if (quarto.getHospedeAtual().getNome().equals(nomeHospede) && quarto.getOcupado() == true) {
                                System.out.printf("Numero do quarto: %d\nTelefone do Hospede: %s\n", quarto.getNumero(),
                                        quarto.getHospedeAtual().getTelefone());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.printf("Faturamento: R$%.2f\n", faturamento);
                    System.out.println("Encerrando expediente!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        teclado.close();
    }
}
