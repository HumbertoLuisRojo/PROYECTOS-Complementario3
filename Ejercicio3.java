import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> pal = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long cont = pal.stream().filter(p -> p.startsWith("B") || p.startsWith("b")).count();
        System.out.println(cont);
    }
}