import java.util.Scanner;

public class WTCMillerKellermannTelkamp {

    public static void main(String[] args){
        Boat boat = new Boat("Tug",false,"Tooty Toot", "River","11",55.0,"Ticket",15,20);
        Ship ship = new Ship(2,2,"SS Strong","Ocean","53",80.50,"Ticket",40,200);
        Submarine submarine = new Submarine(1000,"The Whale","Deep Ocean", "BoonDocks",5000.0,"Rent",40,300);
        Plane plane = new Plane(2, 4, 3, "Boeing 747", "Southwest",
                "Mechanical", 42000, 8000, "7:30 p.m.", 200, "Ticket", 460,
                200);

        Helicopter helicopter = new Helicopter("H175", 1, "Mechanical", 10000, "6:00 pm",
                500, 300, "Ticket", 200, 6);

        Dirigible dirigible = new Dirigible("Blimp", "Helium", "Gas", 4000, 700, "2:00 p.m.",
                400, "Ticket", 35, 15);

        HotAirBalloon hotAirBalloon = new HotAirBalloon("Montgolfier", "Buoyancy", 3000,
                6000, "3:30 p.m.", 300, "Ticket", 10, 10);

        Train train = new Train(75, "ticket", 65, 250, "Diesel",
                "Electric", 520,2, "Short Distance" ,
                "tram");

        Automobile automobile = new Automobile(250, "Rental", 50, 5, "Petrolium",
                "Electric", 4,"Manual",  4,"Sedan");

        Bus bus = new Bus(5, "ticket", 45, 50, "Diesel", "Combustion",
                8, "Single-Decker", "Public");

        Bike bike = new Bike(15, "ticket", 10, 1, "None", "None",
                2, "Aluminum Alloy", "City Bike",  "Wilmignton Travel Center");



        Scanner input = new Scanner(System.in);
        //Ask the user what type of transportation they want to use (Land, Air, Water)
        System.out.println("Which type of transportation would you like (Land, Air, Water)");
        String selection ="";

        //TODO:In a table format, display the options for the type selected, the cost of transportation,
        // whether the purchase is for a ticket or for a rental, the average speed, and the number of passengers allowed.
        switch (input.nextLine().toLowerCase()) {
            case "land" -> {
                System.out.println("Land");
                System.out.printf("%-20s%-15s%-15s%-15s%-15s%n", "Type", "Cost", "Purchase Type", "Average Speed", "Passengers Allowed");
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Train", train.getCost(), train.getPurchaseType(),
                        train.getAvgSpeed(), train.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Automobile", automobile.getCost(), automobile.getPurchaseType(),
                        automobile.getAvgSpeed(), automobile.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Bus", bus.getCost(), bus.getPurchaseType(), bus.getAvgSpeed(), bus.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Bike", bike.getCost(), bike.getPurchaseType(), bike.getAvgSpeed(), bike.getCapacity());
            }
            case "air" -> {
                System.out.println("Air");
                System.out.printf("%-20s%-15s%-15s%-15s%-15s%n", "Type", "Cost", "Purchase Type", "Average Speed", "Passengers Allowed");
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Plane", plane.getCost(), plane.getPurchaseType(), plane.getAvgSpeed(), plane.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Helicopter", helicopter.getCost(), helicopter.getPurchaseType(), helicopter.getAvgSpeed(), helicopter.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Dirigible", dirigible.getCost(), dirigible.getPurchaseType(), dirigible.getAvgSpeed(), dirigible.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Hot Air Balloon", hotAirBalloon.getCost(), hotAirBalloon.getPurchaseType(), hotAirBalloon.getAvgSpeed(), hotAirBalloon.getCapacity());
            }
            case "water" -> {
                System.out.println("Water");
                System.out.printf("%-20s%-15s%-15s%-15s%-15s%n", "Type", "Cost", "Purchase Type", "Average Speed", "Passengers Allowed");
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Boat", boat.getCost(), boat.getPurchaseType(), boat.getAvgSpeed(), boat.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Ship", ship.getCost(), ship.getPurchaseType(), ship.getAvgSpeed(), ship.getCapacity());
                System.out.printf("%-20s%-15.2f%-15s%-15d%-15d%n", "Submarine", submarine.getCost(), submarine.getPurchaseType(), submarine.getAvgSpeed(), submarine.getCapacity());
            }
            default -> {
            }
        }

        //Ask the user to select which mode of transportation they want to use.
        System.out.println("Which mode of transportation would you like? (Enter the Type)");
        //TODO:Display ALL information about the selected mode using an overridden toString method.
        double totalCost = 0;
        switch (input.nextLine().toLowerCase()) {
            case "plane" -> {
                System.out.print(plane);
                System.out.println("Is this the correct mode of transportation? ");
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * plane.getCost();
                    System.out.println("Your flight leaves at " + plane.getDeparture());
                }
            }
            case "helicopter" -> {
                System.out.print(helicopter);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * helicopter.getCost();
                    System.out.println("Your flight leaves at " + helicopter.getDeparture());
                }
            }
            case "dirigible" -> {
                System.out.print(dirigible);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * dirigible.getCost();
                    System.out.println("Your flight leaves at " + dirigible.getDeparture());
                }
            }
            case "hot air balloon" -> {
                System.out.print(hotAirBalloon);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * hotAirBalloon.getCost();
                    System.out.println("Your flight leaves at " + hotAirBalloon.getDeparture());
                }
            }
            case "boat" -> {
                System.out.print(boat);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * boat.getCost();
                }
            }
            case "ship" -> {
                System.out.print(ship);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * ship.getCost();
                }
            }
            case "submarine" -> {
                System.out.print(submarine);
                System.out.println("Is this the correct mode of transportation? ");
                //Ask the user to verify that this is the mode of transportation they want to use
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    //Ask the user how many passengers need to travel using that mode of transportation
                    System.out.println("How many passengers do you have?");
                    totalCost = input.nextInt() * submarine.getCost();
                }
            }
        }
        //Display the total cost
        System.out.print("Total cost = $" + totalCost);
        //TODO:Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)
    }
}
