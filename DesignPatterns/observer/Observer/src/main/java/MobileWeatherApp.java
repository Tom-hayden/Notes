public class MobileWeatherApp extends WeatherObserver {

    private Weather weather;

    public MobileWeatherApp(WeatherStation weatherStation) {
        this.weather = weatherStation.getState();
        this.weatherStation = weatherStation;

        weatherStation.attach(this);
    }


    @Override
    public void update() {
        weather = weatherStation.getState();
        if (weather.equals(Weather.STORMY) || weather.equals(Weather.SMELLY)) {
            System.out.println("Weather is bad. Time to stay indoors :(");
        }
    }
}
