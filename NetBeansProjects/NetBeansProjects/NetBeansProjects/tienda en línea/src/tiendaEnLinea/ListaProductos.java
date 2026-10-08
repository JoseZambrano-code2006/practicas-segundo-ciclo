
package tiendaEnLinea;


public class ListaProductos {    
    
    
    private String nombre;
    private double precio;

    public ListaProductos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    // Método para mostrar detalles del producto
    public void mostrarDetalles() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: $" + precio);
    }   
    
    
    
    
    
}
