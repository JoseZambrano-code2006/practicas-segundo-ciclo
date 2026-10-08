package controladorImpl;

import controlador.IVentaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Ventas;
import model.Cliente;
import utils.ConexionSingleton;

public class VentaImpl implements IVentaDao {

    private Connection cn;

    // Crea una nueva venta en la base de datos.
    @Override
    public boolean insert(Ventas v) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            query = "INSERT INTO venta (Cliente_id, fecha, total) VALUES (?, ?, ?);";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);

            st.setInt(1, v.getClienteID().getIdCliente());
            st.setDate(2, java.sql.Date.valueOf(v.getFecha()));
            st.setDouble(3, v.getTotal());
            st.executeUpdate();

            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar una venta: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;

    }

    //Buscar una venta por su ID único.
    @Override
    public Ventas findById(int id) {
        Ventas venta = null;
        Cliente cliente;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT v.idVenta, v.fecha, v.total, c.idCliente, c.nombre, c.apellidos, c.dni FROM venta v "
                    + "INNER JOIN cliente c ON v.Cliente_id = c.idCliente WHERE v.idVenta = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                venta = new Ventas();
                cliente = new Cliente();

                venta.setIdventa(rs.getInt("idVenta"));
                venta.setFecha(rs.getString("fecha"));
                venta.setTotal(rs.getDouble("total"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDni(rs.getString("dni"));

                venta.setClienteID(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar una venta por ID: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                }
            }
        }
        return venta;

    }

    //Lista todas las ventas realizadas.
    @Override
    public List<Ventas> listAll() {
        List<Ventas> lista = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT v.idVenta, v.fecha, v.total, c.idCliente, c.nombre, c.apellidos, c.dni FROM venta v "
                    + "INNER JOIN cliente c ON v.Cliente_id = c.idCliente;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();

            while (rs.next()) {
                Ventas venta = new Ventas();
                Cliente cliente = new Cliente();

                venta.setIdventa(rs.getInt("idVenta"));
                venta.setFecha(rs.getString("fecha"));
                venta.setTotal(rs.getDouble("total"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDni(rs.getString("dni"));

                venta.setClienteID(cliente);
                lista.add(venta);
            }
        } catch (Exception e) {
            System.out.println("Error al listar todas las ventas: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                }
            }
        }
        return lista;
    }

    // Lista todas las ventas realizadas por un cliente.
    @Override
    public List<Ventas> listByCliente(int idCliente) {

        List<Ventas> lista = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT v.idVenta, v.fecha, v.total, c.idCliente, c.nombre, c.apellidos, c.dni FROM venta v "
                    + "INNER JOIN cliente c ON v.Cliente_id = c.idCliente WHERE c.idCliente = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, idCliente);
            rs = st.executeQuery();

            while (rs.next()) {
                Ventas venta = new Ventas();
                Cliente cliente = new Cliente();

                venta.setIdventa(rs.getInt("idVenta"));
                venta.setFecha(rs.getString("fecha"));
                venta.setTotal(rs.getDouble("total"));

                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDni(rs.getString("dni"));

                venta.setClienteID(cliente);
                lista.add(venta);
            }
        } catch (Exception e) {
            System.out.println("Error al listar ventas por cliente: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                }
            }
        }
        return lista;

    }
    //Calcula el total de una venta. 

    @Override
    public double calculateTotal(int id) {
           double total = 0;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT SUM(d.subtotal) AS total FROM detalle_venta d WHERE d.Venta_id = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                total = rs.getDouble("total");
            }
        } catch (Exception e) {
            System.out.println("Error al calcular el total de una venta: " + e.getMessage());
            try {
                cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    //cn.close();
                } catch (Exception e) {
                }
            }
        }
        return total;
    }     
        
    }


