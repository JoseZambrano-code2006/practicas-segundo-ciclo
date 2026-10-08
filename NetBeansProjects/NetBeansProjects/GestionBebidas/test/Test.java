import controlador.IProductoDao;
import controladorImpl.ProductoImpl;
import utils.ConexionSingleton;
import java.sql.*;
import java.util.List;
import model.Producto;

public class Test {

    public static void main(String[] args) {

        Test t = new Test();
        //t.testConexion();
        //t.ListAllProductos();
        //t.InsertProducto();
        //t.deleteProducto();
        //t.searchById();
        //t.updateProducto();
    }

    //metodo para testear la conexion a la bd
    public void testConexion() {
        ConexionSingleton c = new ConexionSingleton();
        try {
            Connection connection = c.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexion satisfatoria");
            } else {
                System.out.println("No se puede establecer conexion");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion" + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para probar la lista de productos
    public void ListAllProductos() {
        IProductoDao productoDao = new ProductoImpl();
        List<Producto> listaProductos = productoDao.listAll();
        if (listaProductos != null && !listaProductos.isEmpty()) {
            for (Producto producto : listaProductos) {
                System.out.println("ID Producto: " + producto.getIdBebida());
                System.out.println("Código: " + producto.getCodigo());
                System.out.println("Categoría: " + producto.getCategoria());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Tipo: " + producto.getTipo());
                System.out.println("Tamaño: " + producto.getTamaño());
                System.out.println("Cantidad Disponible: " + producto.getCantidadDisponible());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Estado: " + producto.getEstado());
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("No hay productos registrados.");
        }
    }

    // Método para probar la inserción de un producto
    public void InsertProducto() {
        Producto producto = new Producto();

        producto.setCodigo("P002");
        producto.setCategoria("Bagua");
        producto.setMarca("san luis");
        producto.setTipo("sin gas");
        producto.setTamaño("450ml");
        producto.setCantidadDisponible(12);
        producto.setPrecio(2);
        producto.setEstado("Disponible");

        IProductoDao productoDao = new ProductoImpl();
        boolean result = productoDao.insert(producto);

        if (result) {
            System.out.println("Producto insertado exitosamente.");
        } else {
            System.out.println("Error al insertar el producto.");
        }
    }

/*    public void deleteProducto() {
        Producto producto = new Producto();
        producto.setIdBebida(1); // ID del producto a eliminar

        IProductoDao productoDao = new ProductoImpl();
        boolean result = productoDao.delete(Producto);

        if (result) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Error al eliminar el producto.");
        }
*/
    

    public void searchById() {
        IProductoDao productoDao = new ProductoImpl();
        Producto producto = productoDao.findById(8); // Cambia el ID según lo necesites

        if (producto != null) {
            System.out.println("ID Producto: " + producto.getIdBebida());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Tamaño: " + producto.getTamaño());
            System.out.println("Cantidad Disponible: " + producto.getCantidadDisponible());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Estado: " + producto.getEstado());
        } else {
            System.out.println("No se encontró el producto con ese ID.");
        }
    }

    public void updateProducto() {

        Producto producto = new Producto();
        producto.setIdBebida(1); // ID del producto a actualizar
        producto.setCodigo("P002");
        producto.setCategoria("Bebida");
        producto.setMarca("Pepsi");
        producto.setTipo("Gaseosa");
        producto.setTamaño("1L");
        producto.setCantidadDisponible(50);
        producto.setPrecio(2.0);
        producto.setEstado("Disponible");

        IProductoDao productoDao = new ProductoImpl();
        boolean result = productoDao.update(producto);

        if (result) {
            System.out.println("Producto actualizado correctamente.");
        } else {
            System.out.println("Error al actualizar el producto.");
        }
    }

}
