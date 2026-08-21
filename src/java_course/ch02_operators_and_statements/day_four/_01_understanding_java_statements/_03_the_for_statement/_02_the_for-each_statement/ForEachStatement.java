final String[] names = new String[3];
names[0] = "Lisa";
names[1] = "Kevin";
names[2] = "Roger";
for(String name : names) {
    System.out.print(name + ", ");
}

/*
 * La salida es "Lisa, Kevin, Roger, " porque el bucle for-each recorre cada elemento del arreglo names 
 * y lo imprime seguido de una coma y un espacio.
*/