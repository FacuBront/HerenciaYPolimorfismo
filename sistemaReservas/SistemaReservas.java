package sistemaReservas;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vueloRegular = new VueloRegular(1, "Madrid", "Barcelona", "2023-10-01", 150);
        VueloCharter vueloCharter = new VueloCharter(2, "Paris", "Londres", "2023-10-02", 5000);

        reservas.agregarVuelo(vueloRegular);
        reservas.agregarVuelo(vueloCharter);

        System.out.println("Total de reservas: " + reservas.calcularTotalReservas());
        reservas.aplicarPromociones();
        reservas.mostrarInformacionVuelos();
    }
}
