public class Animal {
    private int age;
    private String name;
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}


/*
 * Animal es la clase padre, con super() hace llamado al constructor de su clase padre, es decir, Object.
 * Animal tiene dos contructores, los cuáles se llamarán por la clases hijas y se identificarán de acuerdo 
 * al número de parámetros que se le envíen.
*/