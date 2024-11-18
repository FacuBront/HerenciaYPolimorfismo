package sistemaReservas;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private static final double PRECIO_BASE_POR_ASIENTO = 100.0; // Precio base por asiento

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE_POR_ASIENTO * numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {
        // Aplicar una promoción, por ejemplo, un 10% de descuento
        double precioConPromocion = calcularPrecio() * 0.9;
        System.out.println("Precio con promoción: " + precioConPromocion);
    }
}
