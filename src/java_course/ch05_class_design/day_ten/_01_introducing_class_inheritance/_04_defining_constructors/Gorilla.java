public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
    public Gorilla() {
        super(5);
    }
}

/*
 * 1. Gorilla extiende de la clase Animal.
 * 2. Gorilla tiene dos constructores, los cuáles se ejecutarán de la siguiente forma:
 * - El primer constructor, es Gorilla(int age), el cuál mediante el super(age, "Gorilla") 
 * hace el llamado al constructor del padre Animal(int age, String name).
 * - El segundo constructor, es Gorilla(), el cuál mediante el super(5) 
 * hace el llamado al constructor del padre Animal(int age).
 * 
*/