public class SwitchSample {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
            if (a == 2 || x == 'b')
            continue FIRST_CHAR_LOOP;
            System.out.print(" " + a + x);
            }
        }
    }
}

/*
 * La salida es " 1a 1c 3a 3c 4a 4c" porque el bucle anidado recorre los valores de a y x, 
 * y cuando a es igual a 2 o x es igual a 'b', se salta la iteración actual del bucle externo 
 * usando la etiqueta FIRST_CHAR_LOOP, evitando que se impriman esos valores.
*/