int x = 6;
boolean y = (x >= 6) || (++x <= 7);
System.out.println(x);

/*
 * El operador lógico OR (||) evalúa la primera condición (x >= 6) y como es verdadera, 
 * no evalúa la segunda condición (++x <= 7). 
 * Por lo tanto, x no se incrementa y su valor sigue siendo 6.
 * Resultado final: x = 6
*/