public class Potencia implements Operacion {
    private int base, exponente;

    public Potencia(int base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    @Override
    public double calcular() {
        if (exponente == 0) return 1;
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }
        return (exponente < 0) ? 1.0 / resultado : resultado;
    }
}
