
package tiendaEnLinea;

import java.util.HashMap; 
import java.util.Map; 

public class PedCRUDImp implements PedCRUD { 
    private Map<Integer, Pedido> pedidos; 
    
    public PedCRUDImp() { 
        pedidos = new HashMap<>(); 
    } 
    
    @Override 
    public void crearPedido(Pedido pedido) { 
        pedidos.put(pedido.getId(), pedido); 
        System.out.println("Pedido creado con ID:" + pedido.getId());
    } 
    
    @Override 
    public Pedido leerPedido(int id) { 

