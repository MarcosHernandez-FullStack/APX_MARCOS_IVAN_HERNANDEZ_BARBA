/* StringBuilder: es una clase mutable que permite modificar el contenido de una cadena de caracteres 
 * sin crear nuevas instancias de cadena.
 * Esto es útil cuando se realizan muchas modificaciones en una cadena, ya que puede mejorar el rendimiento
 * en comparación con el uso de cadenas inmutables.
*/

StringBuilder a = new StringBuilder("abc");
StringBuilder b = a.append("de");
b = b.append("f").append("g");
System.out.println("a=" + a);
System.out.println("b=" + b);

/*
 * Explicación de los resultados:
 * 1. La cadena original "abc" se modifica mediante el método append(), agregando "de" al final, resultando en "abcde".
 * 2. Luego, se agregan "f" y "g" al final de la cadena, resultando en "abcdefg".
 * 3. La cadena original "a" se ha modificado, mientras que la cadena "b" contiene el resultado final.
*/