package problema1;
import java.time.LocalDate;
public class Composicion {

    private String titulo;
    private int duracionSegundos;
    private int duracionMinutos;
    private String[] interprete;
    private Solicitud[] solicitudes;   // CORREGIDO
    private String generoMusical;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;

    public Composicion(String titulo, int duracionMinutos, int duracionSegundos,
                       String generoMusical, LocalDate fechaRegistro, LocalDate fechaEstreno) {

        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.generoMusical = generoMusical;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;

        interprete = new String[10];
        solicitudes = new Solicitud[10];
    }

    public void agregarInterprete(String nombre) {
        for (int i = 0; i < interprete.length; i++) {
            if (interprete[i] == null) {
                interprete[i] = nombre;
                break;
            }
        }
    }

    public void registrarSolicitud(Solicitud solicitud) {
        for (int i = 0; i < solicitudes.length; i++) {
            if (solicitudes[i] == null) {
                solicitudes[i] = solicitud;
                break;
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Composicion{" +
                "titulo='" + titulo + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", duracionSegundos=" + duracionSegundos +
                ", generoMusical='" + generoMusical + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaEstreno=" + fechaEstreno +
                '}';
    }
}



