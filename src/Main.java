//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        ShipFleetManager myFleet = ShipFleetManager.getInstance();
        myFleet.addNewShip(ShipType.X_WING, "Tomasz Mildner");

        myFleet.addNewShip(ShipType.X_WING, "Luke Skywalker");

        myFleet.addNewShip(ShipType.Y_WING, "Jar Jar Binks");

        myFleet.addNewShip(ShipType.A_WING, "Milan Vucic");

        myFleet.addNewShip(ShipType.MILLENNIUM_FALCON, "Han Solo");


        myFleet.listAllShips();
    }
}
