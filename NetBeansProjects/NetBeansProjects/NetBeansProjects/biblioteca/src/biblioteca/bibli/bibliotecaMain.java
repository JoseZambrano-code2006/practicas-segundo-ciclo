
package biblioteca.bibli;

import java.util.Date;


public class bibliotecaMain {

    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Novela");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Novela");
        Usuario usuario = new Usuario("Juan Perez", "Calle Falsa 123", "555-1234");

        
        Prestamo prestamo = new Prestamo(libro1, usuario, new Date(), null);
              
        prestamo.registrarPrestamo();        
   
        prestamo.verPrestamos();
         
        prestamo.registrarDevolucion();
        
        prestamo.verPrestamos();



    }
    
}
