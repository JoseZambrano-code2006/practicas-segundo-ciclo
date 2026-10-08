
package Biblioteca;

import java.util.*;


public class Prestamo {
    
    public int id;
    public Date fecha;
    public Usuario usuario;
    public Libros libro;

    public Prestamo(int id, Date fecha, Usuario usuario, Libros libro) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    
    
    
}
