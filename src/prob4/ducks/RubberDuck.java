package prob4.ducks;


import prob4.CanotFly;
import prob4.Squeak;

public class RubberDuck extends Duck implements CanotFly,Squeak {

    public RubberDuck() {
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
