import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<alumno> alumnos = List.of(new alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new alumno("Sebastian", "Sosa", LocalDate.of(1968, 2, 10)),
                new alumno("Fabricio", "Bustos", LocalDate.of(1992, 2, 8)),
                new alumno("Juan Manuel", "Insaurralde", LocalDate.of(2001, 5, 13)),
                new alumno("Andrés", "Roa", LocalDate.of(1964, 2, 5)),
                new alumno("Silvio", "Romero", LocalDate.of(1970, 7, 21)),
                new alumno("Julio César", "Falcioni", LocalDate.of(1956, 11, 11)));
        Map<String, Integer> alumnosConEdades = alumnos.stream().collect(
                Collectors.toMap(p -> (p.getName() + " " + p.getSurname()), p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.println(alumnosConEdades);
    }

    public static Integer getEdad(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}