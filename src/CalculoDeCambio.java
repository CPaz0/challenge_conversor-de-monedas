public class CalculoDeCambio {
    private double cambioTotal;

    public double getCambioTotal() {
        return cambioTotal;
    }

    public void cambio(Double conversion_rate, Double monto){
        this.cambioTotal = conversion_rate*monto;
    }
}
