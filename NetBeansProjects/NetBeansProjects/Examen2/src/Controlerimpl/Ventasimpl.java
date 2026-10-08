
package Controlerimpl;

import Controler.VentasDao;
import Utils.ConexionSingleton;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Ventas;
import model.Productos;
public class Ventasimpl implements VentasDao {

    private Connection cn;
    @Override
    public boolean insert(Ventas ventas) {
         boolean flag = false;

        PreparedStatement st;

        String query = null;
        try {
            query = "INSERT INTO ventas (Fecha, Hora, Total, idCliente, idproductos) VALUES (?, ?, ?, ?, ?);";

            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setString(1, ventas.getFecha());
            st.setString(2, ventas.getHora());
            st.setString(3, ventas.getTotal());
            st.setInt(4, ventas.getCliente().getIdCliente());
            st.setDouble(5, ventas.getProductos().getIdproductos());
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar las ventas" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
                flag = false;
                System.out.println("Erro no se puedo agregar el registro ");
            }
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
    public boolean Update(Ventas ventas) {
               boolean flag = false;

        PreparedStatement st;

        String query = null;
        try {
            query = " UPDATE Ventas SET Fecha =?, Hora =?, Total =?, idCliente =?, idproductos =? " + " WHERE idVentas =?" ;

            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setString(1, ventas.getFecha());
            st.setString(2, ventas.getHora());
            st.setString(3, ventas.getTotal());
            st.setString(4, ventas.getCliente().getNombre());
            st.setString(5, ventas.getProductos().getDescripcion());
            st.setInt(6, ventas.getIdVentas());
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar las ventas" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
                flag = false;
                System.out.println("Erro no se puedo agregar el registro ");
            }
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
    public Ventas serarchById(int id) {
        Ventas ve = null;
        Cliente cl;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = " SELECT v.idVentas, v.fecha, v.hora, v.Total, c.Nombre, p.Descripcion FROM Ventas v , cliente c, productos p"
                    + " where v.idCliente = c.idCliente "
                    + " AND v.idproductos= p.idproductos"
                    + " AND v.idVentas =?;";

            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                ve = new Ventas();

                cl = new Cliente();
                ve.setIdVentas(rs.getInt("idVentas"));
                ve.setFecha(rs.getString("Fecha"));
                ve.setHora(rs.getString("Hora"));
                ve.setTotal(rs.getString("Total"));
                cl.setNombre(rs.getString("Nombre"));
                ve.setCliente(cl);

            }
        } catch (Exception e) {
            System.out.println("Error al BUSCAR LA venta" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {

                System.out.println("Erro no se puedo BUSCAR  el registro ");
            }
        } finally {
            if (cn != null) {
                try {

                } catch (Exception e) {
                }
            }
        }
        return ve;
    }

    @Override
    public boolean delete(Ventas ventas) {
        boolean flag = false;

        PreparedStatement st;

        String query = null;
        try {
            query = "DELETE FROM reserva WHERE idreserva = ?";

            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, ventas.getIdVentas());

            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar las ventas" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
                flag = false;
                System.out.println("Erro no se puedo agregar el registro ");
            }
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
    public List<Ventas> listAll() {
        List<Ventas> List = null;
        Ventas ve;
        Productos pr;
        Cliente cl;
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        try {
            query = " SELECT v.idVentas, v.fecha, v.hora, v.Total, c.Nombre, p.Descripcion FROM Ventas v , cliente c, productos p"
                    + " where v.idCliente = c.idCliente "
                    + " AND v.idproductos= p.idproductos;";
            List = new ArrayList<>();
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                ve = new Ventas();
                pr = new Productos();
                cl = new Cliente();
                ve.setIdVentas(rs.getInt("idVentas"));
                ve.setFecha(rs.getString("Fecha"));
                ve.setHora(rs.getString("Hora"));
                ve.setTotal(rs.getString("Total"));
                cl.setNombre(rs.getString("Nombre"));
                pr.setDescripcion(rs.getString("Descripcion"));
                ve.setCliente(cl);
                ve.setProductos(pr);
                List.add(ve);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las ventas" + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }

        } finally {
            if (cn != null) {
                try {

                } catch (Exception e) {
                }
            }
        }
        return List;
    }
    }
    
    
    

