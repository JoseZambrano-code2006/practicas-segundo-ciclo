
package model;


public class Ventas {
    private Cliente cliente;
    private Productos productos;
    private int idVentas;
    private String Fecha;
    private String Hora;
    private String Total;

    public Ventas() {
    }

    public Ventas(Cliente cliente, Productos productos, int idVentas, String Fecha, String Hora, String Total) {
        this.cliente = cliente;
        this.productos = productos;
        this.idVentas = idVentas;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Total = Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
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

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }
    
    
    
    
    
}
