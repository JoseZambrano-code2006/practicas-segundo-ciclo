
package tiendabebidas;

import java.util.ArrayList;
import java.util.List;


public class Entrega {
    
    private int venta; 
    private String cliente; 
    private List<ProductoBebida> productos; 
    private String estado; 
    
// Constructor de la clase Entrega, inicializa el ID y el cliente
public Entrega(int venta, String   cliente) { 
    
    // Asigna el ID pasado por parámetro al campo de la clase
    this.venta = venta; 
    
    // Asigna el nombre del cliente pasado por parámetro al campo de la clase
    this.cliente = cliente; 
    
    // Inicializa la lista de productos como una nueva ArrayList
    this.productos = new ArrayList<>(); 
    
    // Establece el estado inicial del entregascomo "pendiente"
    this.estado = "entregado"; 
} 

// Método para agregar un producto a la lista de productos del pedido
public void agregarProducto(ProductoBebida producto) { 
    
    // Añade el producto a la lista de productos
    productos.add(producto); 
} 

// Método para eliminar un producto de la lista de productos del pedido
public void eliminarProducto(ProductoBebida producto) { 
    
    // Elimina el producto de la lista de productos
    productos.remove(producto); 
} 

// Método getter para obtener el ID del pedido
public int getId() { 
    return venta; 
} 

// Método getter para obtener el nombre del cliente
public String getCliente() { 
    return cliente; 
} 

// Método getter para obtener el estado del pedido
public String getEstado() { 
    return estado; 
} 

// Método getter para obtener la lista de productos del pedido
public List<ProductoBebida> getProductos() { 
    return productos; 
} 

// Método setter para asignar un nuevo ID al pedido
public void setId(int id) { 
    this.venta = venta; 
} 

// Método setter para asignar un nuevo nombre de cliente al pedido
public void setCliente(String cliente) { 
    this.cliente = cliente; 
} 

// Método setter para asignar un nuevo estado al pedido
public void setEstado(String estado) { 
    this.estado = estado; 
} 

// Método para mostrar la información del pedido por consola
public void mostrarEntrega() { 
    
    System.out.println("VENTA:" + venta); 
    
    // Imprime el nombre del cliente
    System.out.println("Entregado a:" + cliente); 
    
    // Imprime el estado del pedido
    System.out.println("Estado:" + estado); 
    
    // Imprime la lista de productos del pedido
    System.out.println("Producto: ");
    
    // Recorre la lista de productos e imprime la descripción y el precio de cada producto
    for (ProductoBebida pro : productos) { 
        System.out.println(pro.descripcion() + " / Precio: S/." + pro.getPrecio()); 
        } 

    }     


}
