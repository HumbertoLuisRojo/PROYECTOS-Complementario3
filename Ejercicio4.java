import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> pal = List.of(1, 2, 4, 4, 4);
        List<Integer> listaSecundaria = pal.stream().map(elemento -> Ejercicio4.factorial(elemento)).distinct()
                .collect(Collectors.toList());
        System.out.println(listaSecundaria);
    }

    public static Integer factorial(Integer numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

}