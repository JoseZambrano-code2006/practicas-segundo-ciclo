
package TiendaEnLinea;

public interface PedCRUD { 
    void crearPedido(Pedido pedido); 
    Pedido leerPedido(int id); 
    void actualizarPedido(int id, Pedido pedido); 
    void eliminarPedido(int id); 
} 

