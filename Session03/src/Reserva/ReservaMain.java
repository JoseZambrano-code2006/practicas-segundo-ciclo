package Reserva;

import java.util.Date;

public class ReservaMain {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Crear clientes
        Cliente cl1 = new Cliente(1, "Juan Perez");
        Cliente cl2 = new Cliente(2, "Maria Lopez");

        // Registrar clientes
        sistema.registrarCliente(cl1);
        sistema.registrarCliente(cl2);

        // Hacer reservas
        sistema.hacerReserva(1, new Date(), cl1);
        sistema.hacerReserva(2, new Date(), cl2);

        // Ver reservas
        for (Reserva reserva : sistema.verReservas()) {
            System.out.println("Reserva ID: " + reserva.getId() + "\nCliente: " + reserva.getCliente().getNombre() + "\nFecha: " + reserva.getFecha());
        }

        // Cancelar una reserva
        sistema.cancelarReserva(1);

        // Ver reservas después de cancelar una
        System.out.println("----Reservas despues de cancelar una:----");
        for (Reserva reserva : sistema.verReservas()) {
            System.out.println("Reserva ID: " + reserva.getId() + "\nCliente: " + reserva.getCliente().getNombre() + "\nFecha: " + reserva.getFecha());
        }
    }
}
