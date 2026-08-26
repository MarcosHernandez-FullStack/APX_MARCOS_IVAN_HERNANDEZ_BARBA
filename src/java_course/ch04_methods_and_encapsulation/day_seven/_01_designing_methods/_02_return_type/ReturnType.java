public void walk1() { }
public void walk2() { return; }
public String walk3() { return ""; }
public String walk4() { } // No compila, porque no hay un return String
public walk5() { } // No compila, porque falta el tipo de retorno
String walk6(int a) { if (a == 4) return ""; } /* * No compila, porque retorna un valor siempre y 
                                                  * cuando se cumpla la condición a == 4, si fuera diferente 
                                                  * de 4 se quedaría sin un retorno
                                                */ 