//Overloading and Varargs
public void fly(int[] lengths) { }
public void fly(int... lengths) { } // DOES NOT COMPILE

/*
 * Explicación:
 *
 * Estos dos métodos NO pueden existir al mismo tiempo:
 *
 * public void fly(int[] lengths) { }
 * public void fly(int... lengths) { }
 *
 * Aunque uno usa int[] y el otro int..., para Java ambos
 * terminan representando un arreglo de enteros.
 *
 * Es decir:
 * int... lengths  -> se trata internamente como int[].
 *
 * Por eso ambos métodos tienen la misma firma y Java
 * considera que están duplicados.
 *
 * Resultado:
 * DOES NOT COMPILE
 *
 * Regla:
 * No se puede sobrecargar un método cambiando solo
 * entre un arreglo y varargs del mismo tipo.
 */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Autoboxing
public void fly(int numMiles) { }
public void fly(Integer numMiles) { }

/*
 * Explicación:
 *
 * Estos dos métodos SÍ pueden existir al mismo tiempo porque
 * int e Integer son tipos diferentes.
 *
 * public void fly(int numMiles) { }
 * public void fly(Integer numMiles) { }
 *
 * Si llamas:
 * fly(10);
 *
 * Java prefiere el método que recibe int.
 *
 * Si llamas:
 * fly(Integer.valueOf(10));
 *
 * Java usa el método que recibe Integer.
 *
 * Autoboxing:
 * Java puede convertir automáticamente un int en Integer.
 *
 * Unboxing:
 * Java puede convertir automáticamente un Integer en int.
 *
 * Regla:
 * int e Integer son diferentes, por eso sí permiten sobrecarga.
 */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Reference Types
public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }
    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
    } 
}

/*
 * Explicación:
 *
 * Hay dos métodos fly() sobrecargados:
 *
 * fly(String s)
 * fly(Object o)
 *
 * String hereda de Object, por lo tanto un String también es un Object.
 *
 * Cuando llamas:
 * r.fly("test");
 *
 * Java elige fly(String s) porque es el tipo más específico.
 *
 * Resultado:
 * string
 *
 * Cuando llamas:
 * r.fly(56);
 *
 * 56 es un int. Java hace autoboxing y lo convierte en Integer.
 * Como Integer hereda de Object, puede entrar en fly(Object o).
 *
 * Resultado:
 * object
 *
 * Salida final:
 * string object
 *
 * Regla:
 * Si hay varios métodos compatibles, Java elige el más específico.
 */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Primitives

public class Plane {
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);
        p.fly(123L);
    } 
}

/*
 * Explicación:
 *
 * Hay dos métodos fly() sobrecargados:
 *
 * fly(int i)
 * fly(long l)
 *
 * Cuando llamas:
 * p.fly(123);
 *
 * 123 es un literal de tipo int, por eso Java elige:
 * fly(int i)
 *
 * Resultado:
 * int
 *
 * Cuando llamas:
 * p.fly(123L);
 *
 * La letra L indica que 123 es de tipo long, por eso Java elige:
 * fly(long l)
 *
 * Resultado:
 * long
 *
 * Salida final:
 * int long
 *
 * Regla:
 * Java elige el método cuyo tipo coincide mejor con el argumento enviado.
 */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Putting It All Together
public class Glider2 {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    } 
}


/*
 * Explicación:
 *
 * Hay 4 métodos glide() sobrecargados.
 *
 * glide("a");
 * Java elige glide(String s) porque coincide exactamente con un String.
 * Devuelve: "1"
 *
 * glide("a", "b");
 * Java elige glide(String s, String t) porque coincide exactamente
 * con dos String.
 * Devuelve: "4"
 *
 * glide("a", "b", "c");
 * No existe un método con 3 parámetros String exactos,
 * por eso Java usa glide(String... s), es decir, varargs.
 * Devuelve: "2"
 *
 * Salida final:
 * 142
 *
 * Regla:
 * Java prefiere primero una coincidencia exacta.
 * Si no existe, puede usar varargs.
 */