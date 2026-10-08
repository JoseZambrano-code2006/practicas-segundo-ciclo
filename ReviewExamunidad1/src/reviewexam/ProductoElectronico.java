/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewexam;

/**
 *
 * @author tpp
 */
public class ProductoElectronico extends Producto{
    
    private String marca;
    private int garantia;

    public ProductoElectronico(String marca, int garantia, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    

    @Override
    public void viewDetails() {
        System.out.println("Producto Electronico");
        System.out.println("nombre:"+getNombre());
        System.out.println("precio:"+getPrecio());
        System.out.println("marca:"+marca);
        System.out.println("Garantia:"+garantia);
    }
    
}
