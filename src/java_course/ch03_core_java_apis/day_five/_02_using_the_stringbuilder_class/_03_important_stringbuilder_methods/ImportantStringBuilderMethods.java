// Métodos charAt(), indexOf(), length(), and substring()
StringBuilder sb = new StringBuilder("animals");
String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
int len = sb.length();
char ch = sb.charAt(6);
System.out.println(sub + " " + len + " " + ch);

/*
 * Explicación de los resultados:
 * 1. sb.substring(sb.indexOf("a"), sb.indexOf("al")) devuelve "anim" porque toma la subcadena desde el índice 
 * de la primera aparición de "a" (que es 0) hasta el índice de la primera aparición de "al" (que es 4).
 * 2. sb.length() devuelve 7 porque la cadena "animals" tiene 7 caracteres.
 * 3. sb.charAt(6) devuelve 's' porque el carácter en el índice 6 es 's'.
 * 4. La salida final es "anim 7 s".
*/

//Método append(): agrega la cadena especificada al final de la cadena original.
StringBuilder sb = new StringBuilder().append(1).append('c');
sb.append("-").append(true);
System.out.println(sb); // 1c-true

/*
 * Explicación de los resultados:
 * 1. sb.append(1) agrega el número 1 al final de la cadena original, resultando en "1".
 * 2. sb.append('c') agrega el carácter 'c' al final de la cadena, resultando en "1c".
 * 3. sb.append("-") agrega el guion "-" al final de la cadena, resultando en "1c-".
 * 4. sb.append(true) agrega el valor booleano true al final de la cadena, resultando en "1c-true".
 * 5. La salida final es "1c-true".
*/

//Método insert(): inserta la cadena especificada en la posición especificada de la cadena original.
StringBuilder sb = new StringBuilder("animals");
sb.insert(7, "-"); // sb = animals-
sb.insert(0, "-"); // sb = -animals-
sb.insert(4, "-"); // sb = -ani-mals
System.out.println(sb);

/*
 * Explicación de los resultados:
 * 1. sb.insert(7, "-") inserta el guion "-" en la posición 7 de la cadena original, resultando en "animals-".
 * 2. sb.insert(0, "-") inserta el guion "-" en la posición 0 de la cadena, resultando en "-animals-".
 * 3. sb.insert(4, "-") inserta el guion "-" en la posición 4 de la cadena, resultando en "-ani-mals".
 * 4. La salida final es "-ani-mals".
*/

/*
 * Método delete() y deleteCharAt(): 
    * delete() elimina la subcadena especificada de la cadena original.
    * deleteCharAt() elimina el carácter en la posición especificada de la cadena original.
*/

StringBuilder sb = new StringBuilder("abcdef");
sb.delete(1, 3); // sb = adef
sb.deleteCharAt(5); // throws an exception

/*
 * Explicación de los resultados:
 * 1. sb.delete(1, 3) elimina la subcadena desde el índice 1 hasta el índice 3 (no incluye el índice 3), 
 * resultando en "adef".
 * 2. sb.deleteCharAt(5) intenta eliminar el carácter en la posición 5, pero como la cadena resultante 
 * después del primer delete() tiene solo 4 caracteres (índices 0 a 3), esto lanza una excepción 
 * StringIndexOutOfBoundsException.
 * 3. La salida final es "adef" antes de que ocurra la excepción.
*/

//Método reverse(): invierte el orden de los caracteres en la cadena original.
StringBuilder sb = new StringBuilder("ABC");
sb.reverse();
System.out.println(sb);

/*
 * Explicación de los resultados:
 * 1. sb.reverse() invierte el orden de los caracteres en la cadena original, resultando en "CBA".
 * 2. La salida final es "CBA".
*/

//Método toString(): devuelve una nueva cadena que representa el contenido de la cadena original.
StringBuilder sb = new StringBuilder("animals");
String s = sb.toString();
System.out.println(s);

/*
 * Explicación de los resultados:
 * 1. sb.toString() devuelve una nueva cadena que representa el contenido de la cadena original, resultando en "animals".
 * 2. La salida final es "animals".
*/