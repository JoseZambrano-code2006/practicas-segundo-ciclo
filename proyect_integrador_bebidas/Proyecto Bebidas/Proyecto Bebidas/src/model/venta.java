
package model;

import java.util.List;


public class venta {
    private int idVenta;
    private List<VentaBebida> bebidasVendidas; 
    private String fecha;
    private double total;

    public venta() {
    }

    public venta(int idVenta, List<VentaBebida> bebidasVendidas, String fecha, double total) {
        this.idVenta = idVenta;
        this.bebidasVendidas = bebidasVendidas;
        this.fecha = fecha;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public List<VentaBebida> getBebidasVendidas() {
        return bebidasVendidas;
    }

    public void setBebidasVendidas(List<VentaBebida> bebidasVendidas) {
        this.bebidasVendidas = bebidasVendidas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
