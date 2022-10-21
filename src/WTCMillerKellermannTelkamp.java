import java.util.Scanner;

public class WTCMillerKellermannTelkamp {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        //Ask the user what type of transportation they want to use (Land, Air, Water)
        System.out.println("Which type of transportation would you like (Land, Air, Water)");
        String selection ="";


        //TODO:In a table format, display the options for the type selected, the cost of transportation,
        // whether the purchase is for a ticket or for a rental, the average speed, and the number of passengers allowed.
        switch (input.nextLine().toLowerCase()) {
            case "land":
                System.out.println("Land");
                break;
            case "air": break;
            case "water": break;
            default:
        }

        //TODO:Ask the user to select which mode of transportation they want to use.
        System.out.println("Which mode of transportation would you like?");
        //TODO:Display ALL information about the selected mode using an overridden toString method.
        //TODO: Ask the user to verify that this is the mode of transportation they want to use
        //TODO:Ask the user how many passengers need to travel using that mode of transportation
        //TODO:Display the total cost
        //TODO:Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental, etc.)
    }
}
