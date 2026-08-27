public static void main(String[] args) {
    String name = "Webby";
    speak(name);
    System.out.println(name);
}
public static void speak(String name) {
    name = "Sparky";
}

/*
 * Explicación:
 *
 * Java pasa los argumentos por valor.
 *
 * En main:
 * String name = "Webby";
 *
 * Cuando se llama:
 * speak(name);
 *
 * el método recibe una copia de la referencia.
 *
 * Dentro de speak():
 * name = "Sparky";
 *
 * solo cambia la copia local de la referencia,
 * no la variable name que está en main.
 *
 * Por eso, al regresar a main:
 * System.out.println(name);
 *
 * imprime:
 * Webby
 *
 * Regla:
 * Cambiar la referencia dentro del método no cambia
 * la referencia original del método que la llamó.
 */

