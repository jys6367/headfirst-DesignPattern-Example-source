package Chapter1_디자인패턴소개.SimUDuck.Duck;

import Chapter1_디자인패턴소개.SimUDuck.Fly.FlyWithWings;
import Chapter1_디자인패턴소개.SimUDuck.Quack.Quack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() { super.display(); }

}
