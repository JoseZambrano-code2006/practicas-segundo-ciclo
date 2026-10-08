
package controller;

import java.util.List;
import model.Cliente;


public interface IClienteDao {
    
    // Método para agregar un nuevo Cliente al sistema
    public boolean agregarCliente(Cliente cliente);
    
    // Método para obtener un Cliente específico por su ID
    public Cliente obtenerClientePorID(int idCliente);
    
    // Método para listar todos los clientes registrados
    public List<Cliente> listarClientes();
    
    // Método para actualizar la información de un Cliente existente
    public boolean actualizarCliente(Cliente cliente);
    
    // Método para eliminar un Cliente del sistema por su ID
    public boolean eliminarCliente(int idCliente);
    
    // Método para buscar un Cliente por su DNI
    public Cliente buscarPorDNI(String dni);
}
