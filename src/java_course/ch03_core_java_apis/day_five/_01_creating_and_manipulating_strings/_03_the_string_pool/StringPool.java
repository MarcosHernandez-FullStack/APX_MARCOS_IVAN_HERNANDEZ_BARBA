String name = "Fluffy";
String name = new String("Fluffy");

/*
 * En este caso, la primera línea crea una cadena literal "Fluffy" y la almacena en el pool de cadenas. 
 * La segunda línea crea un nuevo objeto String en el heap con el mismo contenido "Fluffy", pero no lo 
 * almacena en el pool de cadenas. Por lo tanto, aunque ambos objetos contienen el mismo valor, pero son 
 * diferentes instancias de String. Las cadenas que no están en el grupo de cadenas se eliminan mediante
 * el recolector de basura, al igual que cualquier otro objeto. Esta eliminación ocurre cuando no hay 
 * referencias activas a la cadena, lo que permite que el recolector de basura libere la memoria ocupada 
 * por esa cadena.
*/