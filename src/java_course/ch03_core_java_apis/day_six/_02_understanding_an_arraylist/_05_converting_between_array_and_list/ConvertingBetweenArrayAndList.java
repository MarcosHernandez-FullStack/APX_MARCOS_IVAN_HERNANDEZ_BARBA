List<String> list = new ArrayList<>();
list.add("hawk");
list.add("robin");
Object[] objectArray = list.toArray();
System.out.println(objectArray.length); // 2
String[] stringArray = list.toArray(new String[0]);
System.out.println(stringArray.length); // 2


/*
 * Explicación:
 *
 * Se crea un ArrayList de String y se agregan dos elementos:
 * "hawk" y "robin".
 *
 * list.toArray()
 * Convierte el ArrayList en un arreglo de tipo Object[].
 *
 * Como la lista tiene 2 elementos,
 * objectArray.length devuelve 2.
 *
 * list.toArray(new String[0])
 * Convierte el ArrayList en un arreglo de tipo String[].
 *
 * El new String[0] indica el tipo de arreglo que se desea obtener.
 * Java crea automáticamente un arreglo con el tamaño necesario.
 *
 * Como la lista tiene 2 elementos,
 * stringArray.length también devuelve 2.
 *
 * Resultado:
 * 2
 * 2
 */