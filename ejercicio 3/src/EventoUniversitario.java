import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    // Atributos
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala;

    private List<Actividad> actividades = new ArrayList<>();

    // Constructor
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id + "_copia";
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;
        cantidadEventos++;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public Sala getSala() {
        return sala;
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    // Métodos
    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo) {
        if ("Charla".equalsIgnoreCase(tipo)) {
            Actividad nuevaCharla = new Charla(id, titulo, cupo, "Disertante a confirmar");
            this.actividades.add(nuevaCharla);
        } else if ("Taller".equalsIgnoreCase(tipo)) {
            Actividad nuevoTaller = new Taller(id, titulo, cupo, true);
            this.actividades.add(nuevoTaller);
        } else {
            System.out.println("Error: Tipo de actividad '" + tipo + "' no válido.");
        }
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo, String disertante) {
        if ("Charla".equalsIgnoreCase(tipo)) {
            this.actividades.add(new Charla(id, titulo, cupo, disertante));
        }
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo, boolean requiereNotebook) {
        if ("Taller".equalsIgnoreCase(tipo)) {
            this.actividades.add(new Taller(id, titulo, cupo, requiereNotebook));
        }
    }


    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0.0;
        }
        double costoTotalActividades = 0.0;
        for (Actividad act : this.actividades) {
            costoTotalActividades += act.calcularCostoMateriales();
        }
        return (this.costoBase + costoTotalActividades) * 1.21;
    }

    public void mostrarDatos() {
        System.out.println("---------------------");
        System.out.println("ID Evento: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("Sala: " + (this.sala != null ? this.sala.getNombre() : "Sin asignar"));
        System.out.println("Gratuito: " + (this.gratuito ? "Sí" : "No"));
        System.out.println(this.actividades.size() + " Actividad vinculada");

        int indice = 1;
        for (Actividad act : this.actividades) {
            System.out.print("  " + indice + ". " + act.getTipo() + " " + act.getTitulo() + " . ");
            act.mostrarIdentificacion();
            indice++;
        }
        System.out.println("-----------------------");
    }
}