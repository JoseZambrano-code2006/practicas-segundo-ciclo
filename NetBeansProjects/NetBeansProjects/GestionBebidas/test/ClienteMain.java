
import controlador.IClienteDao;
import controladorImpl.ClienteImpl;
import java.util.List;
import model.Cliente;


public class ClienteMain {

    
    public static void main(String[] args) {
        ClienteMain test = new ClienteMain();
        //test.insert();
        // test.update();
        // test.delete();
        // test.searchById();
        // test.listAll();
        // test.searchByDni();
    }

    // Método para insertar un cliente
    public void insert() {
        Cliente cliente = new Cliente();
        cliente.setNombre("jose");
        cliente.setApellidos("zambrano");
        cliente.setDni("11111111");
        cliente.setEmail("wazaaaaa@gmail.com");
        cliente.setTelefono(987654321);
        cliente.setGenero("f");

        IClienteDao clienteDao = new ClienteImpl();
        boolean result = clienteDao.insert(cliente);

        if (result) {
            System.out.println("Cliente insertado exitosamente.");
        } else {
            System.out.println("Error al insertar el cliente.");
        }
    }

    // Método para actualizar un cliente
    public void update() {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1); // ID del cliente a actualizar
        cliente.setNombre("Carlos");
        cliente.setApellidos("Lopez");
        cliente.setDni("98765432");
        cliente.setEmail("carlos.lopez@example.com");
        cliente.setTelefono(987654321);
        cliente.setGenero("M");

        IClienteDao clienteDao = new ClienteImpl();
        boolean result = clienteDao.update(cliente);

        if (result) {
            System.out.println("Cliente actualizado exitosamente.");
        } else {
            System.out.println("Error al actualizar el cliente.");
        }
    }

    // Método para eliminar un cliente
    public void delete() {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1); // ID del cliente a eliminar

        IClienteDao clienteDao = new ClienteImpl();
        boolean result = clienteDao.delete(cliente);

        if (result) {
            System.out.println("Cliente eliminado exitosamente.");
        } else {
            System.out.println("Error al eliminar el cliente.");
        }
    }

    // Método para buscar un cliente por su ID
    public void searchById() {
        int idCliente = 1; // ID del cliente a buscar

        IClienteDao clienteDao = new ClienteImpl();
        Cliente cliente = clienteDao.searchById(idCliente);

        if (cliente != null) {
            System.out.println("ID Cliente: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellidos: " + cliente.getApellidos());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("Género: " + cliente.getGenero());
        } else {
            System.out.println("No se encontró el cliente con ID: " + idCliente);
        }
    }

    // Método para listar todos los clientes
    public void listAll() {
        IClienteDao clienteDao = new ClienteImpl();
        List<Cliente> clientes = clienteDao.listAll();

        if (clientes != null && !clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println("ID Cliente: " + cliente.getIdCliente());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellidos: " + cliente.getApellidos());
                System.out.println("DNI: " + cliente.getDni());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Género: " + cliente.getGenero());
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("No se encontraron clientes.");
        }
    }

    // Método para buscar un cliente por DNI
    public void searchByDni() {
        String dni = "98765432"; // DNI del cliente a buscar

        IClienteDao clienteDao = new ClienteImpl();
        Cliente cliente = clienteDao.searchByDni(dni);

        if (cliente != null) {
            System.out.println("ID Cliente: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellidos: " + cliente.getApellidos());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("Género: " + cliente.getGenero());
        } else {
            System.out.println("No se encontró el cliente con DNI: " + dni);
        }
    }
}
