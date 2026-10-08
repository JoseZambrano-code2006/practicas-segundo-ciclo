/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewexam;

public class PedidoMain {

    public static void main(String[] args) {
        
        Interface pedido = new PedidoCrudImpl();
        
        //crear pedidos
   Pedido pedido1 = new PedidoAnidado(1, "Matthew", "Pendiente");
   Pedido pedido2 = new PedidoAnidado(2, "Johan", "Enviado");
        
   //crear productos
   
  Producto p1 = new ProductoRopa("M", "Blue", 1, "Camisa", 120);   
  Producto p2 = new ProductoElectronico("Samsumg", 3, 2, "Tv", 1600);
  
  //añadiendo el producto al pedido
  pedido1.addProductos(p1);
  pedido1.addProductos(p2);
  
  pedido2.addProductos(p1);
  
  //creando el pedido
  pedido.create(pedido1);
  pedido.create(pedido2);
  
  
  //leer y mostrar
  Pedido p3 = (Pedido) pedido.read(1);
  
  if(p3 !=null){
      p3.viewDetailPedido();
  }else{
      System.out.println("Pedido no encontrado");
  }
  
  //actualizar
  
    pedido1 = new PedidoAnidado(1, "Matthew Guzman", "Pendiente");
    pedido1.addProductos(p1);
    pedido.update(pedido1);
    
    
    Pedido p4 = (Pedido) pedido.read(1);
  
  if(p4 !=null){
      p4.viewDetailPedido();
  }else{
      System.out.println("Pedido no encontrado");
  }
    
    
    //eliminar
    pedido.delete(2);
    
    Pedido pEliminado = (Pedido) pedido.read(2);
    if(pEliminado == null){
        System.out.println("pedido no encontrado");
    }
    
   
    
    }
    
}
