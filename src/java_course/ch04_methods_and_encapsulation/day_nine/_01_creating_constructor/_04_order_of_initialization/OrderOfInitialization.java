/*
 * Las inicializaciones se realizan en el siguiente orden:
 * 1. Inicialización de superclase.
 * 2. Variables e inicializadores estáticos.
 * 3. Variables e inicializadores de instancia.
 * 4. Constructor
*/

public class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    { add(8); }
    public static void main(String[] args) { } 
}

/*
 * 1. No hay superclase.
 * 2. Variables e inicializadores estáticos: línea 10, 11, 13, 15
 * 3. Variables e inicializadores de instancia: línea 14 y 16
 * 4. Constructor: línea 12
 * Resultado: 2 4 6 8 5
*/
