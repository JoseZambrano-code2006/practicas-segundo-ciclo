
package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Sistema {
    // creamos un lista para guardas lo siguiente...
    public List<Usuario>usuarios = new ArrayList<>();
    public List<Prestamo>prestamos = new ArrayList<>();
    public List<Libros>librosreg = new ArrayList<>();
    
    
    // Método para registrar un nuevo usuario
    public void RegistrarUsuario(Usuario usuario){
    
    usuarios.add(usuario);
    
    
    }
    
    // Método para registrar un nuevo libro
    public void RegistrarLibro(Libros libro){
        
        librosreg.add(libro);    
    }
    
   // Método para prestar un libro
   public void PrestarLibro (int idprestamo, Date fecha, Usuario usuario, Libros libro){
   Prestamo prest = new Prestamo(idprestamo, fecha, usuario, libro);
   
   Libros lib = new Libros();
  
   lib.prestamo();
   prestamos.add(prest);
       System.out.println("El libro ha sido prestado "+lib.isEstado()+" Libro: "+lib.getTitulo());
   
   }
   // Método para devolver un libro
   public void DevolverLibro (int idprestamo){
       
        Libros lib = new Libros();
  
  lib.devolucion();
      
      prestamos.removeIf(prestamo -> prestamo.getId() == idprestamo);      
   
   }
   
   // Método para ver los préstamos actuales
   public List<Prestamo> verPrestamos(){
   
       System.out.println(prestamos);
   return prestamos;
       
       
   }
   // Método para ver los libros registrados
   public List<Libros> verLibrosPrestados(){
          
   return librosreg;    
   }
   
   // Método para limpiar la lista de préstamos
   public void LimpiarPrestamos(){
   
   prestamos.clear();
   
   }
    
}
