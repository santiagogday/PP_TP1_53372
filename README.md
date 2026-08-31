# PP_TP2_53289

# Sistema de Gestión de Biblioteca Universitaria - TP2

Trabajo práctico desarrollado en Java para la materia. El sistema permite administrar una biblioteca universitaria gestionando el catálogo de recursos bibliográficos (libros y revistas), el préstamo a usuarios, las sanciones por mora y la disponibilidad de ejemplares.

Se aplicaron los conceptos principales de Programación Orientada a Objetos vistos en clase: herencia, clases abstractas, polimorfismo, encapsulamiento e interfaces.

---

## Estructura de clases

* **App.java**: Clase principal con el `main` y el menú interactivo por consola para interactuar con el sistema.
* **Biblioteca.java**: Modula la lógica global, el registro de préstamos, el control de stock y el cálculo de penalizaciones.
* **RecursoBibliografico.java**: Clase madre abstracta con los atributos y métodos comunes (código, título, año de publicación y estado de disponibilidad).
* **Libro.java**: Subclase para libros de texto (aplica un plazo de préstamo extendido y cálculo de mora según edición).
* **Revista.java**: Subclase para publicaciones periódicas (préstamo corto y sin costo adicional de reserva).
* **Usuario.java**: Clase base para los miembros registrados (estudiantes y docentes).
* **Prestamo.java**: Relaciona a un usuario con el recurso prestado, registrando fecha de inicio, fecha límite y fecha de devolución real.
* **Sancionable.java**: Interfaz que define los métodos para aplicar multas o bloqueos temporales por devolución tardía.

---

## POO aplicada

* **Herencia y Clases Abstractas:** `RecursoBibliografico` funciona como clase base abstracta de la cual heredan `Libro` y `Revista`, compartiendo lógica estructural y obligando a implementar métodos específicos.
* **Polimorfismo:** Se sobrescribió el método `calcularDiasPrestamo()` y `calcularMora()` con `@Override` en cada subclase para adaptar las reglas según el tipo de publicación.
* **Encapsulamiento:** Todos los atributos de las entidades están definidos con visibilidad `private` y su acceso o modificación se realiza exclusivamente mediante métodos getters y setters.
* **Interfaces:** Implementación de `Sancionable` para desacoplar el cálculo de penalizaciones del modelo de datos principal.

---

## Cómo ejecutarlo

1. Clonar este repositorio o descargar los archivos fuente.
2. Abrir el proyecto en IntelliJ IDEA o cualquier IDE compatible con Java (JDK 11 o superior recomendado).
3. Asegurarse de que el directorio `src` esté marcado como *Sources Root*.
4. Ejecutar la clase `App.java` para iniciar la aplicación por consola.

---

## Capturas y Diagramas

* [Diagrama de Clases UML](./docs/diagrama_clases.png)
* [Ejecución del programa](./docs/captura_consola.png)
