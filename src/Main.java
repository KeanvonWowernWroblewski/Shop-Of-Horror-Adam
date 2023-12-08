import java.util.Scanner;


//!!! ändrat strukturen för Main klassen
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        shop.addProduct(new Product ("Fake Blood ", 300.45, 4));
        shop.addProduct(new Product ("Mask ", 259, 23));
        shop.addProduct(new Rabatt("Mike Myers mask ", 123.45, 0.2, 45));

        while (true) {
            shop.displayProducts();
            System.out.print("Make your choice: ");
            try {
                int choice = scanner.nextInt();
                if (choice == 4) {
                    break;
                }
                shop.productChoice(choice);
            } catch (Exception e) {
                System.out.println("Something went wrong! Please try again.");
                break;
            }
        }
        shop.receipt();
    }
}
