package prob4;

public interface QuackBehaviour {
    default void quack() {
        System.out.println("QuackBehaviour");
    }
}
