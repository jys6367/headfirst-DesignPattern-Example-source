package Chapter2_옵저버.main;

import Chapter2_옵저버.WorkStation.Display.CurrentConditionsDisplay;
import Chapter2_옵저버.WorkStation.Display.ForecastDisplay;
import Chapter2_옵저버.WorkStation.Display.StatisticsDisplay;
import Chapter2_옵저버.WorkStation.WorkStation.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
