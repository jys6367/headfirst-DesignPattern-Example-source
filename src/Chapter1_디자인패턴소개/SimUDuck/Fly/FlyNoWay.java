package Chapter1_디자인패턴소개.SimUDuck.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
