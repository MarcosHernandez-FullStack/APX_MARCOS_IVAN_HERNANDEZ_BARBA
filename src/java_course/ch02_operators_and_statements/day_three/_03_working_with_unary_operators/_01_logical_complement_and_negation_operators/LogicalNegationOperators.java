boolean x = false;
System.out.println(x); // respuesta: false
x = !x;
System.out.println(x); // respuesta: true


double x = 1.21;
System.out.println(x); // reespuesta: 1.21
x = -x;
System.out.println(x); // reespuesta: -1.21
x = -x;
System.out.println(x); // reespuesta: 1.21


int x = !5; // No compila, porque porque en Java no se puede realizar la inversión lógica de un valor 
// numérico

boolean y = -true; // No compila, porque no se puede negar numéricamente un valor booleano

boolean z = !0; // No compila, porque no se puede tomar el complemento lógico de un valor numérico, 
// ni se puede asignar un número entero a una variable booleana .