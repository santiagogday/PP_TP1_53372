public class EventoUniversitario {
    //Atributos
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;


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
        System.out.println("La sala asignada es " + sala.getNombre());
    }

    public void crearActividad(int id, String titulo, int cupo){
        System.out.println("Se creo la actividad: ID="+id+", Titulo="+titulo+", Cupo="+cupo);
    }

    public void mostrarDatos(){
        System.out.println("ID: "+this.id);
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Costo base: "+this.costoBase);
        System.out.println("Gratuito: "+this.gratuito);
        System.out.println("-------------------");
    }

    public static int getCantidadEventos(){
        return cantidadEventos;
    }


}
