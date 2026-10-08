/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewexam;

/**
 *
 * @author tpp
 */
public class PedidoAnidado extends Pedido{

    public PedidoAnidado(int id, String cliente, String estado) {
        super(id, cliente, estado);
    }
    

    @Override
    public void viewDetailPedido() {
        System.out.println("Detalle del pedido");
        System.out.println("ID:" + getId());
        System.out.println("Cliente:" + getCliente());
        System.out.println("Estado: " + getEstado());
        System.out.println("Productos");
        for (Producto p : getProductos()) {
            p.viewDetails();
            System.out.println();
        }
        
       
    }
    
}
