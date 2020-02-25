package ship.decorator;

import ship.Ship;

public class ShipSuperFuel extends ShipDecorator {
    private int fuel;

    public ShipSuperFuel(Ship ship) {
        super(ship);
        fuel = 1;
    }

    @Override
    public int getMaxSpeed() {
        if (fuel > 0) {
            fuel = fuel -1;
            return super.getShip().getMaxSpeed()*3;
        }
        else {
            return super.getShip().getMaxSpeed();
        }

    }
}
