public class App {
    public static void main(String[] args) {

        int DAYS = 10;

        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver mobileApp = new MobileWeatherApp(weatherStation);

        WeatherObserver weatherChaser = new WeatherChaser(weatherStation, Weather.FANTASTIC);
        WeatherObserver weatherChaser2 = new WeatherChaser(weatherStation, Weather.SUNNY);


        for (int i = 0 ; i < DAYS ;  ++i) {

            System.out.println("DAY " + (i + 1) + " out here in Weatherland!");

            weatherStation.passTime();
            System.out.println("Today it is " + weatherStation.getState());

            System.out.println();
        }
    }

}