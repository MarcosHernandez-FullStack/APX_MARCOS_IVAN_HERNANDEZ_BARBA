public class Elephant extends Mammal {
    public Elephant() {
        super(10);
    }
}

/*
 * Elephant es la clase hija que extiende/hereda de la clase Mammal
 * El constructor llama al constructor de la clase padre Mammal, envíandole el parámetro de 10.
 * Si por ejemplo, el constructor de Elephant tuviese solo super() o no tuviera nada dentro del bloque,
 * entonces ocurriría un error de compilación, porque estaría llamando a super() sin argumentos, y la clase
 * padre Mammal no cuenta con un constructor sin argumentos.
*/