public class Lion extends Animal {
    private void roar() {
    System.out.println("The "+getAge()+" year old lion says: Roar!");
    }
}

/*
 * Lion extiende de Animal.java, puede usar los métodos getAge() 
 * y setAge() porque son públicos, pero no puede hacer uso de age
 * porque es un campo privado.
*/