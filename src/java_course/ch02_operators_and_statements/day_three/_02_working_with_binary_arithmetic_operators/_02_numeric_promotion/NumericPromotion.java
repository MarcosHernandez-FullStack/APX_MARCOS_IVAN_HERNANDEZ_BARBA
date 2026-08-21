/*
Las reglas de promoción son:

1. Si dos valores tienen tipos de datos diferentes, Java automáticamente convertirá uno de los
valores al tipo de datos mayor de los dos.

2. Si uno de los valores es entero y el otro es de punto flotante, Java convertirá automáticamente
el valor entero al tipo de datos del valor de punto flotante.


3. Los tipos de datos más pequeños, a saber, byte, short y char, se convierten primero a int cada 
vez que se utilizan con un operador aritmético binario de Java, incluso si ninguno de los operandos 
es int.

4. Una vez que se haya producido toda la promoción y los operandos tengan el mismo tipo de datos, el
valor resultante tendrá el mismo tipo de datos que sus operandos promovidos.

*/

//What is the data type of x * y?
int x = 1;
long y = 33;
//La respuesta sería de tipo long, se asume el tipo de datos más grande, que es long.

//What is the data type of x + y?
double x = 39.21;
float y = 2.1;
//La respuesta sería de tipo double, se asume el tipo de datos más grande, que es double.

//What is the data type of x / y?
short x = 10;
short y = 3;
/*
 * La respuesta sería de tipo int, ya que los tipos de datos más pequeños, a saber, byte, short y char, 
 * se convierten primero a int cada vez que se utilizan con un operador aritmético binario de Java,
 * incluso si ninguno de los operandos es int.
*/

// What is the data type of x * y / z?
short x = 14;
float y = 13;
double z = 30;

/*
 * "x" se convertirá a int
 * Al multiplicar int * float, el resultado será de tipo float
 * Al dividir float / double, el resultado será de tipo double
 * Resultado final: double
*/
