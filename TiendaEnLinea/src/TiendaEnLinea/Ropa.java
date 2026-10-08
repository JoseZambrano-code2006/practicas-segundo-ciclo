package TiendaEnLinea;

public class Ropa extends Producto {

    private String marca;

    public Ropa(int id, String nombre, double precio, String marca) {

        // Llama al constructor super(superclase) con los primeros tres parámetros
        super(id, nombre, precio);

        // Inicializa el atributo marca con el valor recibido como parámetro
        this.marca = marca;
    }
    
    

    //sobre escribe el metodo descripcion de la interfaz PedCRUD
    @Override
    public String descripcion() {

        return "gaseosa:" + getNombre() + ", Marca: " + marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}
