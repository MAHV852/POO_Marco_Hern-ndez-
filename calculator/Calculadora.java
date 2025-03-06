import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Multiplicación");
            System.out.println("2. División");
            System.out.println("3. Potencia");
            System.out.println("4. Raíz Cuadrada");
            System.out.println("5. Logaritmo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese el número: ");
                double num1 = scanner.nextDouble();
                double num2 = 0;

                if (opcion <= 3) {
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                }

                Operacion operacion;
                switch (opcion) {
                    case 1:
                        operacion = new Multiplicacion((int) num1, (int) num2);
                        break;
                    case 2:
                        operacion = new Division((int) num1, (int) num2);
                        break;
                    case 3:
                        operacion = new Potencia((int) num1, (int) num2);
                        break;
                    case 4:
                        operacion = new Raiz(num1);
                        break;
                    case 5:
                        operacion = new Logaritmo(num1);
                        break;
                    default:
                        operacion = null;
                        break;
                }

                if (operacion != null) {
                    System.out.println("Resultado: " + operacion.calcular());
                }
            } else if (opcion == 6) {
                System.out.println("Gracias, hasta pronto.");
            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}