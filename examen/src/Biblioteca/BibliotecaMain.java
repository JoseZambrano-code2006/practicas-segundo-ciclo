
package Biblioteca;

import java.util.Date;

public class BibliotecaMain {

    public static void main(String[] args) {
        
    
    Sistema sist = new Sistema(); 
     
    //creamos libro
    Libros lb1 = new Libros("valve", "dpta 2", "historia", 1, true);
    Libros lb2 = new Libros("valve", "left 4 dead", "historia",2, true);
    
    
    //registramos libro
    sist.RegistrarLibro(lb1);
    sist.RegistrarLibro(lb2);
    
    //creamos clientes
    Usuario us1 = new Usuario("jose", 1);
    Usuario us2 = new Usuario("ulises", 2);
    
    //registrarmos clientes
    sist.RegistrarUsuario(us1);
    sist.RegistrarUsuario(us2);
    
    //hacer prestamo
    sist.PrestarLibro(1, new Date(), us1, lb1);
    sist.PrestarLibro(2, new Date(), us2, lb2);
   
    //ver prestamos
    for (Prestamo prestamo : sist.verPrestamos()){
    
        System.out.println("\n Id del prestamo:"+prestamo.getId()+"\n Fecha: "+prestamo.getFecha()+"\n Usuario que ha pedido el libro: "+prestamo.getUsuario()+" "+prestamo.getLibro());
        
    
    
    }
    
    //devolver libro
    sist.DevolverLibro(1);
    
        System.out.println("Libros luego de la devolución");
    
    //ver prestamos despues de cancelar
    for (Prestamo prestamo : sist.verPrestamos()){
    
        System.out.println("\n Id del prestamo:"+prestamo.getId()+"\n Fecha: "+prestamo.getFecha()+"\n Usuario que ha pedido el libro: "+prestamo.getUsuario()+" "+prestamo.getLibro());
        
    
    
    }
   
    
    
   
    
    
    
      
    
    
    }
    
}
