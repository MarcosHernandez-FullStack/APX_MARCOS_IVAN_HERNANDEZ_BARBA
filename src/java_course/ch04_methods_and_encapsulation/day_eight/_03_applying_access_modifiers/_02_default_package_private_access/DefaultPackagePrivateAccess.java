//Acceso predeterminado: se tiene acceso solo si se pertenece al mismo paquete
package pond.duck;
public class MotherDuck {
    String noise = "quack";
    void quack() {
        System.out.println(noise); // Compila
    }
    private void makeNoise() {
        quack(); // Compila
    } 
}

//Pertenece al mismo paquete
package pond.duck;
public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // Compila, porque hay un acceso predeterminado a nivel del mismo paquete "pond.duck"
        System.out.println(duck.noise); // Compila, porque hay un acceso predeterminado a nivel del mismo paquete "pond.duck"
    } 
}

//No pertenece al mismo paquete
package pond.swan;
import pond.duck.MotherDuck; // import another package
public class BadCygnet {
public void makeNoise() {
MotherDuck duck = new MotherDuck();
duck.quack(); // No compila, porque no hay acceso predeterminado ya que el paquete al que pertenece es "pond.swan" y no "pond.duck"
System.out.println(duck.noise); // No compila, porque no hay acceso predeterminado ya que el paquete al que pertenece es "pond.swan" y no "pond.duck"
} }