import java.util.*;

public class ShipFleetManager {
    Map<String, Ship> shipFleet;

    private static ShipFleetManager shipFleetManagerInstance;

    private ShipFleetManager() {
        shipFleet = new HashMap<>();
    }

    public static ShipFleetManager getInstance() {
        if (shipFleetManagerInstance == null) {
            shipFleetManagerInstance = new ShipFleetManager();
        }
        return shipFleetManagerInstance;
    }

    public void addNewShip(ShipType type, String pilotName, ShipStatus status) {
        String newShipID = ShipIdGenerator.getInstance().generateId(type);
        int price = type.getShipTypePrice();
        Ship newShip = new Ship(newShipID, type, pilotName, price, status);
        ;
        shipFleet.put(newShipID, newShip);
    }

    public void listAllShips() {
        if (shipFleet.isEmpty()) {
            System.out.println("Ship fleet: EMPTY");
        } else {
            for (Ship ship : shipFleet.values()) {
                System.out.println(ship);
            }
        }
    }

    public void listShipsByStatus(ShipStatus status) {
        boolean found = false;
        if (shipFleet.isEmpty()) {
            System.out.println("Ship fleet: EMPTY");
        } else {
            for (Ship ship : shipFleet.values()) {
                if (ship.getStatus() == status) {
                    System.out.println(ship);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No ships with status: " + status);
        }
    }
}
