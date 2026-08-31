## Descripción

El objetivo del proyecto es implementar un sistema en Java para gestionar eventos universitarios (charlas y talleres), administrando sus actividades y la inscripción de estudiantes.

Se aplican los conceptos fundamentales de la Programación Orientada a Objetos:

* **Encapsulamiento y constructores:** modificadores de acceso, inicialización de atributos y uso de constructor por copia.
* **Relaciones entre clases:**
  * **Agregación:** Asignación de salas a los eventos (la sala existe independientemente del evento).
  * **Composición:** Gestión de actividades dentro de cada evento (el ciclo de vida de la actividad depende del evento).
  * **Asociación:** Manejo de inscripciones vinculando estudiantes con actividades mediante una clase intermedia (`Inscripcion`).
* **Herencia y Polimorfismo:** Implementación de una clase abstracta `Actividad` y sus subclases `Charla` y `Taller`, sobrescribiendo métodos para calcular costos y mostrando datos de forma polimórfica.
* **Uso de modificadores `final`:** atributos y metodos constantes.


### Mapa de memoria ejercicio 4
Mediante el codigo que desarrollamos en el ejercicio 3 se nos pidio que:
*Se crean 3 estudiantes.
*Se crea 1 evento.
*Se crea 1 sala.
*Se crean 2 actividades para el evento: una Charla y un Taller.
*Se inscriben 2 estudiantes en la Charla.
*Se inscriben 2 estudiante en el Taller.

Respecto a eso, el mapa de memoria de ejecucion que pude desarrollar es el siguiente:
![Mapa de memoria ejercicio 4](Mapa%20de%20memoria%20ejercicio%204.png)



