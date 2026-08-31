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


A partir del código desarrollado en el **Ejercicio 3**, se implementan los siguientes pasos:
* **Creación de entidades:**
  * 3 estudiantes.
  * 1 evento.
  * 1 sala.
  * 2 actividades asociadas al evento Charla y un Taller.
  * 2 estudiantes inscritos en la Charla.
  * 2 estudiantes inscritos en el Taller.

Respecto a eso, el mapa de memoria de ejecucion que pude desarrollar es el siguiente:
![Mapa de memoria ejercicio 4](Mapa%20de%20memoria%20ejercicio%204.png)

La salida por consola de la ejecucion del programa del ejercicio 4 es:

![Salida por consola](Ejecucion%20de%20programa.png)

