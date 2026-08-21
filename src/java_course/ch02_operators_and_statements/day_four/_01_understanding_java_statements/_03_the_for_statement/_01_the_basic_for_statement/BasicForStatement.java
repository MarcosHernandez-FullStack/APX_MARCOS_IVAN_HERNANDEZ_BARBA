int x = 0;
long y = 10;
for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
System.out.print(x + " ");
}

/*
 * La salida es 4 porque el bucle for se ejecuta mientras la condición x < 5 y y < 10 sea verdadera.
*/