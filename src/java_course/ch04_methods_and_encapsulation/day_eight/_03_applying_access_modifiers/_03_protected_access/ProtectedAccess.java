//Acceso protegido: permite acceder a los miembros de la clase padre

//Primera clase Bird
package pond.shore;
public class Bird {
    protected String text = "floating"; // protected access
    protected void floatInWater() { // protected access
    System.out.println(text);
    } 
}

//Segunda clase Swan
package pond.swan;
import pond.shore.Bird;
public class Swan extends Bird { 
    public void swim() {
        floatInWater(); // Accede al método de floatInWater de Bird
        System.out.println(text); // Accede a la variable text de Bird
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // Accede al método de floatInWater de Bird
        System.out.println(other.text);// Accede a la variable text de Bird
    }
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); // No compila, porque no podemos acceder a la clase padre Bird directamente, se debe usar el que extiende de Bird, es decir, Swan
        System.out.println(other.text); // No compila, porque no podemos acceder a la clase padre Bird directamente, se debe usar el que extiende de Bird, es decir, Swan
    }
}