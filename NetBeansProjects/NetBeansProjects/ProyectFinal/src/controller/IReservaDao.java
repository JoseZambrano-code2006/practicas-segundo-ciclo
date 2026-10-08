
package controller;

import java.util.List;
import model.Reserva;


public interface IReservaDao {
    
    //metodo para insertar una reserva
    public boolean insert(Reserva reserva);
    
    //metodo para actualizar
    public boolean update(Reserva reserva);
    
    //metodo para buscar id
    public Reserva searchByid(int id);
    
    //metodo para eliminar la reserva
    public boolean delete(Reserva reserva);
    
    //metodo para listar las reservas
    public List<Reserva> listAll();
    
      
}
