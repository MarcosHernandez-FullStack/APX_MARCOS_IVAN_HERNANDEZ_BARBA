/*
 * Los operadores de igualdad se utilizan en uno de tres escenarios:
 * 1. Comparación de dos tipos numéricos primitivos. Si los valores numéricos son de tipos de datos 
 * diferentes, se convierten automáticamente al tipo de dato especificado, como se describió anteriormente. Por
 * ejemplo, 5 == 5.00 devuelve verdadero, ya que el lado izquierdo se convierte a un tipo double.
 * 2. Comparación de dos valores booleanos .
 * 3. Comparación de dos objetos, incluyendo valores nulos y de tipo String .

*/

boolean y = false;
boolean x = (y = true);
System.out.println(x); // Salida: true

//-------------------------------------------------------------------------------------------------------

File x = new File("myFile.txt");
File y = new File("myFile.txt");
File z = x;
System.out.println(x == y); // Salida: false, porque x e y son referencias a dos objetos diferentes, 
// aunque ambos objetos File representan el mismo archivo.
System.out.println(x == z); // Salida: true, porque z es una referencia al mismo objeto que x.