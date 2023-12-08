
//Skapar en kund som värdena kan sparas i för att spara antal produkter och total summan
public class Kund {
    private int totalProducts;
    private double totalSum; //!!! ändrat till double
    // sätter kundens varukorg till noll för att kunnas adderas med produkter sedan.
    public Kund() {
        this.totalProducts = 0;
        this.totalSum = 0;
    }

    public int getTotalProducts() {
        return totalProducts;
    }
    //totalSum är satt till float för att inte skapa för många decimaltal
    public double gettotalSum() { //!!! ändrat till double
        return (totalSum);
    }
    // Adderar pris och antal varor
    //!!! ändrat sätt att få ut infon
    public void buyProduct(Product product) {
        this.totalProducts++;
        this.totalSum += product.getPrice();
    }
}