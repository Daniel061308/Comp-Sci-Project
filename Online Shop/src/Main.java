import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cartName = new ArrayList<String>();
        ArrayList<Integer> cartQuantity = new ArrayList<Integer>();
        ArrayList<Integer> cartCategory = new ArrayList<Integer>();
        ArrayList<Integer> cartItemNumber = new ArrayList<Integer>();
        ArrayList<String> History = new ArrayList<String>();

        ArrayList<String> sportProductName = new ArrayList<String>();
        sportProductName.add("mask");
        sportProductName.add("boots");
        ArrayList<Integer> sportProductAvailibity = new ArrayList<Integer>();
        sportProductAvailibity.add(1);
        sportProductAvailibity.add(3);

        ArrayList<String> clothingProductName = new ArrayList<String>();
        clothingProductName.add("hat");
        clothingProductName.add("shoe");
        ArrayList<Integer> clothingProductAvailibity = new ArrayList<Integer>();
        clothingProductAvailibity.add(1);
        clothingProductAvailibity.add(10);

        ArrayList<String> bookProductName = new ArrayList<String>();
        bookProductName.add("book1");
        bookProductName.add("book3");
        ArrayList<Integer> bookProductAvailibity = new ArrayList<Integer>();
        bookProductAvailibity.add(1);
        bookProductAvailibity.add(2);


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
                    if(shopChoice == 1){
                         System.out.println("items:");
                        for(int ii = 0; sportProductAvailibity.size()>ii;ii++){
                           //remember to use printf
                            System.out.printf("%d %s Availability %d %n",ii+1, sportProductName.get(ii), sportProductAvailibity.get(ii));
                        }
                        System.out.println("select items");
                        int AddCartItem = sc.nextInt();
                        if(AddCartItem > 0 && AddCartItem <= sportProductName.size()){
                            while(true){
                                System.out.println("List the amount you would like to purchase");
                                int Wants = sc.nextInt();
                                if(Wants > sportProductAvailibity.get(AddCartItem-1)){
                                    System.out.println("Not enough items to fulfill the order");
                                    }else{
                                        cartName.add(sportProductName.get(AddCartItem-1));
                                        cartQuantity.add(Wants);
                                        cartcategory.add(0);
                                        cartItemNumber.add(AddCartNumber-1);
                                        sportProductAvailibity.set(AddCartItem-1, sportProductAvailibity.get(AddCartItem-1)-Wants);
                                        System.out.println("Item has been added to your cart");
                                        break;
                                    }
                            }
                        }
                    }
                    else if(shopChoice==2){
                        
                    }else if(shopChoice==3){
                        
                    }else if(shopChoice==4){
                        System.out.println("shopping cart items:");
                        for(int ii = 0; cartName.size()>ii;ii++){
                            System.out.printf("%d %s Item: %d %n",ii+1,cartName.get(ii),cartQuantity.get(ii));
                        }
                        System.out.println("Pick an option:");
                        System.out.println("1. Check out");
                        System.out.println("2. Update Cart");
                        System.out.println("3. Exit to shopping menu");
                        int CheckChoice = sc.nextInt();
                        if(CheckChoice==1){
                            
                        }else if(CheckChoice==2){
                            System.out.println("what do you want to update?");
                            int AddCartItem = sc.nextInt();
                        if(AddCartItem > 0 && AddCartItem <= CartName.size()){
                            
                            while(true){
                                System.out.println("List the amount you would like to purchase");
                                int Wants = sc.nextInt();
                                if(Wants < 0){
                                    System.out.println("Invaild Input");
                                    
                                }else if(Wants==0){
                                    System.out.println("Item has been removed");
                                    CartName.remove(AddCartItem-1);
                                    CartQuanity.remove(AddCartItem-1);
                                    break;
                                }else if (Wants>0){
                                    if(Wants>CartQuanity.get(AddCartItem-1)){
                                        System.out.println("Not enough items to remove");
                                    }else if(Wants == CartQuanity.get(AddCartItem-1)){
                                        System.out.println("nothing happened");
                                    }else if(Wants< CartQuanity.get(AddCartItem-1)){
                                        System.out.println("the item has changed to your wanted amount");
                                        CartQuanity.set(AddCartItem,Wants);
                                        if(cartCategory.get(AddCartItem-1) == 0){
                                            sportProductAvailability.set(cartItemNumber.get(AddCartItem-1),CartQuanity.get(AddCartItem-1)-Wants);
                                        }
                                    }
                                    }
                                    CartQuanity.set(,CartQuanity.get(AddCartItem)-Wants);
                                }
                                if(Wants > CartQuanity.get(AddCartItem-1)){
                                    System.out.println("Not enough items to fulfill the order");
                                    }else{
                                        cartName.add(sportProductName.get(AddCartItem-1));
                                        cartQuantity.add(Wants);
                                        sportProductAvailibity.set(AddCartItem-1, sportProductAvailibity.get(AddCartItem-1)-Wants);
                                        System.out.println("Item has been added to your cart");
                                        break;
                                    }
                            }
                        }else if (CheckChoice==3){
                            
                        }
                    }
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
