public class Tiger {
    String name;
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t1); // Respuesta: true, porque ambos hacen referencia al mismo objeto en memoria. 
        System.out.println(t1 == t2); /* Reespuesta: false, porque t1 y t2 son dos objetos diferentes en memoria. 
                                        Es decir, aunque tengan el mismo contenido, son dos instancias diferentes.*/
        System.out.println(t1.equals(t2)); /* Respuesta: false, porque t1 y t2 son dos objetos diferentes en memoria 
                                            y no se ha sobrescrito el método equals().*/
    } 
}