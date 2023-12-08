import java.util.ArrayList;
import java.util.List;


//!!! helt ny klass för att få ut mycket ur main klassen och slippa några uppreppningar av kod och ett par if else satser
public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final Kund kund = new Kund();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("-----------------Shop of Horror-----------------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println("4. Pay and exit");
        System.out.println("------------------------------------------------");
    }

    public void productChoice(int choice) {
        if (choice > 0 && choice <= products.size()) {
            Product selectedProduct = products.get(choice - 1);
            if (selectedProduct.getStock() > 0) {
                kund.buyProduct(selectedProduct);
                selectedProduct.newStock(selectedProduct.getStock() - 1);
            } else {
                System.out.println("<< Out of stock >>");
            }
        } else {
            System.out.println("---->Invalid answer.<----");
        }
    }

    public void receipt() {
        System.out.println("Total products purchased: " + kund.getTotalProducts());
        System.out.println("Total cost: " + kund.gettotalSum() + " kr ");
    }
}
