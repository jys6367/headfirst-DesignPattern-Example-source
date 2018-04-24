package Chapter1_디자인패턴소개.SimUDuck.Quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
