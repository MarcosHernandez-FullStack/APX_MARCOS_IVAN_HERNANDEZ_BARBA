numbers[10] = 3;
numbers[numbers.length] = 5;
for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;

/*
 * Explicación:
 *
 * Línea 5:
 * int[] numbers = new int[10];
 * Se crea un arreglo de enteros con 10 posiciones.
 * Sus índices van desde 0 hasta 9.
 *
 * Línea 6:
 * for (int i = 0; i < numbers.length; i++)
 * Se recorre todo el arreglo desde la posición 0 hasta la 9.
 * numbers.length vale 10.
 *
 * Línea 7:
 * numbers[i] = i + 5;
 * En cada posición se guarda el valor del índice más 5.
 *
 * Resultado final:
 * numbers = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
 */
