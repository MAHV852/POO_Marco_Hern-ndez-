public class Multiplicacion implements Operacion {
    private int a, b;

    public Multiplicacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcular() {
        int resultado = 0;
        int absB = Math.abs(b);
        for (int i = 0; i < absB; i++) {
            resultado += a;
        }
        return (b < 0) ? -resultado : resultado;
    }
}