package Chapter1_디자인패턴소개.SimUDuck.main;

import Chapter1_디자인패턴소개.SimUDuck.Duck.Duck;
import Chapter1_디자인패턴소개.SimUDuck.Duck.MallarDuck;
import Chapter1_디자인패턴소개.SimUDuck.Duck.ModelDuck;
import Chapter1_디자인패턴소개.SimUDuck.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuick();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
