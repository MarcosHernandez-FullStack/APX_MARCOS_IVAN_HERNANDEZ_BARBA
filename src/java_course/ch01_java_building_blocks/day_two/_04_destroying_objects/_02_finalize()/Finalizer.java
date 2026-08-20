public class Finalizer 
{
    private static List objects = new ArrayList();
    protected void finalize() 
    {
    objects.add(this); // Agrega el objeto a la lista de objetos antes de que sea destruido
    } 
}