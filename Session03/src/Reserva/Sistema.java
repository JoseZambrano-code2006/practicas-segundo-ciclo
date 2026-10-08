
package Reserva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void hacerReserva(int idReserva, Date fecha, Cliente cliente) {
        Reserva reserva = new Reserva(idReserva, fecha, cliente);
        reservas.add(reserva);
    }

    public void cancelarReserva(int idReserva) {
        reservas.removeIf(reserva -> reserva.getId() == idReserva);
    }

    public List<Reserva> verReservas() {
        return reservas;
    }
}
