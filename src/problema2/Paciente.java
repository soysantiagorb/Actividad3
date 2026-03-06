package problema2;
import java.time.LocalDate;
import java.time.Period;
public class Paciente {

        private String nombre;
        private String rfc;
        private LocalDate fechaNacimiento;
        private Consulta[] consultas;

        public Paciente(String nombre, String rfc, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.rfc = rfc;
            this.fechaNacimiento = fechaNacimiento;
            consultas = new Consulta[20];
        }

        public void agregarConsulta(Consulta c) {   // CORREGIDO
            for (int i = 0; i < consultas.length; i++) {
                if (consultas[i] == null) {
                    consultas[i] = c;
                    break;
                }
            }
        }

        public int calcularEdad() {
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }

        public int obtenerEdad() {
            return calcularEdad();
        }

        @Override
        public String toString() {
            return "Paciente{" +
                    "nombre='" + nombre + '\'' +
                    ", rfc='" + rfc + '\'' +
                    ", fechaNacimiento=" + fechaNacimiento +
                    ", edad=" + calcularEdad() +
                    '}';
        }
    }

