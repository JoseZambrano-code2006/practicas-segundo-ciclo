package model;


public class Cliente extends Persona{
    
    private int idCliente;
    private String email;
    private int telefono;
    private String genero;

    public Cliente() {
    }

    public Cliente(int idCliente, String email, int telefono, String genero, String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        this.idCliente = idCliente;
        this.email = email;
        this.telefono = telefono;
        this.genero = genero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    

    
}
