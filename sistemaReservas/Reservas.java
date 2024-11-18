package sistemaReservas;

import java.util.ArrayList;
import java.util.List;

public class Reservas {
    private List<Vuelo> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarInformacionVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Vuelo " + vuelo.numeroVuelo + ": " + vuelo.origen + " -> " + vuelo.destino + " en " + vuelo.fecha);
        }
    }
}
