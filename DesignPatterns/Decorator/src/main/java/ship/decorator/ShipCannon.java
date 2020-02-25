package ship.decorator;

import ship.Ship;

public class ShipCannon extends ShipDecorator {

    private int ammo;

    public ShipCannon(Ship ship, int ammo) {
        super(ship);
        this.ammo = ammo;
    }

    @Override
    public String fireAllGuns() {
        if (ammo > 0) {
            ammo = ammo -1;
            return super.getShip().fireAllGuns() + " BANG!";
        } else {
            return super.getShip().fireAllGuns();
        }
    }

    @Override
    public int getMaxSpeed() {
        return super.getShip().getMaxSpeed() - 1;
    }
}
