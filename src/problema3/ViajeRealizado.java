package problema3;
import java.time.LocalDate;
public class ViajeRealizado {

        private String ciudadDestino;
        private String direccion;
        private LocalDate fechaViaje;
        private LocalDate fechaRegreso;
        private String descripcionCarga;
        private double montoViaje;

        public ViajeRealizado(String ciudadDestino, String direccion, LocalDate fechaViaje,
                              LocalDate fechaRegreso, String descripcionCarga, double montoViaje) {

            this.ciudadDestino = ciudadDestino;
            this.direccion = direccion;
            this.fechaViaje = fechaViaje;
            this.fechaRegreso = fechaRegreso;
            this.descripcionCarga = descripcionCarga;
            this.montoViaje = montoViaje;
        }

        public void mostrarViaje() {
            System.out.println(this.toString());
        }

        @Override
        public String toString() {
            return "ViajeRealizado{" +
                    "ciudadDestino='" + ciudadDestino + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", fechaViaje=" + fechaViaje +
                    ", fechaRegreso=" + fechaRegreso +
                    ", descripcionCarga='" + descripcionCarga + '\'' +
                    ", montoViaje=" + montoViaje +
                    '}';
        }
    }


