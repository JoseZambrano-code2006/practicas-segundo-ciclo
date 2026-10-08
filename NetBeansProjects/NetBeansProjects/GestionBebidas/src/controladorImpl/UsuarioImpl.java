/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorImpl;

import controlador.IUsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.usuario;
import utils.ConexionSingleton;

/**
 *
 * @author USER
 */
public class UsuarioImpl implements IUsuarioDao{
    private Connection cn;

    @Override
    public usuario iniciarSesión(String user, String password) {
        usuario us = null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * FROM usuario WHERE user = ? and password = ?; ";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setString(1, user);
            st.setString(2, password);
            rs = st.executeQuery();
            while (rs.next()) {
                us = new usuario();
                us.setId(rs.getInt("id"));
                us.setUser(rs.getString("user"));
                us.setPassword(rs.getString("password"));
                us.setTipoUser(rs.getString("tipo_user"));
            }

        } catch (Exception e) {
            System.out.println("Error al validar el usuario: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            System.out.println("Erro. No se pudo validar el usuario");
        } finally {
            if (cn != null) {
                try {
                } catch (Exception ex) {
                }
            }
        }
        return us;
    }
}
