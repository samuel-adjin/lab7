package prob4.ducks;


import prob4.FlyWithWings;
import prob4.Quack;

public class MallardDuck extends Duck implements Quack,FlyWithWings {

    public MallardDuck() {
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
