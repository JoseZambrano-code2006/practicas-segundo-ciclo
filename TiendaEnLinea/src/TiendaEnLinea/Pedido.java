package TiendaEnLinea;
import java.util.ArrayList; 
import java.util.List; 

public class Pedido { 
    private int id; 
    private String cliente; 
    private List<Producto> productos; 
    private String estado; 
    
// Constructor de la clase Pedido, inicializa el ID y el cliente
public Pedido(int id, String cliente) { 
    
    // Asigna el ID pasado por parámetro al campo de la clase
    this.id = id; 
    
    // Asigna el nombre del cliente pasado por parámetro al campo de la clase
    this.cliente = cliente; 
    
    // Inicializa la lista de productos como una nueva ArrayList
    this.productos = new ArrayList<>(); 
    
    // Establece el estado inicial del pedido como "pendiente"
    this.estado = "pendiente"; 
} 

// Método para agregar un producto a la lista de productos del pedido
public void agregarProducto(Producto producto) { 
    
    // Añade el producto a la lista de productos
    productos.add(producto); 
} 

// Método para eliminar un producto de la lista de productos del pedido
public void eliminarProducto(Producto producto) { 
    
    // Elimina el producto de la lista de productos
    productos.remove(producto); 
} 

// Método getter para obtener el ID del pedido
public int getId() { 
    return id; 
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
public List<Producto> getProductos() { 
    return productos; 
} 

// Método setter para asignar un nuevo ID al pedido
public void setId(int id) { 
    this.id = id; 
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
public void mostrarPedido() { 
    
    // Imprime el ID del pedido
    System.out.println("Pedido ID:" + id); 
    
    // Imprime el nombre del cliente
    System.out.println("Cliente:" + cliente); 
    
    // Imprime el estado del pedido
    System.out.println("Estado:" + estado); 
    
    // Imprime la lista de productos del pedido
    System.out.println("Productos: ");
    
    // Recorre la lista de productos e imprime la descripción y el precio de cada producto
    for (Producto pro : productos) { 
        System.out.println(pro.descripcion() + " / Precio: S/." + pro.getPrecio()); 
        } 

    } 

} 