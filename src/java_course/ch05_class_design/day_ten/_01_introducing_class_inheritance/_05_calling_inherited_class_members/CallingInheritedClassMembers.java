class Fish {
    protected int size;
    private int age;
    public Fish(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class Shark extends Fish {
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }
}

/*
 * Tenemos a clase padre llamada Fish que será extendida por la clase hija Shark, el cual en
 * su constructor llama al constructor padre Fish(int age), envíandole el valor age. Luego mediante
 * this se hace uso del campo size de la clase padre.
 * En en método displaySharkDetails() mediante super se hace uso del método getAge() y del campo size.
 * Adicionalmente a ello, se llama al método local numberOffins.
 * En conclusión:
 * - this: se usa para hacer referencia a miembros de la clase padre o clase actual.
 * - super: se usa parra hacer referencia a solo miembros de la clase padre.
*/