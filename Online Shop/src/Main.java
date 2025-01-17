import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cartName = new ArrayList<String>();
        ArrayList<Integer> cartQuantity = new ArrayList<Integer>();
        ArrayList<Integer> cartCategory = new ArrayList<Integer>();
        ArrayList<Integer> cartItemNumber = new ArrayList<Integer>();
        ArrayList<Integer> cartPrice = new ArrayList<Integer>();  // Changed to cartPrice
        ArrayList<String> History = new ArrayList<String>();

        ArrayList<String> sportProductName = new ArrayList<String>();
        sportProductName.add("mask");
        sportProductName.add("boots");
        sportProductName.add("glove");
        ArrayList<Integer> sportProductAvailibity = new ArrayList<Integer>();
        sportProductAvailibity.add(1);
        sportProductAvailibity.add(3);
        sportProductAvailibity.add(20);
        
        ArrayList<Integer> sportProductPrice = new ArrayList<Integer>();
        sportProductPrice.add(10);
        sportProductPrice.add(30);
        sportProductPrice.add(40);

        ArrayList<String> clothingProductName = new ArrayList<String>();
        clothingProductName.add("hat");
        clothingProductName.add("shoe");
        clothingProductName.add("Roman Armour");
        ArrayList<Integer> clothingProductAvailibity = new ArrayList<Integer>();
        clothingProductAvailibity.add(1);
        clothingProductAvailibity.add(10);
        clothingProductAvailibity.add(15);
        ArrayList<Integer> clothingProductPrice = new ArrayList<Integer>(); // Added price for clothing
        clothingProductPrice.add(5);  // Example price for hat
        clothingProductPrice.add(20); // Example price for shoe
        clothingProductPrice.add(999);

        ArrayList<String> bookProductName = new ArrayList<String>();
        bookProductName.add("Orb of Pinnacle");
        bookProductName.add("God's Flames");
        bookProductName.add("Super Super");
        ArrayList<Integer> bookProductAvailibity = new ArrayList<Integer>();
        bookProductAvailibity.add(1);
        bookProductAvailibity.add(2);
        bookProductAvailibity.add(10);
        ArrayList<Integer> bookProductPrice = new ArrayList<Integer>(); // Added price for books
        bookProductPrice.add(15);  // Example price for book1
        bookProductPrice.add(25);  // Example price for book3
        bookProductPrice.add(10);

        String ADMIN_PASS = "The Solitude Worker";
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Amazon 2.0! press 1 or 2 or 3");
            System.out.println("1. Admin");
            System.out.println("2. Shop");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int MainChoice = sc.nextInt();
            if (MainChoice == 1) {
                sc.nextLine(); // Consume newline left-over
                System.out.print("Enter admin password: ");
                String password = sc.nextLine();
                if (!password.equals(ADMIN_PASS)) {
                    System.out.println("Incorrect password. Returning to main menu...");
                } else {
                    System.out.println("Admin Access Granted.");
                    if (History.isEmpty()) {
                        System.out.println("No purchases have been made yet.");
                    } else {
                        System.out.println("Purchase History:");
                        for (int i = 0; i < History.size(); i++) {
                            System.out.println((i + 1) + ". " + History.get(i));
                        }
                    }
                }
            } else if (MainChoice == 2) {
                boolean shopping = true;
                while (shopping) {
                    System.out.println("Shop Categories: (Integer)");
                    System.out.println("1. Sports");
                    System.out.println("2. Clothing");
                    System.out.println("3. Books");
                    System.out.println("4. Shopping Cart");
                    System.out.println("5. Exit to Main Menu");
                    System.out.print("Choose a category: ");

                    int shopChoice = sc.nextInt();
                    if (shopChoice == 1) {
                        System.out.println("Items:");
                        for (int ii = 0; ii < sportProductAvailibity.size(); ii++) {
                            int availability = sportProductAvailibity.get(ii);
                            String productName = sportProductName.get(ii);
                            if (availability > 0) {
                                System.out.printf("%d. %s - Availability: %d - Price: $%d%n", ii + 1, productName, availability, sportProductPrice.get(ii));
                            } else {
                                System.out.printf("%d. %s - Out of stock%n", ii + 1, productName);
                            }
                        }
                        System.out.println("Select an item:");
                        int AddCartItem = sc.nextInt();
                        if (AddCartItem > 0 && AddCartItem <= sportProductName.size()) {
                            int itemIndex = AddCartItem - 1;
                            if (sportProductAvailibity.get(itemIndex) > 0) {
                                while (true) {
                                    System.out.println("List the amount you would like to purchase:");
                                    int Wants = sc.nextInt();
                                    if (Wants > sportProductAvailibity.get(itemIndex)) {
                                        System.out.println("Not enough items to fulfill the order");
                                    } else {
                                        cartName.add(sportProductName.get(itemIndex));
                                        cartQuantity.add(Wants);
                                        cartCategory.add(0);
                                        cartItemNumber.add(itemIndex);
                                        int itemPrice = sportProductPrice.get(itemIndex) * Wants;
                                        cartPrice.add(itemPrice); // Calculate and add price to cart
                                        sportProductAvailibity.set(itemIndex, sportProductAvailibity.get(itemIndex) - Wants);
                                        System.out.println("Item has been added to your cart");
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("This item is out of stock.");
                            }
                        }
                    } else if (shopChoice == 2) {
                        System.out.println("Items:");
                        for (int ii = 0; ii < clothingProductAvailibity.size(); ii++) {
                            int availability = clothingProductAvailibity.get(ii);
                            String productName = clothingProductName.get(ii);
                            if (availability > 0) {
                                System.out.printf("%d. %s - Availability: %d - Price: $%d%n", ii + 1, productName, availability, clothingProductPrice.get(ii));
                            } else {
                                System.out.printf("%d. %s - Out of stock%n", ii + 1, productName);
                            }
                        }
                        System.out.println("Select an item:");
                        int AddCartItem = sc.nextInt();
                        if (AddCartItem > 0 && AddCartItem <= clothingProductName.size()) {
                            int itemIndex = AddCartItem - 1;
                            if (clothingProductAvailibity.get(itemIndex) > 0) {
                                while (true) {
                                    System.out.println("List the amount you would like to purchase:");
                                    int Wants = sc.nextInt();
                                    if (Wants > clothingProductAvailibity.get(itemIndex)) {
                                        System.out.println("Not enough items to fulfill the order");
                                    } else {
                                        cartName.add(clothingProductName.get(itemIndex));
                                        cartQuantity.add(Wants);
                                        cartCategory.add(1);
                                        cartItemNumber.add(itemIndex);
                                        int itemPrice = clothingProductPrice.get(itemIndex) * Wants;
                                        cartPrice.add(itemPrice); // Calculate and add price to cart
                                        clothingProductAvailibity.set(itemIndex, clothingProductAvailibity.get(itemIndex) - Wants);
                                        System.out.println("Item has been added to your cart");
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("This item is out of stock.");
                            }
                        }
                    } else if (shopChoice == 3) {
                        System.out.println("Items:");
                        for (int ii = 0; ii < bookProductAvailibity.size(); ii++) {
                            int availability = bookProductAvailibity.get(ii);
                            String productName = bookProductName.get(ii);
                            if (availability > 0) {
                                System.out.printf("%d. %s - Availability: %d - Price: $%d%n", ii + 1, productName, availability, bookProductPrice.get(ii));
                            } else {
                                System.out.printf("%d. %s - Out of stock %n", ii + 1, productName);
                            }
                        }
                        System.out.println("Select an item:");
                        int AddCartItem = sc.nextInt();
                        if (AddCartItem > 0 && AddCartItem <= bookProductName.size()) {
                            int itemIndex = AddCartItem - 1;
                            if (bookProductAvailibity.get(itemIndex) > 0) {
                                while (true) {
                                    System.out.println("List the amount you would like to purchase:");
                                    int Wants = sc.nextInt();
                                    if (Wants > bookProductAvailibity.get(itemIndex)) {
                                        System.out.println("Not enough items to fulfill the order");
                                    } else {
                                        cartName.add(bookProductName.get(itemIndex));
                                        cartQuantity.add(Wants);
                                        cartCategory.add(2);
                                        cartItemNumber.add(itemIndex);
                                        int itemPrice = bookProductPrice.get(itemIndex) * Wants;
                                        cartPrice.add(itemPrice); // Calculate and add price to cart
                                        bookProductAvailibity.set(itemIndex, bookProductAvailibity.get(itemIndex) - Wants);
                                        System.out.println("Item has been added to your cart");
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("This item is out of stock.");
                            }
                        }
                    } else if (shopChoice == 4) {
                        System.out.println("Shopping Cart Items:");
                        int totalPrice = 0;
                        for (int ii = 0; ii < cartName.size(); ii++) {
                            System.out.printf("%d. %s - Quantity: %d - Price: $%d%n", ii + 1, cartName.get(ii), cartQuantity.get(ii), cartPrice.get(ii));
                            totalPrice += cartPrice.get(ii);
                        }
                        System.out.printf("Total Price: $%d%n", totalPrice);
                        System.out.println("Pick an option:");
                        System.out.println("1. Check out");
                        System.out.println("2. Update Cart");
                        System.out.println("3. Exit to shopping menu");
                        int CheckChoice = sc.nextInt();
                        if (CheckChoice == 1) {
                            System.out.println("You are about to checkout with a total of $" + totalPrice);
                            // Here you could add the logic for completing the purchase and adding to history
                            History.add("Purchase: $" + totalPrice);
                            cartName.clear();
                            cartQuantity.clear();
                            cartCategory.clear();
                            cartItemNumber.clear();
                            cartPrice.clear();
                            System.out.println("Thank you for your purchase!");
                        }else if (CheckChoice == 2) {
                            if (cartName.isEmpty()) {
                                System.out.println("Your cart is empty!");
                        } else {
                            System.out.println("Select an item to update:");
                            for (int ii = 0; ii < cartName.size(); ii++) {
                                System.out.printf("%d. %s - Quantity: %d%n", ii + 1, cartName.get(ii), cartQuantity.get(ii));
                            }
                            System.out.print("Enter the number of the item you want to update: ");
                            int itemToUpdate = sc.nextInt();
        
                            if (itemToUpdate >= 1 && itemToUpdate <= cartName.size()) {
                                int index = itemToUpdate - 1;
                                System.out.printf("You selected: %s%n", cartName.get(index));
                                System.out.printf("Current quantity: %d%n", cartQuantity.get(index));
                                System.out.print("How many do you want to remove? (Enter 0 to cancel): ");
                                int amountToRemove = sc.nextInt();
            
                                if (amountToRemove == 0) {
                                    System.out.println("Update cancelled.");
                                } else if (amountToRemove > cartQuantity.get(index)) {
                                    System.out.println("You cannot remove more items than you have in your cart.");
                                } else {
                                    int newQuantity = cartQuantity.get(index) - amountToRemove;
                                    int category = cartCategory.get(index);
                                    int itemNumber = cartItemNumber.get(index);

                                    // Update availability in the original product list
                                 if (category == 0) { // Sports
                                        sportProductAvailibity.set(itemNumber, sportProductAvailibity.get(itemNumber) + amountToRemove);
                                } else if (category == 1) { // Clothing
                                    clothingProductAvailibity.set(itemNumber, clothingProductAvailibity.get(itemNumber) + amountToRemove);
                                } else if (category == 2) { // Books
                                    bookProductAvailibity.set(itemNumber, bookProductAvailibity.get(itemNumber) + amountToRemove);
                                }
                                // Update cart
                                cartQuantity.set(index, newQuantity);
                                int pricePerItem = cartPrice.get(index) / (cartQuantity.get(index) + amountToRemove); // Original price per item
                                cartPrice.set(index, pricePerItem * newQuantity);
                                if (newQuantity == 0) {
                                 // If quantity becomes zero, remove the item from the cart
                                    cartName.remove(index);
                                    cartQuantity.remove(index);
                                    cartCategory.remove(index);
                                    cartItemNumber.remove(index);
                                    cartPrice.remove(index);
                                    System.out.println("Item removed from cart.");
                                } else {
                                    System.out.printf("Removed %d items. New quantity: %d%n", amountToRemove, newQuantity);
                                }
                            }
                        } else {
                            System.out.println("Invalid item number.");
                                }
                        }
                    } else if (CheckChoice == 3) {
                            System.out.println("Returning to shopping menu...");
                        }
                    } else if (shopChoice == 5) {
                        shopping = false;
                    }
                }
            } else if (MainChoice == 3) {
                System.out.println("Thanks for shopping.");
                running = false;
            }
        }
        sc.close();
    }
}
