/*
 * Los campos finales son aquellos campos que no se le pueden asignar un valor más de una vez.
 * En el ejemplo MouseHouse, se observa que el constructor es el bloque en donde se realiza la 
 * asignación, es decir, se inicializa en este caso "volume".
*/
public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    public MouseHouse(int length, int width, int height) {
    volume = length * width * height;
    }
}