package grocerybillcost;
import java.util.Scanner;
public class GroceryBillCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Puts the scanner to work.
        System.out.println("Welcome to Shopping Bill Estimator!");
        int addItem = 1; // Declares an integer variable "addItem"
        double subTotal = 0; // Declares a double varialbe "subTotal";

        // This loop calculates the cost of purchasing the items entered by the user and adds it to previously entered items.
        while (true) {
            System.out.print("Enter the name of the item you wish to purchase: ");
            String itemName = input.next(); // User enters the name of the item.
            System.out.print("Enter the cost of " + itemName + " in U.S. dollars: $");
            double itemPrice = input.nextDouble(); // User enters the price of the item.
            System.out.print("Enter the number/amount of " + itemName + " you wish to buy: ");
            double itemAmount = input.nextDouble(); // User enteres the amount to buy.
            double itemCost = (itemPrice * itemAmount); // Calculates the total price for buying multiples of the same item.
            System.out.println("Purchasing " + itemName + " will cost you $" + itemCost + ".");
            subTotal = (itemCost + subTotal); // Adds the cost of the current item to previously entered items.
            System.out.println("Your estimated subtotal before taxes is: $" + subTotal);
            System.out.print("Do you wish to add another product to your estimate? (Enter 1 for yes, or enter 2 for no): ");
            addItem = input.nextInt(); // Takes the number the user enters.

            // Loop continues if the user enters 1. If 1 is entered, it will ask for the next item.
            if (addItem == 1) {
            } else {
                break;
            }
        }


        double totalBill = ((subTotal * 0.1) + subTotal); // Calculates the entire bill including tax.
        System.out.println("Your total estimate, including taxes is $" + totalBill);

    }
}