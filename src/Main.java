//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        ShipFleetManager myFleet = ShipFleetManager.getInstance();
        myFleet.addNewShip(ShipType.X_WING, "Tomasz Mildner");

        myFleet.addNewShip(ShipType.X_WING, "Nathan Mildner");

        myFleet.addNewShip(ShipType.Y_WING, "Katarzyna Skindzier");

        myFleet.addNewShip(ShipType.A_WING, "Tadeusz Knopik");

        myFleet.addNewShip(ShipType.MILLENNIUM_FALCON, "Nero Trzy Dwa Zero");


        myFleet.listAllShips();
    }
}