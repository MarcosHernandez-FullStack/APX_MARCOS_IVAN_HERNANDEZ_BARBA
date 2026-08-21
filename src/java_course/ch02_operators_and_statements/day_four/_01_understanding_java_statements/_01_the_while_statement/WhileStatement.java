int roomInBelly = 5;
public void eatCheese(int bitesOfCheese) {
    while (bitesOfCheese > 0 && roomInBelly > 0) {
        bitesOfCheese--;
        roomInBelly--;
    }
    System.out.println(bitesOfCheese+" pieces of cheese left");
}

/*
 * Ejecuta el método eatCheese con 10 piezas de queso y observa la salida. 
 * ¿Cuántas piezas de queso quedan? ¿Cuánto espacio queda en el estómago?
 * Quedan 5 piezas de queso y queda 0 espacio en el estómago.
*/