// Los miembros final no se puede sobreescribir
public class Bird {
    public final boolean hasFeathers() {
        return true;
    }
}
public class Penguin extends Bird {
    public final boolean hasFeathers() { // No compila, aún cuando en la clase padre es final y en la clase hija tambien es final.
        return false;
    }
}