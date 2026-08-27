public class Initializers {
    private static final int NUM_BUCKETS = 45;
    public static void main(String[] args) {
    NUM_BUCKETS = 5; // No compila, porque NUM_BUCKETS es una constante
    } 
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

private static final ArrayList<String> values = new ArrayList<>();
public static void main(String[] args) {
values.add("changed"); // Sí compila, porque final impide que values apunte a otro ArrayList, pero no impide modificar el contenido del objeto.
}