package Chapter3_데코레이터.StarbuzzCoffe.Beverage;

public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
