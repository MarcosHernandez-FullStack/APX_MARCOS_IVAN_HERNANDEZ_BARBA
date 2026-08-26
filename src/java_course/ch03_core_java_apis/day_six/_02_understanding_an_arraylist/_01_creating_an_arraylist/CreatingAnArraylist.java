//Declaración de ArrayList en versiones anteriores a Java 5
ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList(10);
ArrayList list3 = new ArrayList(list2);

/*
 * Según los arrayslist definidos anteriormente se tiene:
 * 1. Crea un ArrayList con espacio para el número predeterminado de elementos, pero sin llenar aún ningún espacio.
 * 2. Crea un ArrayList con un número específico de espacios, pero sin asignar ninguno.
 * 3. Hace una copia de otro ArrayList. Se copia tanto el tamaño como el contenido de ese ArrayList.
*/


//Declaración de ArrayList en versiones iguales o superiores a Java 5
ArrayList<String> list4 = new ArrayList<String>();
ArrayList<String> list5 = new ArrayList<>();