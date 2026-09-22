public abstract class Animal {
    public abstract String getName();
}
public class Bird extends Animal { 
}

public class Flamingo extends Bird {
    public String getName() {
        return "Flamingo";
    }
}


/*
 * Una clase concreta es la primera clase no abstracta que hereda de una clase abstracta
 * y que debe implementar todos los métodos abstractos que figuran en dicha clase padre.
 * En el código Bird es la clase concreta, el cuál dará error de compilación porque no 
 * implementa todos los métodos abstractos de Animal, en este caso, getName().
*/