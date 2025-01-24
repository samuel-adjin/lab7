package prob4;

public interface FlyWithWings extends FlyBehaviour{
    @Override
    public default void fly() {
        System.out.println("Fly with Wings");
    }
}
