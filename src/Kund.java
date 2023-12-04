
//Skapar en kund som värdena kan sparas i för att spara antal produkter och total summan
public class Kund {
    private int totalProducts;
    private float totalSum;
    // sätter kundens varukorg till noll för att kunnas adderas med produkter sedan.
    public Kund() {
        this.totalProducts = 0;
        this.totalSum = 0;
    }

    public int getTotalProducts() {
        return totalProducts;
    }
    //totalSum är satt till float för att inte skapa för många decimaltal
    public float gettotalSum() {
        return (totalSum);
    }
    // Adderar pris och antal varor
    public void buyproduct(double pris) {
        this.totalProducts++;
        this.totalSum += pris;
    }
}