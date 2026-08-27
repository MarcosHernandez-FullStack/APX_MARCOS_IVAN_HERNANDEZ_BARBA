public class Koala {
    public static int count = 0; // Variable estática
    public static void main(String[] args) { // Método estático
        System.out.println(count);
    }
}

public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]); // Llamada al método estático main de la clase Koala sin tener que instanciar la clase
}