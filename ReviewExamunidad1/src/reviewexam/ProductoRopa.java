/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewexam;

/**
 *
 * @author tpp
 */
public class ProductoRopa extends Producto{
    
    private String talla;
    private String color;

    public ProductoRopa(String talla, String color, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void viewDetails() {
        System.out.println("Producto Ropa");
        System.out.println("nombre:"+getNombre());
        System.out.println("precio:"+getPrecio());
        System.out.println("talla:"+talla);
        System.out.println("color:"+color);
    }
    
    
}
