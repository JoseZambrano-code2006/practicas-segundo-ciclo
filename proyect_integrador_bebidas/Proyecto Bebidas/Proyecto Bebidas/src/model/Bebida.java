
package model;


public class Bebida {
    
    private int idBebida;
    private String codigo;
    private String nombre;
    private String tipo;
    private String tamaño;
    private int Precio;
    private int canidadDisposible;

    public Bebida() {
    }

    public Bebida(int idBebida, String codigo, String nombre, String tipo, String tamaño, int Precio, int canidadDisposible) {
        this.idBebida = idBebida;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.Precio = Precio;
        this.canidadDisposible = canidadDisposible;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCanidadDisposible() {
        return canidadDisposible;
    }

    public void setCanidadDisposible(int canidadDisposible) {
        this.canidadDisposible = canidadDisposible;
    }

  
 
     
    
}
