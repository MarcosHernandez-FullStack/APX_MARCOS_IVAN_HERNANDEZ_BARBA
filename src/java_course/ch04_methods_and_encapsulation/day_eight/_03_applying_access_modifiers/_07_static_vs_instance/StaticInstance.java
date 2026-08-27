public class Static {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        third(); // No compila, porque el método third() y la variable name no son miembros estáticos
    } 
}