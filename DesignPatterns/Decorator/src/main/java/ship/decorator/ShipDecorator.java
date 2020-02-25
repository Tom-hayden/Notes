package ship.decorator;

import ship.Ship;

public abstract class ShipDecorator extends Ship {

    private Ship ship;

    public ShipDecorator(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String fireAllGuns() {
        return getShip().fireAllGuns();
    }

    @Override
    public int getMaxSpeed() {
        return getShip().getMaxSpeed() - 1;
    }

    Ship getShip() {
        return ship;
    }


}
