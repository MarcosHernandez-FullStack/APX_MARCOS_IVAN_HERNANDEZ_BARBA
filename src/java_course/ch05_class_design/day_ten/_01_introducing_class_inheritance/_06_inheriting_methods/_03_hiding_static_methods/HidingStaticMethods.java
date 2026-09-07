/* 
 * Para ocultar métodos estáticos se añade una quinta regla:
 * El método que está definido en la clase hija debe estar marcado como estático, además también debe estar marcado como
 * estático en la clase padre (ocultamiento de método).
*/

public class Bear {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}
public class Panda extends Bear {
    public void sneeze() { // No compila porque no se definió de esta forma:  public static void sneeze()
        System.out.println("Panda bear sneezes quietly");
    }
    public static void hibernate() { // No compila porque no se definió de esta forma en la clase padre:  public static void hibernate
        System.out.println("Panda bear is going to sleep");
    }
}

/*
 * En caso sí se definiera como lo acabo de explicar, entonces, ocurriría un ocultamiento de métodos, es decir, si llamo al método hijo
 * se ejecutaría solo el del hijo.
*/