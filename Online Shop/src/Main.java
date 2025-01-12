import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<String>();
        ArrayList<String> History = new ArrayList<String>();
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
                    int shopChoice = sc.nextInt();
                    //need to add how much each item will be costed and what type of items will be in each category.
                }
            }
        }
    }
}

                    
