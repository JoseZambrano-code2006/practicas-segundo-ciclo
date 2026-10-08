
package controller;

import java.util.List;
import model.pago;

public interface IPagoDao {
    
    // Método para procesar un nuevo pago
    public boolean registrarPago(pago p);
    
    // Método para calcular el vuelto que se le debe dar al cliente
    public double calcularVuelto(double montoRecibido, double totalVenta);

    // Método para obtener detalles de un pago específico por su ID
    public pago obtenerPagoPorID(int idPago);
    
    // Método opcional para listar todos los pagos (puede ser útil para reportes)
    public List<pago> listarPagos();
    
    
}
