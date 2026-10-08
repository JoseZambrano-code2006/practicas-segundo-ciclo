
import controlador.IDetalleVentaDao;
import controladorImpl.DetalleVentaImpl;
import java.util.List;
import model.DetalleVenta;
import model.Producto;

public class DetalleVentaMain {

    public static void main(String[] args) {

        DetalleVentaMain test = new DetalleVentaMain();
        test.insert();
        //test.update();
        //test.delete();
        //test.findById();
        //test.listByVentaId();
    }

    // Método para insertar un nuevo detalle de venta
    public void insert() {
        DetalleVenta detalle = new DetalleVenta();
        Producto producto = new Producto();
        producto.setIdBebida(1); // ID de un producto existente en la base de datos
        detalle.setProducto(producto);
        detalle.setCantidad(5);
        detalle.setSubtotal(producto.getPrecio() * detalle.getCantidad()); // Subtotal calculado

        IDetalleVentaDao detalleDao = new DetalleVentaImpl();
        boolean result = detalleDao.insert(detalle);

        if (result) {
            System.out.println("Detalle de venta insertado exitosamente.");
        } else {
            System.out.println("Error al insertar el detalle de venta.");
        }
    }

    // Método para actualizar un detalle de venta
    public void update() {
        DetalleVenta detalle = new DetalleVenta();
        Producto producto = new Producto();
        producto.setIdBebida(2); // ID de un producto existente en la base de datos
        detalle.setIdDetalleVenta(1); // ID de un detalle existente
        detalle.setProducto(producto);
        detalle.setCantidad(10);
        detalle.setSubtotal(producto.getPrecio() * detalle.getCantidad()); // Subtotal calculado

        IDetalleVentaDao detalleDao = new DetalleVentaImpl();
        boolean result = detalleDao.update(detalle);

        if (result) {
            System.out.println("Detalle de venta actualizado exitosamente.");
        } else {
            System.out.println("Error al actualizar el detalle de venta.");
        }
    }

    // Método para eliminar un detalle de venta
    public void delete() {
        int idDetalleVenta = 1; // ID del detalle a eliminar

        IDetalleVentaDao detalleDao = new DetalleVentaImpl();
        boolean result = detalleDao.delete(idDetalleVenta);

        if (result) {
            System.out.println("Detalle de venta eliminado exitosamente.");
        } else {
            System.out.println("Error al eliminar el detalle de venta.");
        }
    }

    // Método para buscar un detalle de venta por su ID
    public void findById() {
        int idDetalleVenta = 1; // ID del detalle a buscar

        IDetalleVentaDao detalleDao = new DetalleVentaImpl();
        DetalleVenta detalle = detalleDao.findById(idDetalleVenta);

        if (detalle != null) {
            System.out.println("ID Detalle Venta: " + detalle.getIdDetalleVenta());
            System.out.println("ID Producto: " + detalle.getProducto().getIdBebida());
            System.out.println("Cantidad: " + detalle.getCantidad());
            System.out.println("Subtotal: " + detalle.getSubtotal());
        } else {
            System.out.println("No se encontró el detalle de venta con ID: " + idDetalleVenta);
        }
    }

    // Método para listar los detalles de una venta específica
    public void listByVentaId() {
        int idVenta = 1; // ID de la venta

        IDetalleVentaDao detalleDao = new DetalleVentaImpl();
        List<DetalleVenta> detalles = detalleDao.listByVentaId(idVenta);

        if (detalles != null && !detalles.isEmpty()) {
            for (DetalleVenta detalle : detalles) {
                System.out.println("ID Detalle Venta: " + detalle.getIdDetalleVenta());
                System.out.println("ID Producto: " + detalle.getProducto().getIdBebida());
                System.out.println("Cantidad: " + detalle.getCantidad());
                System.out.println("Subtotal: " + detalle.getSubtotal());
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("No se encontraron detalles para la venta con ID: " + idVenta);
        }
    }

}
