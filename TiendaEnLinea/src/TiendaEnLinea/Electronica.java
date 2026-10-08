package TiendaEnLinea;

public class Electronica extends Producto { 

    private int garantia; 

    public Electronica(int id, String nombre, double precio, int garantia) { 
        
        // Llama al constructor de la clase base (superclase) con los primeros tres parámetros
        super(id, nombre, precio); 
        
        // Inicializa el atributo garantia con el valor recibido como parámetro
        this.garantia = garantia; 
    } 

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electronica other = (Electronica) obj;
        return true;
    }
    
    
    // Sobrescribe el método crearPedido de la interfaz PedCRUD
    @Override 
    public String descripcion() { 
        return "Producto electronico: " + getNombre() + ", Garantia: "  + garantia + " anios"; 
    } 

    public int getGarantia() { return garantia; } 
    public void setGarantia(int garantia) { this.garantia = garantia; } 
    
    
    
} 

 

