int x = 3;
int y = ++x * 5 / x-- + --x;
System.out.println("x is " + x);
System.out.println("y is " + y);

/*
El flujo es el siguiente:

int y = 4 * 5 / 4 + 2; 

Primero se le suma uno a 1 (++x) --> 4
Luego se le resta uno a 4 (x--) --> considerar que es post por lo tanto en x-- aún no se verá esa resta, resultado 4
Luego se le resta uno a 3 (--x) --> 2
*/