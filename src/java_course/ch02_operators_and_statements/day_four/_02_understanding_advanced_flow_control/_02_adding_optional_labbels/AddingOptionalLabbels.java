int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
    INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
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
 * 
 * Los labels OUTER_LOOP e INNER_LOOP son opcionales y se pueden usar para identificar los bucles en caso de que se 
 * necesite hacer referencia a ellos, por ejemplo, para romper o continuar un bucle específico.
*/