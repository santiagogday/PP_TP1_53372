import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    //Atributos
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 5;  //El cupo minimo para toda actividad es de 5 personas.

    //Constructor
    public Actividad(int id,String titulo,int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    //Lista de inscripciones
    private List<Inscripcion> inscripcionesActividad = new ArrayList<>();

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

    public List<Inscripcion> getInscripcionesActividad() {
        return inscripcionesActividad;
    }

    //Metodos

    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion nuevaInscripcion = new Inscripcion(LocalDate.now(),"Confirmado",estudiante);
        inscripcionesActividad.add(nuevaInscripcion);
        return nuevaInscripcion;
    }

    public void mostrarInscripciones() {
        System.out.println("  Actividad: " + this.titulo + " (ID: " + this.id + ")");
        if (inscripcionesActividad.isEmpty()) {
            System.out.println("    No hay alumnos inscriptos.");
            return;
        }
        for (Inscripcion ins : inscripcionesActividad) {
            System.out.println("    - " + ins.getEstudiante().getNombre() + " (Legajo: " + ins.getEstudiante().getLegajo() + ")");
        }
    }


}
