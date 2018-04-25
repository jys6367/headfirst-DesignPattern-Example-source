package Chapter2_옵저버.WorkStation.Display;

import Chapter2_옵저버.WorkStation.Observer.DisplayElement;
import Chapter2_옵저버.WorkStation.Observer.Observer;
import Chapter2_옵저버.WorkStation.Observer.Subject;
import Chapter2_옵저버.WorkStation.WorkStation.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject wetherDate;

    public ForecastDisplay(WeatherData weatherData) {
        this.wetherDate = wetherDate;
        wetherDate.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("forcast{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
