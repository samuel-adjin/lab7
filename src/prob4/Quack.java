package prob4;


public interface Quack extends QuackBehaviour {

    @Override
    public default void quack() {
        System.out.println("Quacking");
    }
}
