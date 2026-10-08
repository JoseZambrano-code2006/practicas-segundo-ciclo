
package controller;

import java.util.List;
import model.Bebida;


public interface IBebidaDao {
    
    //metod para agregar Bebida
    public int agregar (Bebida b);  
    // Método para Buscar una Bebida específica por su ID
    public Bebida BuscarPorID (int idBebida);

    // Método para listar todas las bebidas disponibles en el inventario
    public List<Bebida> listar();    
    
    //metodo para actualizar Bebida
    public boolean actualizar (Bebida b);
    
     //metodo para eliminar Bebida
    public boolean eliminar (Bebida b); 
     
    // Método para verificar la cantidad disponible de una Bebida
    public int CantidadDisponible(int idBebida);
    
    // Método para reducir la cantidad de una Bebida en el inventario según la venta realizada
    public boolean reducirInventario(int idBebida, int cantidadDisponible);
  
  
}
