
package ModAccess;


public class Coche {
    // Modificador por defecto (package-private)
    String marca;

    // Modificador public accesible desde cualquier otra clase
    public String modelo;

    // Modificador protected accesible dentro del mismo paquete y por las subclases
    protected int year;

    // Modificador private  accesible solo dentro de la misma clase
    private double precio; 

    // Constructor
    public Coche(String marca, String modelo, int year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    // Método public
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + year);
        System.out.println("Precio: " + precio);
    }

    // Método protected
    protected void actualizarYear(int nuevoYear) {
        this.year = nuevoYear;
    }

    // Método private
    private void ajustarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
