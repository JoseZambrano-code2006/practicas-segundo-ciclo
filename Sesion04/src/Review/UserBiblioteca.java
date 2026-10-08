/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review;

/**
 *
 * @author tpp
 */
public class UserBiblioteca {

    // Modificador por defecto (package-private)
    String nombre;

    // Modificador public
    public int idUser;

    // Modificador protected
    protected String tipoMiembro;

    // Modificador private
    private String password;

    public UserBiblioteca(String nombre, int idUser, String tipoMiembro, String password) {
        this.nombre = nombre;
        this.idUser = idUser;
        this.tipoMiembro = tipoMiembro;
        this.password = password;
    }
    // Método public

    public void mostrarUser() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID Miembro: " + idUser);
        System.out.println("Tipo de Miembro: " + tipoMiembro);
    }

    // Método protected
    protected void actualizarTipo(String nuevoTipo) {
        this.tipoMiembro = nuevoTipo;
    }

    // Método private
    private void actualizarPassword(String nuevoPassword) {
        this.password = nuevoPassword;
    }

}
