import br.com.dio.desafio.bootcamp.Curso;
import br.com.dio.desafio.bootcamp.Mentoria;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);

        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição mentoria Java");

        System.out.println(mentoria);
    }
}
