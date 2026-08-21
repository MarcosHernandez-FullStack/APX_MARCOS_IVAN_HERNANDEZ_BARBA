int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
for(int[] mySimpleArray : myComplexArray) {
    for(int i=0; i<mySimpleArray.length; i++) {
    System.out.print(mySimpleArray[i]+"\t");
    }
    System.out.println();
}

/*
 * La salida es:
 * 5	2	1	3	
 * 3	9	8	9	
 * 5	7	12	7	
 * 
 * El bucle for-each recorre cada sub-arreglo (mySimpleArray) dentro del arreglo bidimensional (myComplexArray) 
 * y luego un bucle for interno recorre cada elemento del sub-arreglo, imprimiéndolos con un tabulador entre ellos.
*/