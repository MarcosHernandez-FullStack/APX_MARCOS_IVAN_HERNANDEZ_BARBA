/*
 * Encadenamento de métodos (Method Chaining): se refiere a la práctica de llamar a múltiples métodos 
 * en una sola línea de código, donde cada método se llama en el resultado del método anterior. 
 * Esto puede hacer que el código sea más conciso y legible.
*/

String a = "abc";
String b = a.toUpperCase();
b = b.replace("B", "2").replace('C', '3');
System.out.println("a=" + a);
System.out.println("b=" + b);

/*
 * Explicación de los resultados:
 * 1. La cadena original "abc" se convierte a mayúsculas, resultando en "ABC".
 * 2. Luego, se reemplaza la letra "B" con "2", resultando en "A2C".
 * 3. Finalmente, se reemplaza la letra 'C' con '3', resultando en "A23".
 * 4. La cadena original "a" permanece inalterada, mientras que la cadena "b" contiene el resultado final.
*/
