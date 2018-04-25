package Chapter3_데코레이터.StarbuzzCoffe.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return 1;
    }
}
