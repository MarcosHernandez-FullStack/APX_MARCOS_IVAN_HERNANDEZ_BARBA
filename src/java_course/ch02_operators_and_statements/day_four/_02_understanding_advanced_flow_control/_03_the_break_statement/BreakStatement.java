public class SearchSample {
    public static void main(String[] args) {
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
            "("+positionX+","+positionY+")");
        }
    }
}

/*
 * La salida es "Value 2 found at: (1,1)" porque el bucle anidado recorre cada elemento del arreglo bidimensional list 
 * y cuando encuentra el valor de búsqueda (searchValue), guarda las posiciones (positionX y positionY) y rompe el bucle 
 * externo usando la etiqueta PARENT_LOOP.
 * 
 * Si el valor de búsqueda no se encuentra, se imprimirá "Value 2 not found".
*/