/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerImpl;

import Controller.MatriculaDao;
import Utils.ConexionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Curso;
import model.Estudiante;
import model.Matricula;

/**
 *
 * @author tpp
 */
public class MtriculaDaoImpl implements MatriculaDao {

    private Connection cn;

    @Override
    public boolean crear(Matricula m) {

        boolean flag = false;

        PreparedStatement st;
        //declaro la variable que va contener la consulta a la base de datos
        String query = null;

        try {
            query = " INSERT INTO matricula (idCurso, idEstudiante, horas,"
                    + " creditos, estado)"
                    + " VALUES (?, ?, ?, ?, ?);";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);

            st.setInt(1, m.getCurso().getIdCurso());
            st.setInt(2, m.getEstudiante().getIdEstudiante());
            st.setString(3, m.getHoras());
            st.setString(4, m.getCreditos());
            st.setString(5, m.getEstado());

            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar una matricula" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            flag = false;
            System.out.println("Error, No se pudo agregar el registro");
        } finally {
            if (cn != null) {
                try {
                } catch (Exception e) {
                }
            }
        }

        return flag;

    }

    @Override
    public boolean actualizar(Matricula m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Matricula buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Matricula m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Matricula> listAll() {
        //declaracion de un arreglo
        List<Matricula> lista = null;
        //declar la clase cliente
        Matricula mt;
        Curso c;
        Estudiante e;
        PreparedStatement st;
        //resultado que devuelve los datos de la base de datos
        ResultSet rs;
        //declaro la variable que va contener la consulta a la base de datos
        String query = null;

        try {
            //sentencia de sql para traer todas las reservas
            query = " select c.nombre AS curso, e.nombreCompleto as estudiante, m.horas, m.creditos, m.estado "
                    + " FROM matricula m , curso c, estudiante e "
                    + " WHERE m.idCurso = c.idCurso "
                    + " AND m.idEstudiante = e.idEstudiante ; ";
            // sobreescribir la lista en un arreglo
            lista = new ArrayList<>();
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                mt = new Matricula();
                c = new Curso();
                e = new Estudiante();

                c.setNombre(rs.getString("curso"));
                e.setNombreCompleto(rs.getString("estudiante"));

                mt.setCurso(c);
                mt.setEstudiante(e);
                mt.setHoras(rs.getString("horas"));
                mt.setCreditos(rs.getString("creditos"));
                mt.setEstado(rs.getString("estado"));

                lista.add(mt);
            }
        } catch (Exception e1) {
            System.out.println("Error al listar a la matricula" + e1.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }

        } finally {

            if (cn != null) {
                try {
                } catch (Exception e2) {
                }
            }

        }
        return lista;
    }

}
