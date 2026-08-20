public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    } 
}
/*
 * one, two y three terminan apuntando a "b". 
 * La referencia a "a" se pierde y el objeto "a" queda sin referencias, 
 * por lo que es elegible para la recolección de basura.
 * El objeto contiene los datos; la referencia permite acceder a ese objeto.
*/