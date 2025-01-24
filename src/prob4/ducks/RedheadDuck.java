package prob4.ducks;


import prob4.FlyWithWings;
import prob4.Quack;

public class RedheadDuck extends Duck implements Quack, FlyWithWings {

    public RedheadDuck() {
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
