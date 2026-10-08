/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Review;

/**
 *
 * @author tpp
 */
public class ProductoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto producto1 = new Producto("Laptop", 800.00);

        // Mostrar detalles del producto
        producto1.mostrarDetalles();

        // Calcular y mostrar el precio final con un descuento del 10%
        // Argumento 10.0 es el valor pasado al parámetro descuento del método calcularPrecioFinal
        double precioConDescuento = producto1.calcularPrecioFinal(10.0);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
    
}
