public static void main(String[] args)
public static void main(String args[])
public static void main(String... args) // varargs

/*
 * Explicación:
 *
 * Las tres formas son válidas para declarar el método main en Java.
 *
 * public static void main(String[] args)
 * Es la forma más común. args es un arreglo de String.
 *
 * public static void main(String args[])
 * Es exactamente lo mismo que String[] args.
 * Solo cambia la ubicación de los corchetes.
 *
 * public static void main(String... args)
 * Usa varargs, pero para el método main Java lo trata como un arreglo de String.
 *
 * En los tres casos, args contiene los valores enviados desde la línea de comandos.
 *
 * Ejemplo:
 * java MiPrograma hola mundo
 *
 * args[0] = "hola"
 * args[1] = "mundo"
 */