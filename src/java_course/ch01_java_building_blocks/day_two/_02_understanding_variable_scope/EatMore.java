public void eatMore(boolean hungry, int amountOfFood) {
    int roomInBelly = 5;
    if (hungry) {
        boolean timeToEat = true;
        while (amountOfFood > 0) {
            int amountEaten = 2;
            roomInBelly = roomInBelly - amountEaten;
            amountOfFood = amountOfFood - amountEaten;
        }
    }
    System.out.println(amountOfFood);
}

// 1. La variable roomInBelly es una variable local de la función eatMore().
// 2. La variable timeToEat es una variable local de la rama if().
// 3. La variable amountEaten es una variable local del bucle while().
// 4. La variable amountOfFood es un parámetro de la función eatMore().