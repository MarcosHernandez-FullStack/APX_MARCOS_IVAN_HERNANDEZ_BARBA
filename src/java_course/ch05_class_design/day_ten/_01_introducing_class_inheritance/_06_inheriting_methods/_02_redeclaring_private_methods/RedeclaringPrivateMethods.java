public class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

public class BactrianCamel extends Camel {
    private int getNumberOfHumps() {
        return 2;
    }
}

/*
 * La reclaración de métodos se da cuando el método que se encuentra en la clase padre es privado,
 * y el método que se encuentra en la clase hija tiene el mismo nombre.
 * Básicamente, es un nuevo método que no tiene relación con algún método de la clase padre.
*/