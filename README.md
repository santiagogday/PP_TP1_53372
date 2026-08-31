## Descripción del Trabajo Práctico

El objetivo del proyecto es implementar un sistema en Java para gestionar eventos universitarios (charlas y talleres), administrando sus actividades y la inscripción de estudiantes.

Se aplican los conceptos fundamentales de la Programación Orientada a Objetos:

* **Encapsulamiento y constructores:** Manejo de modificadores de acceso, inicialización de atributos y uso de constructor por copia.
* **Relaciones entre clases:**
  * **Agregación:** Asignación de salas a los eventos (la sala existe independientemente del evento).
  * **Composición:** Gestión de actividades dentro de cada evento (el ciclo de vida de la actividad depende del evento).
  * **Asociación:** Manejo de inscripciones vinculando estudiantes con actividades mediante una clase intermedia (`Inscripcion`).
* **Herencia y Polimorfismo:** Implementación de una clase base abstracta `Actividad` y sus subclases `Charla` y `Taller`, sobrescribiendo métodos para calcular costos y mostrando datos de forma polimórfica.
* **Uso de modificadores `final`:** Aplicación de atributos constantes (`final`) y métodos no redefinibles (`mostrarIdentificacion()`).
* **Gestión de memoria:** Análisis del comportamiento de los objetos en memoria (*Stack* vs. *Heap*) durante la ejecución.
