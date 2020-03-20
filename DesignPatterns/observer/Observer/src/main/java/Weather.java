import java.util.*;

public enum Weather {
    WINDY,
    CALM,
    SUNNY,
    STORMY,
    FROSTY,
    BAKING,
    SMELLY,
    FOGGY,
    FANTASTIC;

    private static final List<Weather> values = Arrays.asList(values());
    private static final Random random = new Random();

    public static Weather randomWeather() {
        return values.get(random.nextInt(values.size()));
    }

}
