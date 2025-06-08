import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        ShipFleetManager myFleet = ShipFleetManager.getInstance();
//        myFleet.addNewShip(ShipType.X_WING, "Tomasz Mildner", ShipStatus.RENTED);
//
//        myFleet.addNewShip(ShipType.X_WING, "Luke Skywalker", ShipStatus.RENTED);
//
//        myFleet.addNewShip(ShipType.Y_WING, "Jar Jar Binks", ShipStatus.RENTED);
//
//        myFleet.addNewShip(ShipType.A_WING, "N/A", ShipStatus.FREE);

        // myFleet.addNewShip(ShipType.MILLENNIUM_FALCON, "N/A", ShipStatus.FREE);


        boolean programRunning = true;
        while (programRunning) {
            printMainMenu();
            Scanner scanMainMenuChoice = new Scanner(System.in);
            String scanMainMenuChoiceInput = scanMainMenuChoice.nextLine();


            switch (scanMainMenuChoiceInput) {
                case "1":

                    boolean choosingShip = true;
                    while (choosingShip) {
                        printShipMenu();
                        Scanner scanShipChoice = new Scanner(System.in);
                        String scanShipChoiceInput = scanShipChoice.nextLine();

                        switch (scanShipChoiceInput) {
                            case "1":
                                System.out.println("New X-Wing added to fleet.");
                                myFleet.addNewShip(ShipType.X_WING, "N/A", ShipStatus.FREE);
                                choosingShip = false;
                                break;
                            case "2":
                                System.out.println("New A-Wing added to fleet.");
                                myFleet.addNewShip(ShipType.A_WING, "N/A", ShipStatus.FREE);
                                choosingShip = false;
                                break;
                            case "3":
                                System.out.println("New Y-Wing added to fleet.");
                                myFleet.addNewShip(ShipType.Y_WING, "N/A", ShipStatus.FREE);
                                choosingShip = false;
                                break;
                            case "4":
                                System.out.println("New Millenium Falcon added to fleet.");
                                myFleet.addNewShip(ShipType.MILLENNIUM_FALCON, "N/A", ShipStatus.FREE);
                                choosingShip = false;
                                break;
                            default:
                                System.out.println("WRONG INPUT");
                        }
                    }
                    break;


                case "2":
                    myFleet.listAllShips();
                    break;
                case "3":
                    myFleet.listShipsByStatus(ShipStatus.FREE);
                    break;
                case "4":
                    myFleet.listShipsByStatus(ShipStatus.RENTED);
                    break;
                case "5":
                    boolean chooseShipRental = true;
                    while(chooseShipRental) {
                        System.out.println("All available ships:");
                        myFleet.listShipsByStatus(ShipStatus.FREE);
                        Scanner scanRentedShipsChoice = new Scanner(System.in);
                        System.out.println("Enter ship ID");
                        String canRentedShipsChoiceID = scanRentedShipsChoice.nextLine();

                        if(myFleet.shipFleet.containsKey(canRentedShipsChoiceID)) {
                            System.out.println("SHIP RENTED");
                            break;
                        }
                        else
                        {
                            System.out.println("NOPE");

                        }



                    }
                    break;
                case "6":
                    System.out.println("You return a ship.");
                    break;
                case "7":
                    System.out.println("BYE");
                    programRunning = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("WRONG INPUT, TRY AGAIN");
            }
        }


    }

    public static void printMainMenu() {
        System.out.println("Greetings, what would you like to do?");
        System.out.println("1: Add new ship");
        System.out.println("2: List all ships");
        System.out.println("3: List free ships");
        System.out.println("4: List rented ships");
        System.out.println("5: Rent a ship");
        System.out.println("6: Return a ship");
        System.out.println("7: Exit");

        System.out.println("\nChoose an option:");
    }

    public static void printShipMenu() {
        int i = 1;
        for (ShipType type : ShipType.values()) {
            System.out.println(i + ". " + type);
            i++;
        }
        System.out.println("Choose a ship type!");
    }
}





