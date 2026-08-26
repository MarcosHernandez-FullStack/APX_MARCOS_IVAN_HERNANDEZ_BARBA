int[][] twoD = new int[3][2];
for (int i = 0; i < twoD.length; i++) {
    for (int j = 0; j < twoD[i].length; j++)
        System.out.print(twoD[i][j] + " "); // Impresión del elemento
    System.out.println(); // Espacio para una nueva fila
}

/*
 * Explicación:
 *
 * int[][] twoD = new int[3][2];
 * Se crea una matriz de 2 dimensiones con 3 filas y 2 columnas.
 *
 * Como es un arreglo de int y no se asignaron valores,
 * todas las posiciones empiezan con 0.
 *
 * El primer for recorre las filas:
 * i = 0, 1 y 2.
 *
 * El segundo for recorre las columnas de cada fila:
 * j = 0 y 1.
 *
 * twoD[i][j] accede a cada elemento de la matriz
 * y lo imprime.
 *
 * System.out.println() hace un salto de línea
 * después de terminar cada fila.
 *
 * Resultado:
 * 0 0
 * 0 0
 * 0 0
 */