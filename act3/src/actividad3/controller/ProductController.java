import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();

    
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Producto agregado: " + product.getName());
    }


    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("\n=== Catálogo de Productos ===");
        for (Product product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
