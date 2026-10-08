
package Biblioteca;


public class Libros {
    
    public String autor;
    public String titulo;
    public String genero;
    public boolean estado;
    public int idl;
    
    
    
    // Constructor para inicializar los atributos del libro
    public Libros(String autor, String titulo, String genero, int idl, boolean estado) {
        //inializa los atrivutos...
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.estado = estado;
        this.idl = idl;
    }

    public Libros() {
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }
    
    public boolean prestamo(){
    
    estado = false;
        return estado;
          
    }
    
    
    public boolean devolucion(){
    
    estado = true;
    return estado;
    }  
    
}
