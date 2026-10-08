/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class VentaBebida {
    
    private int ventaId;         
    private int bebidaId;        
    private int cantidad;        
    private int precio;       

    public VentaBebida() {
    }

    public VentaBebida(int ventaId, int bebidaId, int cantidad, int precio) {
        this.ventaId = ventaId;
        this.bebidaId = bebidaId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getBebidaId() {
        return bebidaId;
    }

    public void setBebidaId(int bebidaId) {
        this.bebidaId = bebidaId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
}
