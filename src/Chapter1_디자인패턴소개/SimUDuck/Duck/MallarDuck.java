package Chapter1_디자인패턴소개.SimUDuck.Duck;

import Chapter1_디자인패턴소개.SimUDuck.Fly.FlyWithWings;
import Chapter1_디자인패턴소개.SimUDuck.Quack.Quack;

public class MallarDuck extends Duck{
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
