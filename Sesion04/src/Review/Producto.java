/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review;

/**
 *
 * @author tpp
 */
public class Producto {
    // Atributos
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
// Método para calcular el precio final después de aplicar un descuento
    public double calcularPrecioFinal(double descuento) {
        // Parámetro descuento es el porcentaje de descuento que se aplicará
        double precioFinal = precio - (precio * descuento / 100);
        return precioFinal;
    }

    // Método para mostrar detalles del producto
    public void mostrarDetalles() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: $" + precio);
    }    
}
