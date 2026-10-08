/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import model.usuario;

/**
 *
 * @author USER
 */
public interface IUsuarioDao {
    
    //metodo para buscar cleinte con DNI
    public usuario iniciarSesión(String user, String password);
}
