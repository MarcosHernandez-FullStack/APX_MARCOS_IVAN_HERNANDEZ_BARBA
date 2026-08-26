String[] strings = { "10", "9", "100" };
Arrays.sort(strings);
for (String string : strings)
System.out.print(string + " ");

/*
 * Explicación:
 * Se crea un arreglo de String con los valores "10", "9" y "100".
 * 
 * Arrays.sort(strings) ordena los elementos como texto, no como números.
 * Por eso compara carácter por carácter.
 *
 * "10" y "100" empiezan con '1', mientras que "9" empieza con '9'.
 * Como '1' va antes que '9', primero se colocan "10" y "100".
 *
 * Entre "10" y "100", "10" va primero porque coincide al inicio y termina antes.
 *
 * Resultado:
 * 10 100 9
 */