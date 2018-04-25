package Chapter2_옵저버패턴.WorkStation.Display;

import Chapter2_옵저버패턴.WorkStation.Observer.DisplayElement;
import Chapter2_옵저버패턴.WorkStation.Observer.Observer;
import Chapter2_옵저버패턴.WorkStation.Observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject wetherDate;

    public CurrentConditionsDisplay(Subject wetherDate) {
        this.wetherDate = wetherDate;
        wetherDate.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
