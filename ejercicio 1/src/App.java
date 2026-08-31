public class App {
    public static void main(String[] args) {
        Sala sala1 = new Sala("Sala 1");
        Sala sala2 = new Sala("Sala 2");

        EventoUniversitario evento1 = new EventoUniversitario("1","Futbol",200000,false);
        EventoUniversitario evento2 = new EventoUniversitario("2","Rugby",0,true);

        EventoUniversitario evento3 = new EventoUniversitario(evento1);
        EventoUniversitario evento4 = new EventoUniversitario(evento2);

        evento1.mostrarDatos();
        evento2.mostrarDatos();
        evento3.mostrarDatos();
        evento4.mostrarDatos();

        System.out.println("La cantidad de eventos creados es: "+EventoUniversitario.getCantidadEventos());

    }
}