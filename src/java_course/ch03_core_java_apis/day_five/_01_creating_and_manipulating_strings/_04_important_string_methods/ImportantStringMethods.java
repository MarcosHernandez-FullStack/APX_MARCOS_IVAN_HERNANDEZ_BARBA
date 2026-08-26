//Método length(): indica el número de caracteres en la cadena.
String string = "animals";
System.out.println(string.length()); // 7
//El resultado es 7 porque la cadena "animals" tiene 7 caracteres.

//Método chatAt(): indica el carácter en la posición especificada. El índice de la cadena comienza en 0.
String string = "animals";
System.out.println(string.charAt(0)); // Resultado: a
System.out.println(string.charAt(6)); // Resultado: s
System.out.println(string.charAt(7)); // Resultado: StringIndexOutOfBoundsException

//Método indexOf(): devuelve el índice de la primera aparición del carácter especificado en la cadena. 
// Si el carácter no se encuentra, devuelve -1.
String string = "animals";
System.out.println(string.indexOf('a')); // Resultado: 0
System.out.println(string.indexOf("al")); // Resultado: 4
System.out.println(string.indexOf('a', 4)); // Resultado: 4
System.out.println(string.indexOf("al", 5)); // Resultado: -1

/*
 * Explicación de los resultados:
 * 1. string.indexOf('a') devuelve 0 porque la primera aparición de 'a' está en el índice 0.
 * 2. string.indexOf("al") devuelve 4 porque la subcadena "al" comienza en el índice 4.
 * 3. string.indexOf('a', 4) devuelve 4 porque la primera aparición de 'a' después del índice 4 está en el índice 4.
 * 4. string.indexOf("al", 5) devuelve -1 porque no hay ninguna aparición de la subcadena "al" después del índice 5.
*/

//Método Substring(): devuelve una nueva cadena que es una subcadena de la cadena original.
String string = "animals";
System.out.println(string.substring(3)); // Resultado: mals
System.out.println(string.substring(string.indexOf('m'))); // Resultado: mals
System.out.println(string.substring(3, 4)); // Resultado: m
System.out.println(string.substring(3, 7)); // Resultado: mals

/*
 * Explicación de los resultados:
 * 1. string.substring(3) devuelve "mals" porque toma la subcadena desde el índice 3 hasta el final.
 * 2. string.substring(string.indexOf('m')) devuelve "mals" porque encuentra el índice de 'm' (que es 3) y 
 * toma la subcadena desde allí.
 * 3. string.substring(3, 4) devuelve "m" porque toma la subcadena desde el índice 3 hasta el índice 4 
 * (no tomar el valor de la posición 4).
 * 4. string.substring(3, 7) devuelve "mals" porque toma la subcadena desde el índice 3 hasta el índice 7 
 * (no toma el valor de la posición 7).
*/

/*
 * Métodos toLowerCase() y toUpperCase(): devuelven una nueva cadena con todos los caracteres en minúsculas y 
 * mayúsculas, respectivamente.
*/

String string = "animals";
System.out.println(string.toUpperCase()); // Respuesta: ANIMALS, porque convierte todos los caracteres a mayúsculas.
System.out.println("Abc123".toLowerCase()); /* Respuesta: abc123, porque convierte todos los caracteres a minúsculas. 
                                            Los números no se ven afectados./*
//Recordar que las cadenas de caracteres son inmutables, por lo que la cadena original permanece inalterable.

/*
 * Métodos equals() y equalsIgnoreCase(): equals() compara dos cadenas de caracteres y devuelve true si 
 * son iguales y false si no lo son. equalsIgnoreCase() compara dos cadenas de caracteres ignorando 
 * las diferencias entre mayúsculas.
*/

System.out.println("abc".equals("ABC")); // Respuesta: false, porque las cadenas no son iguales.
System.out.println("ABC".equals("ABC")); // Respuesta: true, porque las cadenas son iguales.
System.out.println("abc".equalsIgnoreCase("ABC")); /* Respuesta: true, porque las cadenas son iguales ignorando las 
                                                    diferencias entre mayúsculas y minúsculas.*/


/*
 * Métodos startsWith() y endsWith(): startsWith() devuelve true si la cadena comienza con el prefijo especificado,
 * y endsWith() devuelve true si la cadena termina con el sufijo especificado.
*/

System.out.println("abc".startsWith("a")); // Respuesta: true, porque la cadena comienza con el prefijo especificado.   
System.out.println("abc".startsWith("A")); // Respuesta: false, porque la cadena no comienza con el prefijo especificado.
System.out.println("abc".endsWith("c")); // Respuesta: true, porque la cadena termina con el sufijo especificado.
System.out.println("abc".endsWith("a")); // Respuesta: false, porque la cadena no termina con el sufijo especificado.

//Método contains(): devuelve true si la cadena contiene la secuencia de caracteres especificada.
System.out.println("abc".contains("b")); /* Respuesta: true, porque la cadena contiene la secuencia de 
                                            caracteres especificada.*/
System.out.println("abc".contains("B")); /* Respuesta: false, porque la cadena no contiene la secuencia 
                                            de caracteres especificada.*/

/*
 * Método replace(): devuelve una nueva cadena en la que todas las apariciones de un carácter o subcadena 
 * especificada se reemplazan por otro carácter o subcadena.
*/
System.out.println("abcabc".replace('a', 'A')); // Respuesta: AbcAbc, porque reemplaza todas las apariciones de 'a' con 'A'.
System.out.println("abcabc".replace("a", "A")); // Respuesta: AbcAbc, porque reemplaza todas las apariciones de "a" con "A".

/*
 * Método trim(): devuelve una nueva cadena con los espacios en blanco iniciales y finales eliminados.
*/

System.out.println("abc".trim()); // Respuesta: abc, porque no hay espacios en blanco iniciales ni finales.
System.out.println("\t a b c\n".trim()); /* Respuesta: a b c, porque elimina los espacios en blanco iniciales 
                                             y finales, incluyendo tabulaciones y saltos de línea.*/                                             
