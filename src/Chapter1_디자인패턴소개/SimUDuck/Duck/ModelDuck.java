package Chapter1_디자인패턴소개.SimUDuck.Duck;

import Chapter1_디자인패턴소개.SimUDuck.Fly.FlyNoWay;
import Chapter1_디자인패턴소개.SimUDuck.Quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
