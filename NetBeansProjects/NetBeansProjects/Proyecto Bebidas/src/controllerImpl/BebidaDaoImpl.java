
package controllerImpl;

import controller.IBebidaDao;
import Utils.ConexionSingleton;
import model.Bebida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BebidaDaoImpl implements IBebidaDao{
      private Connection cn;

    @Override
    public int agregar(Bebida b) {
        int flag=0;
        
         PreparedStatement st;
        //declaro la variable que va contener la consulta a la base de datos
         String query = null;

        try {
            query = " INSERT INTO Bebida (codigo,nombre, tipo, tamanio, precio, cantidadDisponible) VALUES (?,?, ?, ?, ?, ?);";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);

            st.setString(1, b.getCodigo());
            st.setString(2, b.getNombre());
            st.setString(3, b.getTipo());
            st.setString(4, b.getTamaño());
            st.setInt(5, b.getPrecio());
            st.setInt(6, b.getCanidadDisposible());
            st.executeUpdate();
            flag = 1;
        } catch (Exception e) {
            System.out.println("Error al insertar una bebida" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
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
    public Bebida BuscarPorID(int idBebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Bebida> listar() {
    List<Bebida> lista = new ArrayList<>();
    String query = "SELECT * FROM Bebida";
    
    try (Connection cn = ConexionSingleton.getConnection();
            
         PreparedStatement st = cn.prepareStatement(query);
            
         ResultSet rs = st.executeQuery()) {

        while (rs.next()) {
            Bebida bebida = new Bebida();
            bebida.setIdBebida(rs.getInt("idBebida"));
            bebida.setCodigo(rs.getString("codigo"));
            bebida.setNombre(rs.getString("nombre"));
            bebida.setTipo(rs.getString("tipo"));
            bebida.setTamaño(rs.getString("tamanio"));
            bebida.setPrecio(rs.getInt("precio"));
            bebida.setCanidadDisposible(rs.getInt("cantidadDisponible"));
            lista.add(bebida);
        }
    } catch (SQLException e) {
        System.out.println("Error al listar bebidas: " + e.getMessage());
    }
    return lista;
     }

    @Override
    public boolean actualizar(Bebida b) {
        
           boolean flag=false;
        
         PreparedStatement st;
        //declaro la variable que va armar la sentencia para ejecutar
         String query = null;

        try {
            query = " UPDATE Bebida SET codigo = ?, nombre = ?, tipo = ?, tamanio = ?, precio = ?, cantidadDisponible = ? WHERE idBebida = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            
            st.setString(1, b.getCodigo());
            st.setString(2, b.getNombre());
            st.setString(3, b.getTipo());
            st.setString(4, b.getTamaño());
            st.setInt(5, b.getPrecio());
            st.setInt(6, b.getCanidadDisposible());
            st.setInt(7, b.getIdBebida());
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al actualizar una bebida" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
            System.out.println("Error, No se pudo actualizar el registro");
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
    public boolean eliminar(Bebida b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int CantidadDisponible(int idBebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean reducirInventario(int idBebida, int cantidadDisponible) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }}
    
    

