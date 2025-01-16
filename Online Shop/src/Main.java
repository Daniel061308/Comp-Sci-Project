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
        ArrayList<Integer> sportProductAvailibity = new ArrayList<Integer>();
        sportProductAvailibity.add(1);
        sportProductAvailibity.add(3);
        ArrayList<Integer> sportProductPrice = new ArrayList<Integer>();
        sportProductPrice.add(10);
        sportProductPrice.add(30);

        ArrayList<String> clothingProductName = new ArrayList<String>();
        clothingProductName.add("hat");
        clothingProductName.add("shoe");
        ArrayList<Integer> clothingProductAvailibity = new ArrayList<Integer>();
        clothingProductAvailibity.add(1);
        clothingProductAvailibity.add(10);
        ArrayList<Integer> clothingProductPrice = new ArrayList<Integer>(); // Added price for clothing
        clothingProductPrice.add(5);  // Example price for hat
        clothingProductPrice.add(20); // Example price for shoe

        ArrayList<String> bookProductName = new ArrayList<String>();
        bookProductName.add("book1");
        bookProductName.add("book3");
        ArrayList<Integer> bookProductAvailibity = new ArrayList<Integer>();
        bookProductAvailibity.add(1);
        bookProductAvailibity.add(2);
        ArrayList<Integer> bookProductPrice = new ArrayList<Integer>(); // Added price for books
        bookProductPrice.add(15);  // Example price for book1
        bookProductPrice.add(25);  // Example price for book3

        String ADMIN_PASS = "Hello World";
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Shop!");
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
                    System.out.println("Shop Categories:");
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
                        } else if (CheckChoice == 2) {
                            // Update cart
                        } else if (CheckChoice == 3) {
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
