import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> pal = new ArrayList<>();
        pal.add("Hola");
        pal.add(null);
        pal.add("Informatorio");
        pal.add("");
        List<String> listaArreglada = pal.stream().filter(Objects::nonNull).filter(p -> !p.equals(""))
                .collect(Collectors.toList());
        System.out.println(listaArreglada);
    }
}
