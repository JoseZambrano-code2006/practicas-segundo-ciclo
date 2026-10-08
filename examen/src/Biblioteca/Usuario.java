
package Biblioteca;

public class Usuario {
    
    public String nombreUsuario;
    public int id;
    
    
    // Constructor para inicializar los atributos del usuario
    public Usuario(String nombreUsuario, int id) {
        this.nombreUsuario = nombreUsuario;
        this.id = id;
    }
    
    
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
