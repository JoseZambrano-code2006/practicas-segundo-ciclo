
import controlador.IVentaDao;
import controladorImpl.VentaImpl;
import java.util.List;
import model.Cliente;
import model.Ventas;


public class VentaMain {

 
    
    public static void main(String[] args) {
        VentaMain test = new VentaMain();
        test.insert();
         test.findById();
        // test.listAll();
        // test.listByCliente();
        // test.calculateTotal();
    }

    // Método para probar la inserción de una nueva venta
    public void insert() {
        Ventas venta = new Ventas();
        Cliente cliente = new Cliente();

        cliente.setIdCliente(1); // ID de un cliente existente en la base de datos
        venta.setClienteID(cliente);
        venta.setFecha("2024/12/20"); // Fecha en formato válido (yyyy-MM-dd)
        venta.setTotal(50.0); // Total de la venta

        IVentaDao ventaDao = new VentaImpl();
        boolean result = ventaDao.insert(venta);

        if (result) {
            System.out.println("Venta insertada exitosamente.");
        } else {
            System.out.println("Error al insertar la venta.");
        }
    }

    // Método para buscar una venta por su ID
    public void findById() {
        int idVenta = 1; // ID de la venta a buscar

        IVentaDao ventaDao = new VentaImpl();
        Ventas venta = ventaDao.findById(idVenta);

        if (venta != null) {
            System.out.println("ID Venta: " + venta.getIdventa());
            System.out.println("Fecha: " + venta.getFecha());
            System.out.println("Total: " + venta.getTotal());
            System.out.println("Cliente: " + venta.getClienteID().getNombre() + " " + venta.getClienteID().getApellidos());
        } else {
            System.out.println("No se encontró la venta con ID: " + idVenta);
        }
    }

    // Método para listar todas las ventas realizadas
    public void listAll() {
        IVentaDao ventaDao = new VentaImpl();
        List<Ventas> ventas = ventaDao.listAll();

        if (ventas != null && !ventas.isEmpty()) {
            for (Ventas venta : ventas) {
                System.out.println("ID Venta: " + venta.getIdventa());
                System.out.println("Fecha: " + venta.getFecha());
                System.out.println("Total: " + venta.getTotal());
                System.out.println("Cliente: " + venta.getClienteID().getNombre() + " " + venta.getClienteID().getApellidos());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("No hay ventas registradas.");
        }
    }

    // Método para listar las ventas realizadas por un cliente específico
    public void listByCliente() {
        int idCliente = 1; // ID del cliente

        IVentaDao ventaDao = new VentaImpl();
        List<Ventas> ventas = ventaDao.listByCliente(idCliente);

        if (ventas != null && !ventas.isEmpty()) {
            for (Ventas venta : ventas) {
                System.out.println("ID Venta: " + venta.getIdventa());
                System.out.println("Fecha: " + venta.getFecha());
                System.out.println("Total: " + venta.getTotal());
                System.out.println("Cliente: " + venta.getClienteID().getNombre() + " " + venta.getClienteID().getApellidos());
                System.out.println("-----------------------------------");
            }
        } else {
            System.out.println("No se encontraron ventas para el cliente con ID: " + idCliente);
        }
    }

    // Método para calcular el total de una venta
    public void calculateTotal() {
        int idVenta = 1; // ID de la venta

        IVentaDao ventaDao = new VentaImpl();
        double total = ventaDao.calculateTotal(idVenta);

        if (total > 0) {
            System.out.println("El total de la venta con ID " + idVenta + " es: " + total);
        } else {
            System.out.println("No se encontró la venta o no tiene detalles asociados.");
        }
    }
}
