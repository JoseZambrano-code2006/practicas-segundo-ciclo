
import Utils.ConexionSingleton;
import controller.IReservaDao;
import controllerImpl.ReservaDaoImpl;
import java.sql.*;
import java.util.List;
import model.Cliente;
import model.Reserva;
import model.Usuario;

public class Test {

    public static void main(String[] args) {

        Test t = new Test();
         t.testConexion();
        t.lisReservas();
        
        t.insert();
        t.delete();
    }

    //metodo para testear la conexion a la bd
    public void testConexion() {

        ConexionSingleton c = new ConexionSingleton();

        try {
            Connection connection = c.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexion satisfactoria");
            } else {
                System.err.println("No se puede establecer conexion");
            }
        } catch (Exception e) {

            System.err.println("error de conexion" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public void lisReservas() {

        IReservaDao reservaDao = new ReservaDaoImpl();
        List<Reserva> listaReserva = reservaDao.listAll();
        if (listaReserva != null && !listaReserva.isEmpty()) {
            for (Reserva reserva : listaReserva) {

                System.out.println("idReserva" + reserva.getIdReserva());
                System.out.println("fechaIngreso" + reserva.getFechaIgreso());
                System.out.println("fechaSalida" + reserva.getFechaSalida());
                System.out.println("numeroPiso" + reserva.getNumeroPiso());
                System.out.println("numeroHabitacion" + reserva.getNumeroHabitacion());
                System.out.println("costo" + reserva.getCosto());
                System.out.println("estado" + reserva.getEstado());
                System.out.println("cliente_id" + reserva.getCliente().getNombre());
                System.out.println("usuario_id" + reserva.getUsuario().getUser());

            }

        }

    }

    //insertar
    public void insert() {
        Cliente c = new Cliente();
        Usuario u = new Usuario();
        Reserva r = new Reserva();

        r.setFechaIgreso("10/10/2024");
        r.setFechaSalida("12/10/2024");
        r.setNumeroPiso("2");
        r.setNumeroHabitacion(202);
        r.setCosto(80.00);
        r.setEstado("R");
        c.setIdCliente(1);
        u.setIdUsuario(1);
        r.setCliente(c);
        r.setUsuario(u);

        IReservaDao reservaDao = new ReservaDaoImpl();
        boolean result = reservaDao.insert(r);

        if (result) {
            System.out.println("success!!");

        } else {
            System.out.println("error");
        }

    }

    public void delete() {
        Reserva r = new Reserva();
        r.setIdReserva(3);
        IReservaDao reservaDao = new ReservaDaoImpl();
        boolean result = reservaDao.delete(r);

        if (result) {
            System.err.println("success delete!!");
        } else {
            System.err.println("error");
        }

    }

    public void SearchById() {

        IReservaDao reservaDao = new ReservaDaoImpl();
        Reserva r = reservaDao.searchByid(1);

        if (r != null) {
            System.out.println("idReserva" + r.getIdReserva());
            System.out.println("fechaIngreso" + r.getFechaIgreso());
            System.out.println("fechaSalida" + r.getFechaSalida());
            System.out.println("numeroPiso" + r.getNumeroPiso());
            System.out.println("numeroHabitacion" + r.getNumeroHabitacion());
            System.out.println("costo" + r.getCosto());
            System.out.println("estado" + r.getEstado());
            System.out.println("Cliente_id" + r.getCliente().getNombre());
        } else {
            System.out.println("No existe ese Id");
        }
    }

    public void update() {
        Cliente c = new Cliente();
        Usuario u = new Usuario();
        Reserva r = new Reserva();

      r.setFechaIgreso("10/10/2024");
      r.setFechaSalida("12/10/2024");
      r.setNumeroPiso("2");
      r.setNumeroHabitacion(202);
      r.setCosto(80.00);
        r.setEstado("R");
        c.setIdCliente(1);
        u.setIdUsuario(1);
        r.setCliente(c);
        r.setUsuario(u);
        r.setIdReserva(4);

        IReservaDao reservaDao = new ReservaDaoImpl();
        boolean result = reservaDao.insert(r);

        if (result) {
            System.out.println("success!!");

        } else {
            System.out.println("error");
        }

    }
}
