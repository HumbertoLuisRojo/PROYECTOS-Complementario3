import java.time.LocalDate;

public class alumno {
    private String nombre;
    private String apellido;
    private LocalDate cumple;

    public alumno(String nombre, String apellido, LocalDate cumple) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumple = cumple;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getSurname() {
        return apellido;
    }

    public void setSurname(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getBirthday() {
        return cumple;
    }

    public void setBirthday(LocalDate cumple) {
        this.cumple = cumple;
    }
}