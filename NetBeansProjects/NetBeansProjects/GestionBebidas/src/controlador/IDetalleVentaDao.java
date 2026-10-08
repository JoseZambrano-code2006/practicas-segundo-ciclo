
package controlador;

import java.util.List;
import model.DetalleVenta;


public interface IDetalleVentaDao {
    
    
    
    //Inserta un nuevo detalle de venta en la base de datos.
    public boolean insert(DetalleVenta d);

    // Actualiza un detalle de venta existente.
    public boolean update(DetalleVenta d);

    // Elimina un detalle de venta de la base de datos.    
    public boolean delete(int idDetalleVenta);

    //Busca un detalle de venta por su ID único.
    public DetalleVenta findById(int idDetalleVenta);

    // Lista todos los detalles de una venta específica.
    public List<DetalleVenta> listByVentaId(int idVenta);
    
    //Lista todos los detalles ventas registrados en la base de datos.
    public List<DetalleVenta> listAll();
    
    
}
