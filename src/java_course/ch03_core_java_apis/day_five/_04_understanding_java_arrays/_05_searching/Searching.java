int[] numbers = {2,4,6,8};
System.out.println(Arrays.binarySearch(numbers, 2)); // 0
System.out.println(Arrays.binarySearch(numbers, 4)); // 1
System.out.println(Arrays.binarySearch(numbers, 1)); // -1
System.out.println(Arrays.binarySearch(numbers, 3)); // -2
System.out.println(Arrays.binarySearch(numbers, 9)); // -5

/*
 * Explicación:
 * Se crea un arreglo ordenado con los valores {2, 4, 6, 8}.
 *
 * Arrays.binarySearch() busca un valor dentro del arreglo.
 *
 * Si encuentra el valor, devuelve su posición (índice).
 *
 * Arrays.binarySearch(numbers, 2) devuelve 0,
 * porque el número 2 está en la posición 0.
 *
 * Arrays.binarySearch(numbers, 4) devuelve 1,
 * porque el número 4 está en la posición 1.
 *
 * Si el valor no existe, devuelve:
 * -(posición donde debería insertarse) - 1
 *
 * Para buscar 1:
 * debería insertarse en la posición 0.
 * Entonces: -(0) - 1 = -1
 *
 * Para buscar 3:
 * debería insertarse en la posición 1.
 * Entonces: -(1) - 1 = -2
 *
 * Para buscar 9:
 * debería insertarse en la posición 4.
 * Entonces: -(4) - 1 = -5
 *
 * Resultado:
 * 0
 * 1
 * -1
 * -2
 * -5
 */