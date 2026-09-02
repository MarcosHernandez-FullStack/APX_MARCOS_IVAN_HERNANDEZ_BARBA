/*
 * Los constructores sobrecargados permite tener varios métodos que tienen el mismo nombre
 * pero con diferentes parámetros. En el ejemplo tenemos:
 * 1. El método main llama al constructor con un parámetro.
 * 2. El primer constructor llama al constructor con dos parámetros.
 * 3. El segundo constructor llama al constructor con tres parámetros.
 * 4. El tercer constructor inicializa los campos de la clase.
*/

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Mouse(int weight) {
        this(weight, 16); 
    }
    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); 
    }
    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}

//La sobrecarga de constructores permite la flexbilidad y evita la repitición de código.