
package model;

public class Producto {
    
    private int idBebida;
    private String codigo;
    private String categoria; // Ej: "Agua", "Gaseosa", "Jugo"
    private String tipo; // Ej: "Sin gas", "Cola", "Naranja"
    private String marca;
    private String tamaño;
    private int cantidadDisponible;
    private double precio;
    private String estado; 
    

    public Producto() {
    }

    public Producto(int idBebida, String codigo, String categoria, String tipo, String marca, String tamaño, int cantidadDisponible, double precio, String estado) {
        this.idBebida = idBebida;
        this.codigo = codigo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    
    
}
