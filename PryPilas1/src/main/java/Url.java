import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Url {
    private int codigo;
    private String direccion;
    private LocalDateTime fechaHora;

    public Url(int codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
        fechaHora = LocalDateTime.now();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Url{" +
                "codigo:" + codigo +
                ", dirección:'" + direccion +
                ", fechaHora: " + fechaHora.format(formato) +
                '}';
    }
}
