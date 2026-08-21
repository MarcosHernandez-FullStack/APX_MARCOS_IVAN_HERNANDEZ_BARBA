/*
 * La conversión de tipos primitivos es necesaria siempre que se pase de un tipo de dato numérico 
 * mayor a uno menor, o cuando se convierta un número de coma flotante a un valor entero.
*/

int x = (int)1.0; //Guardado como int, pero el valor es un double
short y = (short)1921222; //Guardado como short, pero el valor es mayor al máximo permitido para un short
int z = (int)9l;//Guardado como int, pero el valor es un long
long t = 192301398193810323L;//Guardado como long, pero el valor es un long sin la letra L al final del número

//-------------------------------------------------------------------------------------------------------------
long x = 10;
int y = 5;
y *= x;

/*
 * y se convierte temporalmente de int a long para multiplicar con x.
 * Se calcula 5 * 10 = 50 como long.
 * Luego Java convierte automáticamente ese resultado de long a int para guardarlo nuevamente en y,
 * esto porque toma el tipo de dato de la variable que está a la izquierda del operador de asignación.
 * Resultado final: y = 50 -- int
*/