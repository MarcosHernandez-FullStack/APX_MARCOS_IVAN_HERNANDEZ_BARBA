public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}

public class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
}

/*
 * Explicación de abstracción:
 * Una clase abstracta es aquella clase que solo servirá de plantilla sin la posibilidad de poder instanciarla.
 * Un método abstracto es aquel método no tiene implementación (no cuenta con un bloque de body), esto con la finalidad
 * que las clases que lo heredan puedan colocar el body ({}) respectivo.
 * En el ejemplo, la clase Animal es abstracta y el método getName también.
 * Swan hereda de Animal el método getName, y le añade un body: return "Swan";
*/