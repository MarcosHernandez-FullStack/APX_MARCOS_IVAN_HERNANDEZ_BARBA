int x = 10, y = 20, z = 10;
System.out.println(x < y); // Respuesta: true, porque 10 es menor que 20
System.out.println(x <= y); // Respuesta: true, porque 10 es menor que 20
System.out.println(x >= z); // Respuesta: true, porque 10 es igual a 10
System.out.println(x > z); // Respuesta: false, porque 10 no es mayor que 10


/*
 * Verdadero si la referencia a la que apunta a es una instancia de
 * una clase, subclase o clase que implementa una interfaz
 * particular, como se indica en b.
 * Ejemplo: si b es una referencia a un objeto de la clase Perro,
 * entonces a instanceof Perro devuelve true, y a instanceof Animal también devuelve true.
*/

class Animal {}
class Perro extends Animal {}
Animal animal = new Perro();

System.out.println(animal instanceof Perro);   // Respuesta: true
System.out.println(animal instanceof Animal); // Respuesta: true