import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Musica> playList = new ArrayList<>();

        playList.add(new Musica("Puppet Master", "Metalica"));
        playList.add(new Musica("Sweet Child O'Mine", "Gun's n Roses"));
        playList.add(new Musica("Give me Love", "George Harrison"));

        for (Musica musica : playList) {
            System.out.printf("Tocando: %s - %s\n", musica.getTitulo(), musica.getArtista());
        }
    }
}
