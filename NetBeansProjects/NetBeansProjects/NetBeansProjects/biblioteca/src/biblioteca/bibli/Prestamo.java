
package biblioteca.bibli;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Prestamo {
    
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void registrarPrestamo() {
        usuario.pedirLibro(libro);
        System.out.println("Prestamo registrado: " + usuario.getNombre() + " ha prestado " + libro.getTitulo());
    }

    public void registrarDevolucion() {
        usuario.devolverLibro(libro);
        System.out.println("Devolución registrada: " + usuario.getNombre() + " ha devuelto " + libro.getTitulo());
    }

    public void verPrestamos() {
        System.out.println("Prestamos del usuario " + usuario.getNombre() + ":");
        for (Libro libro : usuario.getLibrosPrestados()) {
            System.out.println(" - " + libro.getTitulo());
        }
    
    
    }
}
