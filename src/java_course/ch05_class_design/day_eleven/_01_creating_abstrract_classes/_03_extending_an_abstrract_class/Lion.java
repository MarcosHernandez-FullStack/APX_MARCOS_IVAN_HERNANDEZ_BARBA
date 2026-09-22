public abstract class Animal {
    public abstract String getName();
}
public abstract class BigCat extends Animal {
    public String getName() {
        return "BigCat";
    }
    public abstract void roar();
}
public class Lion extends BigCat {
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}

/*
 * Una subclase concreta no está obligada a proporcionar una implementación para un método abstracto si una 
 * clase abstracta intermedia proporciona dicha implementación.
 * Animal obliga a sus hijos a tener getName(), pero BigCat ya implementa ese método. Por eso Lion ya no necesita 
 * implementarlo otra vez.
 * En cambio, BigCat declara roar() como abstracto y no lo implementa, por eso Lion, al ser una clase concreta, 
 * sí está obligado a implementar roar().
*/