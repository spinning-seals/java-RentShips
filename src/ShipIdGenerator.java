import java.util.*;

public class ShipIdGenerator
{
    Map<ShipType, Integer> shipIdInventory;

    private static ShipIdGenerator shipIdGeneratorInstance;

    private ShipIdGenerator()
    {
        shipIdInventory = new HashMap<>();
    }

    public static ShipIdGenerator getInstance()
    {
        if (shipIdGeneratorInstance == null)
        {
            shipIdGeneratorInstance = new ShipIdGenerator();
        }
        return shipIdGeneratorInstance;
    }

    public String generateId(ShipType type)
    {

        int current = shipIdInventory.getOrDefault(type,0);
        int next = current + 1;
        shipIdInventory.put(type, next);
        return  type.getShipIdPrefix() + "-" + String.format("%03d",shipIdInventory.getOrDefault(type, 0) );
    }
}