import java.util.ArrayList;
import java.util.List;


public class WeatherStation {

    private List<WeatherObserver> observers = new ArrayList<WeatherObserver>();
    private Weather weather = Weather.CALM;

    public Weather getState() {
        return weather;
    }

    public void passTime() {
        weather = Weather.randomWeather();
        notifyAllObservers();
    }

    public void attach (WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    public void detach (WeatherObserver weatherObserver) {
        if (!observers.remove(weatherObserver)){
            throw new Error("Could not find observer" + weatherObserver.toString());
        }
    }

    public void notifyAllObservers() {

        List<WeatherObserver> observersCpy = observers;
        for (WeatherObserver weatherObserver : observersCpy) {
            weatherObserver.update();
        }
    }
}


