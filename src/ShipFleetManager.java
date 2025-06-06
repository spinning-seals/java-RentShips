import java.util.*;

public class ShipFleetManager
{
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

    public void addNewShip(ShipType type, String pilotName)
    {
        String newShipID = ShipIdGenerator.getInstance().generateId(type);
        int price = type.getShipTypePrice();
        Ship newShip = new Ship(newShipID, type, pilotName, price, ShipStatus.RENTED);;
        shipFleet.put(newShipID, newShip);
    }

    public void listAllShips()
    {
        if(shipFleet.isEmpty())
        {
            System.out.println("Ship fleet: EMPTY");
        } else
        {
            for (Ship ship : shipFleet.values()) {
                System.out.println(ship);
            }
        }
    }
}
