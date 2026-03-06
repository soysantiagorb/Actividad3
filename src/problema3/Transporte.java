package problema3;
import java.time.LocalDate;
public class Transporte {

        private String marca;
        private String modelo;
        private double cantidadMaxima;
        private LocalDate fechaAdquisicion;
        private ViajeRealizado[] viajesRealizados;

        public Transporte(String marca, String modelo, double cantidadMaxima, LocalDate fechaAdquisicion) {

            this.marca = marca;
            this.modelo = modelo;
            this.cantidadMaxima = cantidadMaxima;
            this.fechaAdquisicion = fechaAdquisicion;

            viajesRealizados = new ViajeRealizado[20];
        }

        public void asignarViaje(ViajeRealizado viajeRealizado) {
            for (int i = 0; i < viajesRealizados.length; i++) {
                if (viajesRealizados[i] == null) {
                    viajesRealizados[i] = viajeRealizado;
                    break;
                }
            }
        }

        public void cancelarViaje(ViajeRealizado viajeRealizado) {
            for (int i = 0; i < viajesRealizados.length; i++) {
                if (viajesRealizados[i] == viajeRealizado) {
                    viajesRealizados[i] = null;
                    break;
                }
            }
        }

        public void mostrarViajes() {
            for (ViajeRealizado v : viajesRealizados) {
                if (v != null) {
                    System.out.println(v);
                }
            }
        }

        @Override
        public String toString() {
            return "Transporte{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", cantidadMaxima=" + cantidadMaxima +
                    ", fechaAdquisicion=" + fechaAdquisicion +
                    '}';
        }
    }

