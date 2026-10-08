
package TiendaEnLinea;


public class MAIN {

    public static void main(String[] args) {
   // Crea un objeto de tipo Electronica con ID 1, nombre "Poco F5 Pro", precio 2100 y garantía de 2 años
    Producto electronico = new Electronica(1, "PS 5", 3000, 2); 

    // Crea un objeto de tipo Ropa con ID 2, nombre "Camisa", precio 25 y marca "H&M"
    Producto ropa = new Ropa(3, "Camisa", 25 , "M"); 

    // Crea un objeto de tipo Pedido con un ID (1201504298) y el nombre del cliente "User"
    Pedido pedido = new Pedido(111111111, "User"); 

    // Agrega el producto electrónico al pedido
    pedido.agregarProducto(electronico); 

    // Agrega el producto de ropa al pedido
    pedido.agregarProducto(ropa); 

    // Crea un objeto de tipo PedCRUD usando la implementación PedCRUDImp para gestionar los pedidos
    PedCRUD pedidoCRUD = new PedCRUDImp(); 

    // Crea el pedido en el sistema usando el CRUD
    pedidoCRUD.crearPedido(pedido); 

    // Muestra por consola la información del pedido, incluidos los productos agregados
    pedido.mostrarPedido(); 
    } 

} 
    
    

