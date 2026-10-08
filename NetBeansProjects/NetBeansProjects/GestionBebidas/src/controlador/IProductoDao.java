
package controlador;

import java.util.List;
import model.Producto;


public interface IProductoDao {
    
    
    //Inserta un nuevo producto en la base de datos.
    public boolean insert(Producto p);

    //Actualiza los datos de un producto existente.
    public boolean update(Producto p);

    //Elimina un producto de la base de datos.
    public boolean delete(int idbebida);
     
    //Busca un producto por su ID único.
    public Producto findById(int id);
    
    //Lista todos los productos registrados en la base de datos.
    public List<Producto> listAll();
   
    //Busca productos por codigo.
    public Producto findByCodigo(String codigo);

    //verificar si un producto tiene cantidad disponibles
    public boolean verificar(int id);
    
    //Reduce la cantidad de un producto.
    public boolean reducir(int id, int cantidad);
    
    //Aumenta la cantidad de un producto.
    public boolean aumenta(int id, int cantidad);
    
}
    
    
    
    
    
    

