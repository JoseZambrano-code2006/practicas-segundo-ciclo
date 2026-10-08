
package tiendabebidas;


public class Gaseosa extends ProductoBebida{
    
     private String marca;

    public Gaseosa(int id, String tamaño, double precio, String marca) {

        // Llama al constructor super(superclase) con los primeros tres parámetros
        super(id, tamaño, precio);

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
