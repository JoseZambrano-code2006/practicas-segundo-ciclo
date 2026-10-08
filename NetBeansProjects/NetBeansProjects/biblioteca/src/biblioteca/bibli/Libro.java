
package biblioteca.bibli;


public class Libro {
    
    private String titulo;
    private String autor;
    private String genero;
    private String estado; // disponible, prestado

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estado = "disponible";
    }

    public void prestamo() {
        if (estado.equals("disponible")) {
            estado = "prestado";
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolucion() {
        if (estado.equals("prestado")) {
            estado = "disponible";
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return estado;
    }   
    
    
}
