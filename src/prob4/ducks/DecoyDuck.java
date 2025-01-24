package prob4.ducks;


import prob4.CanotFly;
import prob4.MuteQuack;

public class DecoyDuck extends Duck implements CanotFly,MuteQuack {

    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}
