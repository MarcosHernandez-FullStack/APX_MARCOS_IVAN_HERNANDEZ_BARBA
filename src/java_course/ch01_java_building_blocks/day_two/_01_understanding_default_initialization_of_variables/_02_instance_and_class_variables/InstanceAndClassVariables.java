// 1. Una variable clase se identifica con la palabra clave static. 
// 2. Una variable de instancia no tiene la palabra clave static.


| Tipo                  | Dónde se declara                                   | Pertenece a      | Ejemplo                |
| --------------------- | -------------------------------------------------- | ---------------- | ---------------------- |
| Variable local        | Dentro de un método o bloque                       | Al método/bloque | `int edad = 20;`       |
| Variable de instancia | Dentro de la clase, fuera de métodos, sin `static` | A cada objeto    | `String nombre;`       |
| Variable de clase     | Dentro de la clase, fuera de métodos, con `static` | A toda la clase  | `static int contador;` |

public class Persona {

    static int totalPersonas = 0; // variable de clase

    String nombre;                // variable de instancia

    public void saludar() {

        int veces = 3;            // variable local

        System.out.println(nombre);
    }
}