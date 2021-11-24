import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> pal = List.of(1, 2, 3, 4, 5);
        Integer potencia = 2;
        List<Integer> numerosElevados = pal.stream().map(elemento -> Ejercicio2.operacionPotencia(elemento, potencia))
                .collect(Collectors.toList());
        System.out.println(numerosElevados);
    }

    public static Integer operacionPotencia(Integer nro, Integer potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            return nro * operacionPotencia(nro, potencia - 1);
        }
    }
}