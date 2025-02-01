import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();

    // Método para agregar un producto
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Producto agregado: " + product.getName());
    }

    // Método para mostrar todos los productos
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

    // Método para encontrar un producto por su nombre
    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
