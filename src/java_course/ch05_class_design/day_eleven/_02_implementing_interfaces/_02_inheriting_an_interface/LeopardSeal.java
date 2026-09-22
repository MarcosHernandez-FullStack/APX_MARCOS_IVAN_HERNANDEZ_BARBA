public interface HasTail {
    public int getTailLength();
}
public interface HasWhiskers {
    public int getNumberOfWhiskers();
}
public abstract class HarborSeal implements HasTail, HasWhiskers {
}
public class LeopardSeal implements HasTail, HasWhiskers { 
}

/*
 * La clase LeopardSeal no compila porque no implementa los métodos de:
 * - HasTail: getTailLength()
 * - HasWhiskers: getNumberOfWhiskers()
*/