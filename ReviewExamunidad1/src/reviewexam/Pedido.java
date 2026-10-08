/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewexam;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    private int id;
    private String cliente;
    private List<Producto> productos;
    private String estado;

    public Pedido(int id, String cliente, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.estado = estado;
        this.productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void addProductos(Producto p){
        productos.add(p);
    }
    
    public abstract void viewDetailPedido();
    
    
}
