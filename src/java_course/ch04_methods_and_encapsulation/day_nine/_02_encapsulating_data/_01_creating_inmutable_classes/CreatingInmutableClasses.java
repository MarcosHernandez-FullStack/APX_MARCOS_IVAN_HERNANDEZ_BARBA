//Esta clase es inmutable porque después de la inicilización de la variable privada numberEggs no sufre algún cambio.
public class ImmutableSwan {
    private int numberEggs;
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    public int getNumberEggs() {
        return numberEggs;
    } 
}