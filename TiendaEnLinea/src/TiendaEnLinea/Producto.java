package TiendaEnLinea;


public abstract class Producto { 

    private int id; 
    private String nombre; 
    private double precio; 

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) { 
        
    // Asigna el ID pasado por parámetro al campo de la clase
    this.id = id; 
    
    // Asigna el nombre pasado por parámetro al campo de la clase
    this.nombre = nombre; 
    
    // Asigna el precio pasado por parámetro al campo de la clase
    this.precio = precio; 
} 

// Método getter para obtener el ID del producto
public int getId() { 
    return id; 
} 

// Método getter para obtener el nombre del producto
public String getNombre() { 
    return nombre; 
} 

// Método getter para obtener el precio del producto
public double getPrecio() { 
    return precio; 
} 

// Método setter para asignar un nuevo ID al producto
public void setId(int id) { 
    this.id = id; 
} 

// Método setter para asignar un nuevo nombre al producto
public void setNombre(String nombre) { 
    this.nombre = nombre; 
} 

// Método setter para asignar un nuevo precio al producto
public void setPrecio(double precio) { 
    this.precio = precio; 
} 

// Método abstracto que debe ser implementado por las clases hijas, define la descripción del producto
public abstract String descripcion();

} 

