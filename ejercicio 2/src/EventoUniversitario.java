import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    //Atributos
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;


    //Lista de actividades de un evento
    private List<Actividad> actividadesEvento = new ArrayList<>();


    //Getters


    public String getTitulo() {
        return titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public String getId() {
        return id;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Actividad> getActividadesEvento() {
        return actividadesEvento;
    }

    //Constructor
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    //Constructor copia
    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id + "_copia";
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }

    //Métodos
    public double calcularCostoEstimado(){
        return this.costoBase;
    }

    public void asignarSala(Sala sala){
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo){
        Actividad nuevaActividad = new Actividad(id,titulo,cupo);
        actividadesEvento.add(nuevaActividad);
    }



    public void mostrarDatos() {
        System.out.println("\n--- Resumen del Evento: " + this.titulo + " ---");
        System.out.println("ID: " + this.id);
        System.out.println("Costo Base: " + (gratuito ? "Gratuito" : "$" + this.costoBase));
        System.out.println("Sala asignada: " + (sala != null ? sala.getId() : "Sin asignar"));
        System.out.println("Actividades:");
        for (Actividad act : actividadesEvento) {
            act.mostrarInscripciones();
        }
    }


    public static int getCantidadEventos(){
        return cantidadEventos;
    }


}
