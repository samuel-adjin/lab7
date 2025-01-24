package prob4.ducks;


import prob4.FlyBehaviour;
import prob4.QuackBehaviour;

public abstract class Duck implements FlyBehaviour, QuackBehaviour {

   public abstract void display();
   public void swim() {
        System.out.println("Swimming");
    }



}
