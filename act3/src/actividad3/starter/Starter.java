import java.util.Scanner;

public class Starter {
    public static void startApp() {
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();

        while (true) {
            try {
                System.out.println("\n=== MENÚ DE TIENDA ===");
                System.out.println("1. Agregar producto");
                System.out.println("2. Ver catálogo");
                System.out.println("3. Comparar precios");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");

                int option = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (option) {
                    case 1:
                        System.out.print("Nombre del producto: ");
                        String name = scanner.nextLine();

                        System.out.print("Precio del producto: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar buffer

                        System.out.print("Stock disponible: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        controller.addProduct(new Product(name, price, stock));
                        break;

                    case 2:
                        controller.showProducts();
                        break;

                    case 3:
                        System.out.print("Nombre del primer producto: ");
                        String name1 = scanner.nextLine();
                        System.out.print("Nombre del segundo producto: ");
                        String name2 = scanner.nextLine();
                        Product p1 = controller.findProductByName(name1);
                        Product p2 = controller.findProductByName(name2);
                        if (p1 != null && p2 != null) {
                            Product expensive = Product.comparePrices(p1, p2);
                            System.out.println("El producto más caro es: " + expensive.getName());
                        } else {
                            System.out.println("Uno o ambos productos no existen.");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Limpiar buffer
            }
        }
    }
}
