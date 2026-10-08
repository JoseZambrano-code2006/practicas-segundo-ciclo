
package biblioteca.bibli;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.librosPrestados = new ArrayList<>();
    }

    public void pedirLibro(Libro libro) {
        if (libro.getEstado().equals("disponible")) {
            libro.prestamo();
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro no está disponible para prestamo.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolucion();
            librosPrestados.remove(libro);
        } else {
            System.out.println("El libro no está en la lista de libros prestados.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }   
     
    
}
