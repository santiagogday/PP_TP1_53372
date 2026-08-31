public class App {
    public static void main(String[] args) {


        Estudiante estudiante1 = new Estudiante("4020", "Pedro");
        Estudiante estudiante2 = new Estudiante("4023", "Juan");
        Estudiante estudiante3 = new Estudiante("4030", "Maria");


        EventoUniversitario evento1 = new EventoUniversitario("1231", "Maraton", 50000, false);
        EventoUniversitario evento2 = new EventoUniversitario("1232", "Feria de Ciencias", 0, true);


        Sala sala1 = new Sala(1, "San Martin");
        Sala sala2 = new Sala(2, "Belgrano");

        evento1.asignarSala(sala1);
        evento2.asignarSala(sala2);

        evento1.crearActividad(2012, "Carrera 21km", 150, "Charla");
        evento1.crearActividad(2013, "Carrea 42km", 30, "Charla");

        evento2.crearActividad(2014, "Planetas", 50, "Taller");

        evento1.getActividades().get(0).inscribir(estudiante1);
        evento1.getActividades().get(0).inscribir(estudiante2);
        evento1.getActividades().get(1).inscribir(estudiante3);

        evento2.getActividades().get(0).inscribir(estudiante1);
        System.out.println("Mostrando datos de los eventos:");
        evento1.mostrarDatos();
        System.out.println();
        evento2.mostrarDatos();


        System.out.println("La cantidad total de eventos universitarios creados es: " + EventoUniversitario.getCantidadEventos());
    }
}
