package Chapter1_디자인패턴소개.SimUDuck.Fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
