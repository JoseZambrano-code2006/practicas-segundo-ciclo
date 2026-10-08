
package model;

import java.util.List;

public class Ventas {
    
    private int idventa;
    private Cliente clienteID;
    private List<Producto> productoID; 
    private int cantidad;
    private String Fecha;
    private String Hora;
    private double Total;

    public Ventas() {
    }

    public Ventas(int idventa, Cliente clienteID, List<Producto> productoID, int cantidad, String Fecha, String Hora, double Total) {
        this.idventa = idventa;
        this.clienteID = clienteID;
        this.productoID = productoID;
        this.cantidad = cantidad;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Total = Total;
    }

    
    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Cliente getClienteID() {
        return clienteID;
    }

    public void setClienteID(Cliente clienteID) {
        this.clienteID = clienteID;
    }

    public List<Producto> getProductoID() {
        return productoID;
    }

    public void setProductoID(List<Producto> productoID) {
        this.productoID = productoID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    

    
    
}
