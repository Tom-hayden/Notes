package ship.decorator;

import ship.Ship;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShipMisfire extends ShipDecorator {
    private double chance;

    public ShipMisfire(Ship ship, double chance) {
        super(ship);
        this.chance = chance;
    }

    @Override
    public String fireAllGuns() {


        return Arrays.stream(getShip().fireAllGuns().split(" ")).map(s -> {
            if (Math.random() < chance) {
                return "";
            } else {
                return s;
            }
        }).collect(Collectors.joining());
    }
}
