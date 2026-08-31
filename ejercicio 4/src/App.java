import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        // a. Se crean 3 estudiantes
        Estudiante estudiante1 = new Estudiante("53372", "Santiago");
        Estudiante estudiante2 = new Estudiante("54323", "Juan");
        Estudiante estudiante3 = new Estudiante("53124", "Maria");
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        // b. Se crea 1 evento
        EventoUniversitario evento = new EventoUniversitario("1", "Programacion", 25000, true);

        // c. Se crea 1 sala y se asigna al evento
        Sala sala = new Sala(1, "San Martin");
        evento.asignarSala(sala);

        // d. Se crean 2 actividades para el evento: una Charla y un Taller
        evento.crearActividad(2, "Javascript", 100, "Charla");
        evento.crearActividad(3, "Git y GitHub", 40, "Taller");

        // e. Se inscriben 2 estudiantes en la Charla (indice 0)
        evento.getActividades().get(0).inscribir(estudiante1);
        evento.getActividades().get(0).inscribir(estudiante2);

        // f. Se inscriben 2 estudiantes en el Taller (indice 1)
        evento.getActividades().get(1).inscribir(estudiante2);
        evento.getActividades().get(1).inscribir(estudiante3);

        // Mostrar informacion
        System.out.println("Mostrando datos del evento:");
        evento.mostrarDatos();

        System.out.println("La cantidad total de eventos universitarios creados es: " + EventoUniversitario.getCantidadEventos());
    }
}