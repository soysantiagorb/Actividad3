package problema1;
import java.time.LocalDate;
public class Solicitud {


        private String nombreInterprete;
        private LocalDate fechaSolicitud;
        private LocalDate fechaAutorizacion;
        private String companiaGrabadora;

        public Solicitud(String nombreInterprete, LocalDate fechaSolicitud, String companiaGrabadora) {
            this.nombreInterprete = nombreInterprete;
            this.fechaSolicitud = fechaSolicitud;
            this.companiaGrabadora = companiaGrabadora;
        }

        public void autorizar(LocalDate fechaAutorizacion) {
            this.fechaAutorizacion = fechaAutorizacion;
        }

        public void mostrarSolicitud() {
            System.out.println(this.toString());
        }

        @Override
        public String toString() {
            return "Solicitud{" +
                    "nombreInterprete='" + nombreInterprete + '\'' +
                    ", fechaSolicitud=" + fechaSolicitud +
                    ", fechaAutorizacion=" + fechaAutorizacion +
                    ", companiaGrabadora='" + companiaGrabadora + '\'' +
                    '}';
        }
    }


