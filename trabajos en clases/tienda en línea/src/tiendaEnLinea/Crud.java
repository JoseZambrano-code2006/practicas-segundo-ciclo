
package tiendaEnLinea;


public interface Crud {
    
    public interface Crud<Cliente> {

    public void create(Cliente e);

    public Cliente view(int id);

    public void update(Cliente e);

    public void delete(int id);
    
}

}
