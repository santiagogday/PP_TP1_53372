import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    //Atributos
    protected int id;
    protected String titulo;
    protected int cupoMaximo;
    protected static final int CUPO_MINIMO = 5;  //El cupo minimo para toda actividad es de 5 personas.


    //Listas
    private List <Inscripcion> inscripcionesActividad = new ArrayList<>(); //Lista de las inscripciones a una actividad

    //Getters de la lista
    public List<Inscripcion> getInscripcionesActividad() {
        return inscripcionesActividad;
    }

    //Constructor
    public Actividad(int id,String titulo,int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    //Metodos
    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion nuevaInscripcion = new Inscripcion(LocalDate.now(),"Ocupado");
        inscripcionesActividad.add(nuevaInscripcion);
        return nuevaInscripcion;
    }

    public void mostrarInscripciones(){
        System.out.println(inscripcionesActividad);
    }

    public final void  mostrarIdentificacion(){
        System.out.println("El id de la actividad es " + this.id);
    }

    public abstract double calcularCostoMateriales();//Metodo abstracto nuevo
    public abstract String getTipo();//Metodo abstracto nuevo

}
