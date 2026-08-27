//Acceso público: cualquiera puede acceder al miembro desde cualquier lugar
package pond.duck;
public class DuckTeacher {
    public String name = "helpful"; // Acceso público
    public void swim() { // Acceso público
    System.out.println("swim");
    } 
}

package pond.goose;
import pond.duck.DuckTeacher;
public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // Compila, porque swim() es un método público de la clase DuckTeacher
        System.out.println("Thanks" + teacher.name); // Compila, porque name es una variable pública de la clase DuckTeacher 
    } 
}