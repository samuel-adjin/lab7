package prob4;


public interface MuteQuack extends QuackBehaviour {
    @Override
    public default void quack() {
        System.out.println("Cannot Quack");
    }
}
