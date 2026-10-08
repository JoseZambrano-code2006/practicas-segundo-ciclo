
package model;


public class Productos {
    private int idproductos;
    private String Codigo;
    private String Precio;
    private String Descripcion;
    private String Categoría;

    public Productos() {
    }

    public Productos(int idproductos, String Codigo, String Precio, String Descripcion, String Categoría) {
        this.idproductos = idproductos;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Categoría = Categoría;
    }

    public int getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(int idproductos) {
        this.idproductos = idproductos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String Categoría) {
        this.Categoría = Categoría;
    }
    
    
}
