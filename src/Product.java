class Product {
    //Variablerna som ger produkterna egenskaperna
    private String product;
    private double price;
    private int stock;

    public Product (String product, double price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    // Uppdaterar lagret vid användning
    public void newStock(int newStock) {
        stock = newStock;
    }
    @Override //!!! nytt sätt att få ut informationen
    public String toString() {
        return product + price + " kr " + "in stock: " + stock;
    }


}