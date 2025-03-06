public class Raiz implements Operacion {
    private double numero;

    public Raiz(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        return Math.sqrt(numero);
    }
}
