import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante est1 = new Estudiante("55101", "Lucas Perez");
        Estudiante est2 = new Estudiante("55102", "Santiago Martinez");
        Estudiante est3 = new Estudiante("55103", "Mateo Suarez");

        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);

        EventoUniversitario evento1 = new EventoUniversitario("1", "Truco", 15000.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("2", "Ajedrez", 0.0, true);

        Sala salaA = new Sala(101, "San Martin");
        Sala salaB = new Sala(204, "Belgrano");

        evento1.asignarSala(salaA);
        evento2.asignarSala(salaB);

        evento1.crearActividad(1, "Reglas basicas", 50);
        evento1.crearActividad(2, "Estrategias", 25);

        evento2.crearActividad(3, "Jugadas clasicas", 30);


        evento1.getActividadesEvento().get(0).inscribir(est1);
        evento1.getActividadesEvento().get(0).inscribir(est2);
        evento1.getActividadesEvento().get(1).inscribir(est3);


        evento2.getActividadesEvento().get(0).inscribir(est1);
        evento2.getActividadesEvento().get(0).inscribir(est3);


        evento1.mostrarDatos();
        evento2.mostrarDatos();


        System.out.println("-------------------------------------------");
        System.out.println("Total de eventos universitarios creados: " + EventoUniversitario.getCantidadEventos());
    }
}
