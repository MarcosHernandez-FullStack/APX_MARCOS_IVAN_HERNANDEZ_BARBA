int dayOfWeek = 5;
    switch(dayOfWeek) {
        default:
            System.out.println("Weekday");
            break;
        case 0:
            System.out.println("Sunday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
    }

/*
 * En este ejemplo, la variable dayOfWeek tiene un valor de 5, que no coincide con ninguno de los 
 * casos especificados (0 o 6).
 * Por lo tanto, se ejecutará el bloque de código dentro del caso default, y se imprimirá "Weekday".
*/