public class WeatherChaser extends WeatherObserver {

    private Weather weather;
    private WeatherStation weatherStation;
    private Weather desiredWeather;

    public WeatherChaser(WeatherStation weatherStation, Weather desiredWeather) {
        this.weather = weatherStation.getState();
        this.weatherStation = weatherStation;
        this.desiredWeather = desiredWeather;

        weatherStation.attach(this);
    }


    @Override
    public void update() {
        weather = weatherStation.getState();

        if(weather == desiredWeather) {
            System.out.println("We have found the desired " + weather + " weather!");
            //weatherStation.detach(this);
        }
    }
}
