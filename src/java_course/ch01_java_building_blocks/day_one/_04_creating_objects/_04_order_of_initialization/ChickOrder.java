public class ChickOrder 
{
    private String name = "Fluffy";
    { 
        System.out.println("setting field"); 
    }

    public ChickOrder() {
    name = "Tiny";
    System.out.println("setting constructor");
    }

    public static void main(String[] args) 
    {
    ChickOrder chickOrder = new ChickOrder();
    System.out.println(chickOrder.name); 
    } 
 }

 /*
    La salida del programa es:
    1) setting field
    2) setting constructor
    3) Tiny

 */