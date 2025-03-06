public class Logaritmo implements Operacion {
    private double numero;

    public Logaritmo(double numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número debe ser positivo.");
        }
        this.numero = numero;
    }

    @Override
    public double calcular() {
        return Math.log(numero);
    }
}