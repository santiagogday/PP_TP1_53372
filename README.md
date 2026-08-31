# PP_TP2_53289

## Descripción del Problema

La universidad requiere un sistema para la gestión y administración de eventos académicos (tales como charlas, jornadas, talleres y competencias) y el control de la inscripción de estudiantes.

El desarrollo abarca la implementación progresiva de un modelo orientado a objetos en Java que resuelve las siguientes necesidades:

* **Gestión de Eventos y Salas:** Registro y configuración de eventos universitarios con cálculo de costos estimados, impuestos y asignación de salas físicas bajo relaciones de agregación.
* **Administración de Actividades (Herencia y Polimorfismo):** Modelado de actividades académicas mediante una clase abstracta base y subclases concretas (`Charla` y `Taller`), cada una con comportamientos propios para el cálculo de costos de materiales y visualización. Las actividades forman parte del evento mediante una relación de composición.
* **Inscripción de Estudiantes:** Registro de alumnos en actividades específicas, gestionando las inscripciones intermedias y controlando los cupos máximos y mínimos.
* **Modelado en Memoria:** Representación del ciclo de vida y vinculación de las instancias en la memoria (Stack vs. Heap) durante la ejecución de la aplicación.
