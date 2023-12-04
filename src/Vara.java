class Vara {
    //Variablerna som ger produkterna egenskaperna
    private String product;
    private double price;
    private int lager;

    public Vara(String product, double price, int lager) {
        this.product = product;
        this.price = price;
        this.lager = lager;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getLager() {
        return lager;
    }
    // Uppdaterar lagret vid användning
    public void NewLager(int newLager) {
        lager = newLager;
    }
}