 public class Mouse {
    static int MAX_LENGTH = 5; //  variable de clase
    int length; // variable de instancia
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches; // variable local
            length = newSize;
    }
    }
}