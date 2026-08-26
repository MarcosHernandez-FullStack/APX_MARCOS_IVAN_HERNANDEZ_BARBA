String s1 = "1";
String s2 = s1.concat("2");
s2.concat("3");
System.out.println(s2);

/*
 * El valor de s2 es "12" porque el método concat() no modifica la cadena original, 
 * sino que devuelve una nueva cadena por el principio de inmutabilidad. Por lo tanto, 
 * la llamada a s2.concat("3") no cambia el valor de s2, y cuando se imprime s2, se 
 * obtiene "12".
*/