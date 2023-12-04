import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sätter värden in i variablerna som är skapade i metoden i vara-klassen
        Kund kund = new Kund();
        Vara vara1 = new Vara("Fake Blood", 300.45,4);
        Vara vara2 = new Vara("Mask", 259,23);
        Rabatt rabatt = new Rabatt("Mike Myers mask", 123.45, 0.2, 45);
        /* Skriver ut menyn med de värdena man har gett variablerna,
         skriver ut varje gång man har köpt något
         */
        while (true) {
            System.out.println("-----------------Shop of horror-----------------");
            System.out.println("1. " + vara1.getProduct() + " [ " + vara1.getPrice() + " kr]" + "(In stock: " + vara1.getLager() + ")");
            System.out.println("2. " + vara2.getProduct() + " [ " + vara2.getPrice() + " kr]" + "(In stock: " + vara2.getLager() + ")");
            System.out.println("3. " + rabatt.getProduct() + " [ " + rabatt.getPrice() + " kr]" + "(In stock: " + rabatt.getLager() + ")");
            System.out.println("4. Pay and exit: ");
            System.out.println("------------------------------------------------");

            System.out.print("Make your choice: ");
            // try catch som skriver ut om det blir fel och stänger av programmet
            try{
                int val = scanner.nextInt();
                //Gör så att man kan välja produkter i konsollen och minskar lagret med 1 vid varje val
                if (val == 1) {

                    if (vara1.getLager() > 0) {
                        kund.buyproduct(vara1.getPrice());
                        vara1.NewLager(vara1.getLager() - 1);
                    } else {
                        System.out.println("<< Out of stock >>");
                    }
                } else if (val == 2) {
                    if (vara2.getLager() > 0) {
                        kund.buyproduct(vara2.getPrice());
                        vara2.NewLager(vara2.getLager() - 1);
                    } else {
                        System.out.println("<< Out of stock >>");
                    }
                } else if (val == 3) {
                    if (rabatt.getLager() > 0) {
                        kund.buyproduct(rabatt.getPrice());
                        rabatt.NewLager(rabatt.getLager() - 1);
                    } else {
                        System.out.println("<< Out of stock >>");
                    }
                } else if (val == 4) {
                    break;
                    //Skriver ut om väljaren skriver ogiltlig siffra
                } else {
                    System.out.println("---->Invalid answer.<----");
                }
            } catch (Exception e){
                System.out.println("Something went wrong! Please try again.");
                break;
            }
        }
        // när programmet avslutas skriver den ut antal produkter och total summan.
        System.out.println("Total products bought: " + kund.getTotalProducts());
        System.out.println("Total cost: " + kund.gettotalSum() + " kr");
    }
}