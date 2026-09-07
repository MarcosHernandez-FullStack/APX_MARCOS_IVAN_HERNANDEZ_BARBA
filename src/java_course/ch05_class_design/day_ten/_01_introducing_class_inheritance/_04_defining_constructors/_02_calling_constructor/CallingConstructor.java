//La finalidad de este archivo java es demostrar el orden de ejecución de los constructores en una jerarquía de herencias.
class Primate {
    public Primate() {
    System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
    System.out.println("Ape");
    }
}
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
    new Chimpanzee();
    }
}

/*
 * Los constructores que se ejecutarán primero serán los constructores de los padres. Ejemplo:
 * - Primate es la clase padre en donde de forma implícita llama a super() y luego de forma 
 *  explícita imprime "Primate"
 * - Ape es la clase hija que hereda de la clase Primate, en donde de forma implícita llama a 
 *  super() y luego de forma explícita imprime "Ape".
 * - Chimpanzee es la clase hija de Ape, en donde de forma implícita hace uso de su contructor 
 *  sin parámetros, eo cuál a su vez de forma implícita llama a super().
 * La regla dice que primero se ejecuta el constructor de la clase padre, por lo tanto imprime:
 * Primate
 * Ape
*/