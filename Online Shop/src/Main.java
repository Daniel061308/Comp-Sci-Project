import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cartName = new ArrayList<String>();
        ArrayList<String> cartQuantity = new ArrayList<String>();
        ArrayList<String> History = new ArrayList<String>();

        ArrayList<String> sportProductName = new ArrayList<String>();
        ArrayList<Integer> sportProductAvailibity = new ArrayList<Integer>();

        ArrayList<String> clothingProductName = new ArrayList<String>();
        ArrayList<Integer> clothingProductAvailibity = new ArrayList<Integer>();

        ArrayList<String> bookProductName = new ArrayList<String>();
        ArrayList<Integer> bookProductAvailibity = new ArrayList<Integer>();


        final String ADMIN_PASS = "Hello World";
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Shop!");
            System.out.println("1. Admin");
            System.out.println("2. Shop");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int MainChoice = sc.nextInt();
            if (MainChoice == 1) {
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
                    //start from here, and make the functionality for each shop category and the shopping cart within the while (shopping)
                    //loop, including item selection, adding to the cart, and navigating back to the main menu.
                    int shopChoice = sc.nextInt();
                }
            } else if (MainChoice == 3) {
                System.out.println("Thanks for shopping.");
                running = false;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
