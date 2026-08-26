// De esta forma se pueden crear instancias de la clase StringBuilder:
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder("animal");
StringBuilder sb3 = new StringBuilder(10);

/*
 * Explicación de los resultados:
 * 1. sb1 se crea con un constructor sin argumentos, lo que significa que tiene una capacidad inicial predeterminada.
 * 2. sb2 se crea con un constructor que toma una cadena de caracteres, lo que significa que su contenido inicial es "animal".
 * 3. sb3 se crea con un constructor que toma un entero, lo que significa que tiene una capacidad inicial de 10 caracteres.
 * Sin embargo, la capacidad de un StringBuilder puede aumentar automáticamente si se agregan más caracteres de los que puede contener.
*/