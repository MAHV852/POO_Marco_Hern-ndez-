
public class Product {
    private String name;
    private double price;
    private int stock;

  
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

   
    public void showDetails() {
        System.out.println("Producto: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Stock: " + stock);
    }

  
    public static Product comparePrices(Product p1, Product p2) {
        return (p1.getPrice() > p2.getPrice()) ? p1 : p2;
    }
}
