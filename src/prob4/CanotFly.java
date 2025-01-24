package prob4;

public interface CanotFly extends FlyBehaviour{
    @Override
    public default void fly() {
        System.out.println("CanotFly");
    }
}
