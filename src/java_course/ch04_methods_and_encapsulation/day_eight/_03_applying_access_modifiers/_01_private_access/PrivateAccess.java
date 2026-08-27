//Acceso privado: solo se puede acceder dentro de la propia clase
package pond.duck;
public class FatherDuck {
private String noise = "quack";
private void quack() {
System.out.println(noise); // Compila correctamente, porque se intenta acceder a una variable private dentro de la misma clase.
}
private void makeNoise() {
quack(); //Compila correctamente, porque se intenta acceder a un método private dentro de la misma clase.
} }


package pond.duck;
public class BadDuckling {
public void makeNoise() {
FatherDuck duck = new FatherDuck();
duck.quack(); //No compila, porque se intenta acceder a un método private de otra clase.
System.out.println(duck.noise); //No compila, porque se intenta acceder a una variable private de otra clase.
} }