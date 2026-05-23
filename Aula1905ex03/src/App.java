public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("Civic", "Honda", 2022, "Preto");

        c1.setMarca("Ford");

        System.out.printf("Modelo carro 1: %s\n", c1.getModelo());
        System.out.printf("Ano carro 1: %d\n", c1.getAno());

        Carro c2 = new Carro("Corolla", "Toyota", 2021, "Branco");
        System.out.printf("Modelo carro 2: %s\n", c2.getModelo());
        System.out.printf("Ano carro 2: %d\n", c2.getAno());

        Carro c3 = new Carro("Onix", "Chevrolet", 2023, "Vermelho");
        System.out.printf("Modelo carro 3: %s\n", c3.getModelo());
        System.out.printf("Ano carro 3: %d\n", c3.getAno());
    }
}
