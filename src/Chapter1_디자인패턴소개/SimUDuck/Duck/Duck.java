package Chapter1_디자인패턴소개.SimUDuck.Duck;

import Chapter1_디자인패턴소개.SimUDuck.Fly.FlyBehavior;
import Chapter1_디자인패턴소개.SimUDuck.Quack.QuackBehavior;

public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuick(){
        quackBehavior.quack();
    }
    public void swim(){}
    public void display(){}
    public void performFly(){
        flyBehavior.fly();
    }
}