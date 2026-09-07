public class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
public class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}

/*
 * No se puede sobreescribir una variable pero si se puede ocultar, en el ejemplo, 
 * para invocar a la variable de la clase padre se utiliza "super" y para invocar a la
 * variable de la clase hija se utiliza "this" o el nombre de la variable directamente.
 * Por eso el resultado en la clase hija al invocar  mouse.getRodentDetails(); es 
 * [tail=8,parentTail=4].
 
*/