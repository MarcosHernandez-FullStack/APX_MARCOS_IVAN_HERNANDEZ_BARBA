/* Las expresiones lambdan ayudan a reducir la cantidad de código que necesitamos escribir para 
 * implementar una interfaz.
*/ 

 public class TraditionalSearch {
    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>(); 
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    print(animals, new CheckIfHopper());
    //Con lambda:
    // *Filtrar por animales de saltan: print(animales, a->a.canHop());
    // *Filtrar por animalales que nadan: print(animales, a->a.canSwim());
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
        if (checker.test(animal)) 
            System.out.print(animal + " ");
    }
    System.out.println();
    }
}