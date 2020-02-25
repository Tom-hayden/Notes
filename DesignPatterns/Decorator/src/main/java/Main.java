import ship.decorator.ShipCannon;
import ship.Ship;
import ship.Warship;
import ship.decorator.ShipMisfire;
import ship.decorator.ShipSuperFuel;

public class Main {

    public static void main(String[] args) {


        Ship ship = new Warship();

        ship = new ShipCannon(ship,20);
        ship = new ShipCannon(ship,10);
        ship = new ShipCannon(ship,5);

        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Max speed: " + ship.getMaxSpeed() + " speed");

//        System.out.println("Adding Super Fuel");
//        ship = new ShipSuperFuel(ship);
//        System.out.println("Max speed: " + ship.getMaxSpeed() + " speed!");
//        System.out.println("Max speed: " + ship.getMaxSpeed() + " speed");

        ship = new ShipMisfire(ship,0.3);
        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Firing guns!   " + ship.fireAllGuns());
        System.out.println("Firing guns!   " + ship.fireAllGuns());
    }

}
