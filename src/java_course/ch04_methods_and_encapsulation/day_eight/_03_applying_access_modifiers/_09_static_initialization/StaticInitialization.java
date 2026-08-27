private static final int NUM_SECONDS_PER_HOUR;
static { //Indica que debe ejecutarse cuando la clase se usa por primera vez
    int numSecondsPerMinute = 60;
    int numMinutesPerHour = 60;
    NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

private static int one;
private static final int two;
private static final int three = 3;
private static final int four; // No compila
static {
one = 1;
two = 2;
three = 3; // No compila
two = 4; // No compila
}

/*
 * Explicación:
 *
 * one es static pero NO final, por eso puede cambiar de valor:
 * one = 1; // OK
 *
 * two es static final y no recibió valor al declararse.
 * Puede recibir su valor UNA sola vez dentro del bloque static:
 * two = 2; // OK
 * two = 4; // ERROR, ya fue asignado.
 *
 * three es static final y ya recibió el valor 3 al declararse:
 * three = 3;
 * Por eso no puede volver a modificarse:
 * three = 3; // ERROR
 *
 * four es static final pero nunca recibe un valor:
 * private static final int four;
 * Por eso la clase NO compila.
 *
 * Regla:
 * Una variable final debe recibir un valor exactamente una vez.
 */