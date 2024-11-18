package sistemaReservas;

public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        // Aplicar una promoción, por ejemplo, un 15% de descuento
        double precioConPromocion = calcularPrecio() * 0.85;
        System.out.println("Precio con promoción: " + precioConPromocion);
    }
}
