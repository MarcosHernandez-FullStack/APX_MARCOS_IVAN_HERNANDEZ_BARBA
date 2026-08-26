//Método add(): inserta nuevo valor al ArrayList
List<String> birds = new ArrayList<>();
birds.add("hawk"); // Agrega [hawk] al final del ArryaList
birds.add(1, "robin"); //  Agrega "robin" al valor de la posición 1 de ArrayList, resultado: [hawk, robin]
birds.add(0, "blue jay"); // Agrega "blue jay" al valor de la posición 0 de ArrayList, resultado[blue jay, hawk, robin]
birds.add(1, "cardinal"); // Agrega "cardinal" al valor de la posición 1 de ArrayList, resultado: [blue jay, cardinal, hawk, robin]
System.out.println(birds); // [blue jay, cardinal, hawk, robin]

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//Método remove(): elimina el primer valor coincidente en el ArrayList o elimina el elemento en un índice específico
List<String> birds = new ArrayList<>();
birds.add("hawk"); // [hawk]
birds.add("hawk"); // [hawk, hawk]
System.out.println(birds.remove("cardinal")); // Imprime false, porque no encontro "cardinal" en el ArrayList
7: System.out.println(birds.remove("hawk")); // Imprime true, porque encontró "hawk" en el ArrayList y lo eliminó
System.out.println(birds.remove(0)); // Imprime "hawk" porque fue el elemento que se encuentra en la posición 0 del ArrayList
System.out.println(birds); // Imprime [], porque todos los elementos fueron eliminados del ArrayList

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//Método set(): modifica uno de los elementos del ArrayList sin cambiar su tamaño
List<String> birds = new ArrayList<>();
birds.add("hawk"); // [hawk]
System.out.println(birds.size()); // 1
birds.set(0, "robin"); // Modifica el valor que se encuentra en la posición 0 ("hawk") con el valor de [robin].
System.out.println(birds.size()); // 1
birds.set(1, "robin"); /* Intenta modificar el valor que se encuentra en la posición 1, pero el ArrayList no 
                        * tiene esa posición y mucho menos un valor. Por esto java lanza una excepción:
                        * IndexOutOfBoundsException*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------                       

/* Método isEmpty() and size():       
 * isEmpty(): verifica si el ArrayList está vacío
 * size(): brinda el valor del tamaño
*/
System.out.println(birds.isEmpty()); // true, porque en un inicio el ArrayList está vacío
System.out.println(birds.size()); // 0, porque en un inicio el tamaño es cero
birds.add("hawk"); // [hawk]
birds.add("hawk"); // [hawk, hawk]
System.out.println(birds.isEmpty()); // false, porque ahora el ArrayList ya no está vacío [hawk, hawk]
System.out.println(birds.size()); // 2, porque ahora el ArrayList ya tiene dos elementos [hawk, hawk]

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//Método clear(): limpia todos los elementos del ArrayList
List<String> birds = new ArrayList<>();
birds.add("hawk"); // [hawk]
birds.add("hawk"); // [hawk, hawk]
System.out.println(birds.isEmpty()); // false
System.out.println(birds.size()); // 2
birds.clear(); // []
System.out.println(birds.isEmpty()); // true
System.out.println(birds.size()); // 0
//Después de llamar a clear(), birds vuelve a ser un ArrayList vacío de tamaño 0.

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//Método contains(): comprueba si un valor determinado está presente en el ArrayList
List<String> birds = new ArrayList<>();
birds.add("hawk"); // [hawk]
System.out.println(birds.contains("hawk")); // true
System.out.println(birds.contains("robin")); // false
/*
 *Este método llama a equals() en cada elemento de ArrayList para ver si hay cualquier coincidencia. 
 * Dado que String implementa equals(), esto funciona bien.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//Método equals(): permite comparar dos listas y ver si contienen los mismos elementos en el mismo orden.
List<String> one = new ArrayList<>();
List<String> two = new ArrayList<>();
System.out.println(one.equals(two)); // true, porque ambas están vacías
one.add("a"); // [a]
System.out.println(one.equals(two)); // false, porque one contiene "a" y two no contiene algún elemento
two.add("a"); // [a]
System.out.println(one.equals(two)); // true, porque tanto "a" como "b" contiene el mismo elemento "a" en la posición 0
one.add("b"); // [a,b]
two.add(0, "b"); // [b,a]
System.out.println(one.equals(two)); /* false, porque one contiene [a,b] y twwo contiene [b,a], al comparar valores por 
                                      * posición one[0]=a y two[0]=b, los valores no son iguales.
                                      */  
