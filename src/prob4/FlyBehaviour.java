package prob4;

public interface FlyBehaviour {
    default void fly(){
        System.out.println("FlyBehaviour");
    }
}
