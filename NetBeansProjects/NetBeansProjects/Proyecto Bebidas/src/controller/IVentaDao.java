
package controller;

import java.util.List;
import model.venta;

public interface IVentaDao {
    
     
    // Método para registrar una nueva venta completa en el sistema
    public boolean registrarVenta(venta venta);

    // Método para obtener una venta específica por su ID (incluyendo los detalles de bebidas)
    public venta obtenerVentaPorID(int idVenta);

    // Método para listar todas las ventas realizadas (opcionalmente con detalles)
    public List<venta> listarVentas();
    
    // Método para calcular la ganancia total de todas las ventas
    public double obtenerGananciaTotal();
    
    // Método para listar ventas realizadas en una fecha específica (opcional)
    public List<venta> listarVentasPorFecha(String fecha);

    // Método para actualizar el inventario según las ventas (opcional)
    public boolean actualizarInventario(venta venta);
    
}
