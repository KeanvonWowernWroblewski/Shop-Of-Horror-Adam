//Rabatt som ärver från Vara klassen för att slippa skriva om koden.
class Rabatt extends Product {
    private double Rabatt;
    //Lägger till rabatt så man kan lägga in rabatten i huvudkoden.
    public Rabatt(String namn, double price, double rabatt, int stock) {
        super(namn, price, stock);
        this.Rabatt = rabatt;
    }
    // Gör så att priset man har gett den produkten räknas om och returneras
    @Override
    public double getPrice() {
        return super.getPrice() * (1 - Rabatt);
    }
}

//!!! har inte ändrat något förutom variabelnamn