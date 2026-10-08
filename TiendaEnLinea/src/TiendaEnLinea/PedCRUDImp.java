package TiendaEnLinea;

import java.util.HashMap; 
import java.util.Map; 

// La clase PedCRUDImp implementa la interfaz PedCRUD
public class PedCRUDImp implements PedCRUD { 

    // Declara un mapa que asocia IDs (enteros) con objetos Pedido
    private Map<Integer, Pedido> pedidos; 

    // Constructor de la clase, inicializa el mapa de pedidos como un HashMap
    public PedCRUDImp() { 
        pedidos = new HashMap<>(); 
    } 

    // Sobrescribe el método crearPedido de la interfaz PedCRUD
    @Override 
    public void crearPedido(Pedido pedido) { 
        
        // Agrega el pedido al mapa usando el ID del pedido como clave
        pedidos.put(pedido.getId(), pedido); 
        
        // Imprime un mensaje indicando que el pedido ha sido creado
        System.out.println("Pedido creado con ID:" + pedido.getId());
    } 

    // Sobrescribe el método leerPedido de la interfaz PedCRUD
    @Override 
    public Pedido leerPedido(int id) { 
        
        // Retorna el pedido asociado al ID dado desde el mapa
        return pedidos.get(id); 
    } 

    // Sobrescribe el método actualizarPedido de la interfaz PedCRUD
    @Override 
    public void actualizarPedido(int id, Pedido pedido) { 
        
        // Verifica si el pedido con el ID dado existe en el mapa
        if (pedidos.containsKey(id)) { 
            
            // Si el pedido existe, lo actualiza con los nuevos datos
            pedidos.put(id, pedido); 
            
            // Imprime un mensaje indicando que el pedido ha sido actualizado
            System.out.println("Pedido actualizado con ID:" + id); 
        } else { 
            
            // Si el pedido no existe, imprime un mensaje de error
            System.out.println("Pedido no encontrado con ID:" + id); 
        }
    } 

    // Sobrescribe el método eliminarPedido de la interfaz PedCRUD
    @Override 
    
    public void eliminarPedido(int id) { 
        // Verifica si el pedido con el ID dado existe en el mapa
        if (pedidos.containsKey(id)) { 
            
            // Si el pedido existe, lo elimina del mapa
            pedidos.remove(id); 
            
            // Imprime un mensaje indicando que el pedido ha sido eliminado
            System.out.println("Pedido eliminado con ID: " + id); 
            
        } else { 
            // Si el pedido no existe, imprime un mensaje de error
            System.out.println("Pedido no encontrado con ID:" + id); 

        } 

    } 

} 
