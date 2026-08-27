Koala.count = 4;
Koala koala1 = new Koala();
Koala koala2 = new Koala();
koala1.count = 6;
koala2.count = 5;
System.out.println(Koala.count);


/*
 * Explicación:
 *
 * count es una variable static, por lo tanto pertenece a la clase
 * y es compartida por todos los objetos Koala.
 *
 * Koala.count = 4;      // count vale 4
 * koala1.count = 6;     // la misma variable ahora vale 6
 * koala2.count = 5;     // la misma variable ahora vale 5
 *
 * Por eso System.out.println(Koala.count) imprime 5.
 *
 * Regla:
 * static = una sola copia compartida por toda la clase.
 */