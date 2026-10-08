
package controladorImpl;

import controlador.IDetalleVentaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DetalleVenta;
import model.Producto;
import utils.ConexionSingleton;

public class DetalleVentaImpl implements IDetalleVentaDao{
    
        private Connection cn;


    @Override
    public boolean insert(DetalleVenta d) {
    boolean flag = false;
    PreparedStatement st;
    String query = null;

    try {
        query = "INSERT INTO detalleventa (Venta_id, Producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?);";
        cn = ConexionSingleton.getConnection();
        st = cn.prepareStatement(query);

        st.setInt(1, d.getIdVenta()); // ID del producto
        st.setInt(2, d.getIdProducto());
        st.setInt(3, d.getCantidad());
        st.setDouble(4, d.getSubtotal());
        st.executeUpdate();

        flag = true;
    } catch (Exception e) {
        System.out.println("Error al insertar un detalle de venta: " + e.getMessage());
        try {
            cn.rollback();
        } catch (Exception ex) {
            System.out.println("Error en el rollback: " + ex.getMessage());
        }
    } finally {
        if (cn != null) {
            try {
                //cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    return flag;
    }

    @Override
    public boolean update(DetalleVenta d) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            query = "UPDATE detalleventa SET cantidad = ?, subtotal = ? WHERE idDetalleVenta = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);

            st.setInt(1, d.getCantidad());
            st.setDouble(2, d.getSubtotal());
            st.setInt(3, d.getIdDetalleVenta());
            st.executeUpdate();

            flag = true;
        } catch (Exception e) {
            System.out.println("Error al actualizar un detalle de venta: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
                System.out.println("Error en el rollback: " + ex.getMessage());
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return flag;


    }

    @Override
    public boolean delete(int idDetalleVenta) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            query = "DELETE FROM detalleventa WHERE idDetalleVenta = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, idDetalleVenta);
            st.executeUpdate();

            flag = true;
        } catch (Exception e) {
            System.out.println("Error al eliminar un detalle de venta: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
                System.out.println("Error en el rollback: " + ex.getMessage());
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return flag;

    }

    @Override
    public DetalleVenta findById(int idDetalleVenta) {
        DetalleVenta detalle = null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * FROM detalleventa WHERE idDetalleVenta = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, idDetalleVenta);
            rs = st.executeQuery();

            if (rs.next()) {
                detalle = new DetalleVenta();
                Producto producto = new Producto();

                detalle.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                producto.setIdBebida(rs.getInt("Producto_id"));
                detalle.setProducto(producto);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setSubtotal(rs.getDouble("subtotal"));
            }
        } catch (Exception e) {
            System.out.println("Error al buscar un detalle de venta: " + e.getMessage());
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return detalle;
    }

    @Override
    public List<DetalleVenta> listByVentaId(int idVenta) {

        List<DetalleVenta> lista = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * FROM detalleventa WHERE Venta_id = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, idVenta);
            rs = st.executeQuery();

            while (rs.next()) {
                DetalleVenta detalle = new DetalleVenta();
                Producto producto = new Producto();

                detalle.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                producto.setIdBebida(rs.getInt("Producto_id"));
                detalle.setProducto(producto);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setSubtotal(rs.getDouble("subtotal"));
                lista.add(detalle);
            }
        } catch (Exception e) {
            System.out.println("Error al listar detalles de venta: " + e.getMessage());
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return lista;

    }

    @Override
    public List<DetalleVenta> listAll() {
        List<DetalleVenta> lista = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * " +
             "FROM detalleventa dv " +
             "JOIN venta v ON dv.Venta_id = v.idVenta " +
             "JOIN producto p ON dv.Producto_id = p.idproducto;";

            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                DetalleVenta dvAll = new DetalleVenta();
                dvAll.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                dvAll.setNombreProducto(rs.getString("categoria"));
                dvAll.setCantidad(rs.getInt("cantidad"));
                dvAll.setSubtotal(rs.getDouble("subtotal"));
                
                lista.add(dvAll);
            }
        } catch (Exception e) {
            System.out.println("Error al listar detalle ventas: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        }
        return lista;
    }

}
