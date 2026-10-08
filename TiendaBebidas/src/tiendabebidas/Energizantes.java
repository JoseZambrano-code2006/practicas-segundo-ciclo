
package tiendabebidas;


public class Energizantes extends ProductoBebida{
    

    public Energizantes(int cantidad, String nombre, double precio) { 
        
        // Llama al constructor de la clase base (superclase) con los primeros tres parámetros
        super(cantidad, nombre, precio); 
        
    } 
    
    // Sobrescribe el método crearEntrega de la interfaz PedCRUD
    @Override 
    public String descripcion() { 
        return "Bebida energizante: " + getNombre() ; 
    } 
      
}
