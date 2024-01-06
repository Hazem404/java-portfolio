//***********************************************************
// Name: Hzeme Mohmamed
// Title: Assignment2.java
// Time spent: 20 minutes
// Date 6/11/23				
//**************************************************************
//Part 1 ###############
// (1) 
/*a) x == y / 2 evaluates to true.
b) x % 2 == 0 || y % 2 != 0 evaluates to true.
c) x - y < 0 && !(x >= y) evaluates to true.
d) x + 6 != y || x / y <= 0 evaluates to true.*/
// (2)
/*Scanner sc = new Scanner(System.in);
System.out.println("Please enter your full name:");
String fullName = sc.nextLine();*/
//(3) 
/*The output of the mystrey is Hy
 * because String mystery = str.substring(0,1) + str.substring(n-1, n) 
 * prints the first and last charcter and the program got n from th above 
 * statment wich equals to 5
 */
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        final double HAMBURGER_PRICE = 2.75;
        final double CHEESEBURGER_PRICE = 3.25;
        final double FRENCH_FRIES_PRICE = 2.50;
        final double DRINK_PRICE = 1.50;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the In-N-Out Burger menu:\n------------------------------------------------------");
        System.out.println("Hamburger\t" + HAMBURGER_PRICE);
        System.out.println("Cheeseburger\t" + CHEESEBURGER_PRICE);
        System.out.println("French Fries\t" + FRENCH_FRIES_PRICE);
        System.out.println("Shake & Beverage:\t" +DRINK_PRICE);

        System.out.print("How many hamburger(s) would you like to buy? ");
        int numHamburgers = scanner.nextInt();

        System.out.print("How many cheeseburger(s) would you like to buy? ");
        int numCheeseburgers = scanner.nextInt();

        System.out.print("How many French fries would you like to buy? ");
        int numFries = scanner.nextInt();

        System.out.print("How many drinks would you like to buy? ");
        int numDrinks = scanner.nextInt();

        double totalHamburgerCost = numHamburgers * HAMBURGER_PRICE;
        double totalCheeseburgerCost = numCheeseburgers * CHEESEBURGER_PRICE;
        double totalFriesCost = numFries * FRENCH_FRIES_PRICE;
        double totalDrinkCost = numDrinks * DRINK_PRICE;

        String highestTotalCostItem = "hamburgers";
        double highestTotalCost = totalHamburgerCost;

        if (totalCheeseburgerCost > highestTotalCost) {
            highestTotalCost = totalCheeseburgerCost;
            highestTotalCostItem = "cheeseburgers";
        }

        if (totalFriesCost > highestTotalCost) {
            highestTotalCost = totalFriesCost;
            highestTotalCostItem = "fries";
        }

        if (totalDrinkCost > highestTotalCost) {
            highestTotalCost = totalDrinkCost;
            highestTotalCostItem = "drinks";
        }

        double totalOrderCost = totalHamburgerCost + totalCheeseburgerCost + totalFriesCost + totalDrinkCost;

        System.out.println("\nTotal cost for hamburgers: " + totalHamburgerCost);
        System.out.println("Total cost for cheeseburgers: " + totalCheeseburgerCost);
        System.out.println("Total cost for fries: " + totalFriesCost);
        System.out.println("Total cost for drinks: " + totalDrinkCost);
        System.out.println("Item with the highest total cost: " + highestTotalCostItem);
        System.out.println("Total cost for the order: " + totalOrderCost);
        System.out.println("Total number of hamburgers: " + numHamburgers);
        System.out.println("Total number of cheeseburgers: " + numCheeseburgers);
        System.out.println("Total number of fries: " + numFries);
        System.out.println("Total number of drinks: " + numDrinks);

    }
}