
package controlador;

import java.util.List;
import model.Cliente;

public interface IClienteDao {
    
    //metodo para insert una cliente
    public boolean insert(Cliente c);
    
    //metodo para actualizar
    public boolean update(Cliente c);
    
    //metodo para buscar por Id
    public Cliente searchById(int id);
    
    //metodo para eliminar la cliente
    public boolean delete(Cliente c);
    
    //metodo para listar las cliente
    public List<Cliente> listAll();
    
    //metodo para buscar cleinte con DNI
    public Cliente searchByDni(String dni);
    
}
