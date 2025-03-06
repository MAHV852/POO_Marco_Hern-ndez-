public class Division implements Operacion {
    private int dividendo, divisor;

    public Division(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    public double calcular() {
        int resultado = 0;
        int acumulador = Math.abs(dividendo);
        int divisorAbs = Math.abs(divisor);

        while (acumulador >= divisorAbs) {
            acumulador -= divisorAbs;
            resultado++;
        }

        return ((dividendo < 0) ^ (divisor < 0)) ? -resultado : resultado;
    }
}