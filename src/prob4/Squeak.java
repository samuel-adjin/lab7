package prob4;


public interface Squeak extends QuackBehaviour {
    @Override
    public default void quack() {
        System.out.println("Squeaking");
    }
}
