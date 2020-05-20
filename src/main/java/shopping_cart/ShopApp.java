package shopping_cart;

import java.util.Scanner;

public class ShopApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cart items = new Cart();

        System.out.println("Enter the name of the item: ");
        String name = input.nextLine();
        System.out.println("Enter the unit price: ");
        double price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();
        items.addItems(name, price, quantity); //add items to our Cart class per user input

        System.out.println("Current Cart:");
        items.showAllItems();
        System.out.println();

        System.out.println("Continue shopping? (y/n)");
        String response = input.next();

        while (!response.equals("n")) {

            if (response.equals("y")) {
                System.out.println("Enter the name of the item: ");
                name = input.next();
                input.nextLine();
                System.out.println("Enter the unit price: ");
                price = input.nextDouble();
                input.nextLine();
                System.out.println("Enter the quantity: ");
                quantity = input.nextInt();
                input.nextLine();

                items.addItems(name, price, quantity);// keep adding into the list
                System.out.println();
                System.out.println("Current Cart: ");
                items.showAllItems();
            }
            System.out.println();
            System.out.println("Continue shopping (y/n)");
            response = input.next();
        }
        System.out.println("What would you like to do next?");
        System.out.println("enter 1 to checkout");
        System.out.println("enter 2 to remove items");
        response = input.next();

        if (response.equals("2")) {
            System.out.println("Enter the name of the item to remove: ");
            name = input.next();
            items.removeItems(name);//remove item from the list

            System.out.println();
            System.out.println("Current Cart: ");
            items.showAllItems();
            System.out.println();
        } else {

        }
        System.out.println("Proceed to checkout...");
        System.out.println("Thank you for shopping with us!");


    }
}
