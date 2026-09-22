public abstract class Whale {
    protected abstract void sing();
    }
public class HumpbackWhale extends Whale {
    private void sing() {
    System.out.println("Humpback whale is singing");
    }
}

/*
 * No compila, por el simple hecho de que en la subclase Whale está que su busca disminuir la visibilidad
 * considerando private en vez de protected
*/