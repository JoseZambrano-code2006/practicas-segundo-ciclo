/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Review;

/**
 *
 * @author tpp
 */
public class UserMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         UserBiblioteca user = new UserBiblioteca("Juan Perez", 123, "Regular", "password123");

        // Acceso a miembros public
        user.mostrarUser();

        // Acceso a miembros con modificador por defecto (package-private)
        System.out.println("Nombre: " + user.nombre);

        // Acceso a miembros protected (sólo dentro del mismo paquete o subclases)
        user.actualizarTipo("Premium");
        System.out.println("Tipo de Miembro actualizado: " + user.tipoMiembro);

        // Acceso a miembros private (esto causará un error de compilación)
//         user.actualizarPassword("nuevopassword");
//        System.out.println("Password actualizado: " + user.password);
        
    }
    
}
