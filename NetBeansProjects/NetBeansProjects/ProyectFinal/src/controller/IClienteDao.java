
package controller;

import java.util.List;
import model.Cliente;


public interface IClienteDao {
    
    //metodo para insertar un cliente
    public boolean insert(Cliente cliente);
    
    //metodo para actualizar 
    public boolean update(Cliente cliente);
    
    //metodo para buscar cliente_id
    public Cliente searchByid(int id);
    
    //metodo para eliminar un cliente
    public boolean delete(Cliente cliente );
    
    //metodo para listar los cliente
    public List<Cliente> listAll();
    
        
}
