/*
 * Las reglas para sobreescribir un método son:
 * 1. El método en la clase hija debe tener la misma firma que el método en la clase padre.
 * 2. El método en la clase hija debe ser al menos tan accesible o más accesible que el
 *    método en la clase padre.
 * 3. El método en la clase hija no puede lanzar una excepción verificada que sea nueva o 
 *    más amplia que la clase de cualquier excepción lanzada en el método de la clase padre.
 * 4. Si el método devuelve un valor, debe ser el mismo o una subclase del método en la
 *    clase padre, conocida como tipos de retorno covariantes.
 */


public class InsufficientDataException extends Exception {}
public class Reptile {
    protected double getHeight() throws InsufficientDataException {
        return 2;
    }
    protected int getLength() {
        return 10;
    }
}

public class Snake extends Reptile {
    //No compila porque Exception es más amplia que InsufficientDataException, yendo en contra de la regla 3.
    protected double getHeight() throws Exception { 
        return 2;
    }
    // No compila porque el método de la clase padre no lanza alguna excepción, yendo en contra de la regla 3.
    protected int getLength() throws InsufficientDataException { 
        return 10;
    }
}