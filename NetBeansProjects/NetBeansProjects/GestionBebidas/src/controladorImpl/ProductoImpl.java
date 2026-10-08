package controladorImpl;

import controlador.IProductoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Producto;
import utils.ConexionSingleton;

public class ProductoImpl implements IProductoDao {

    private Connection cn;
    private ConexionSingleton conexionDB = new ConexionSingleton();

    //Inserta un nuevo producto en la base de datos.
    @Override
    public boolean insert(Producto p) {

        boolean flag = false;

        PreparedStatement st;
        //dclaro la variable que va contener la consulta a la base de datos
        String query = null;

        try {
            query = "INSERT INTO producto (codigo,categoria, marca, tamaño, tipo, cantidadDisponible, precio, estado) VALUES (?,?,?,?,?,?,?,?);";

            cn = conexionDB.getConnection();
            st = cn.prepareStatement(query);

            st.setString(1, p.getCodigo());
            st.setString(2, p.getCategoria());
            st.setString(3, p.getMarca());
            st.setString(4, p.getTipo());
            st.setString(5, p.getTamaño());
            st.setInt(6, p.getCantidadDisponible());
            st.setDouble(7, p.getPrecio());
            st.setString(8, p.getEstado());
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al insertar una bebida" + e.getMessage());
            try {
                //cn.rollback();
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

    //Actualiza los datos de un producto existente.
    @Override
    public boolean update(Producto p) {
         boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            query = "UPDATE producto SET codigo = ?, categoria = ?, marca = ?, tipo = ?, tamaño = ?, cantidadDisponible = ?, precio = ?, estado = ? WHERE idproducto = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setString(1, p.getCodigo());
            st.setString(2, p.getCategoria());
            st.setString(3, p.getMarca());
            st.setString(4, p.getTipo());
            st.setString(5, p.getTamaño());
            st.setInt(6, p.getCantidadDisponible());
            st.setDouble(7, p.getPrecio());
            st.setString(8, p.getEstado());
            st.setInt(9, p.getIdBebida());
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al actualizar un producto: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;

    }

    //Busca un producto por su ID único.
    @Override
    public Producto findById(int id) {
         Producto producto = null;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * FROM producto WHERE idproducto = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                producto = new Producto();
                producto.setIdBebida(rs.getInt("idproducto"));
                producto.setCodigo(rs.getString("codigo"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setMarca(rs.getString("marca"));
                producto.setTipo(rs.getString("tipo"));
                producto.setTamaño(rs.getString("tamaño"));
                producto.setCantidadDisponible(rs.getInt("cantidadDisponible"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(rs.getString("estado"));
            }
        } catch (Exception e) {
            System.out.println("Error al buscar un producto: " + e.getMessage());
            try {
                //cn.rollback();
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
        return producto;
    }

    //Elimina un producto de la base de datos.
    @Override
    public boolean delete(int idBebida) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            query = "DELETE FROM producto WHERE idproducto = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, idBebida);
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al eliminar un producto: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                   // cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;    

    }

    //Lista todos los productos registrados en la base de datos.
    @Override
    public List<Producto> listAll() {
       List<Producto> lista = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT * FROM producto;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdBebida(rs.getInt("idproducto"));
                producto.setCodigo(rs.getString("codigo"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setMarca(rs.getString("marca"));
                producto.setTipo(rs.getString("tipo"));
                producto.setTamaño(rs.getString("tamaño"));
                producto.setCantidadDisponible(rs.getInt("cantidadDisponible"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(rs.getString("estado"));
                lista.add(producto);
            }
        } catch (Exception e) {
            System.out.println("Error al listar productos: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        }
        return lista;

    }

    //Busca producto por codigo.
    @Override
    public Producto findByCodigo(String codigo) {
    Producto producto = null;
    PreparedStatement st;
    ResultSet rs;
    String query = null;

    try {
        query = "SELECT * FROM producto WHERE codigo = ?;";
        cn = ConexionSingleton.getConnection();
        st = cn.prepareStatement(query);
        st.setString(1, codigo);
        rs = st.executeQuery();
        if (rs.next()) {
            producto = new Producto();
            producto.setIdBebida(rs.getInt("idproducto"));
            producto.setCodigo(rs.getString("codigo"));
            producto.setCategoria(rs.getString("categoria"));
            producto.setMarca(rs.getString("marca"));
            producto.setTipo(rs.getString("tipo"));
            producto.setTamaño(rs.getString("tamaño"));
            producto.setCantidadDisponible(rs.getInt("cantidadDisponible"));
            producto.setPrecio(rs.getDouble("precio"));
            producto.setEstado(rs.getString("estado"));
        }
    } catch (Exception e) {
        System.out.println("Error al buscar producto por código: " + e.getMessage());
        try {
            //cn.rollback();
        } catch (Exception ex) {
        }
    } finally {
        if (cn != null) {
            try {
               // cn.close();
            } catch (Exception e) {
            }
        }
    }
    return producto;

    }

    //verificar si un producto tiene cantidad disponibles
    @Override
    public boolean verificar(int id) {
       boolean flag = false;
        PreparedStatement st;
        ResultSet rs;
        String query = null;

        try {
            query = "SELECT cantidadDisponible FROM producto WHERE idproducto = ?;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next() && rs.getInt("cantidadDisponible") > 0) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("Error al verificar cantidad del producto: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                   // cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;

    }

    //Reduce la cantidad de un producto.
    @Override
    public boolean reducir(int cantidad, int idproducto) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            
            query = "UPDATE producto "
             + "SET cantidadDisponible = cantidadDisponible - ? "
             + "WHERE idproducto = ? AND cantidadDisponible >= 1;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, cantidad);
            st.setInt(2, idproducto);
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al reducir cantidad del producto: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                   // cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;
    }

    @Override
    public boolean aumenta(int id, int cantidad) {
        boolean flag = false;
        PreparedStatement st;
        String query = null;

        try {
            
            query = "UPDATE producto "
             + "SET cantidadDisponible = cantidadDisponible + ? "
             + "WHERE idproducto = ? AND cantidadDisponible >= 1;";
            cn = ConexionSingleton.getConnection();
            st = cn.prepareStatement(query);
            st.setInt(1, cantidad);
            st.setInt(2, id);
            st.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error al aumentar cantidad del producto: " + e.getMessage());
            try {
                //cn.rollback();
            } catch (Exception ex) {
            }
        } finally {
            if (cn != null) {
                try {
                   // cn.close();
                } catch (Exception e) {
                }
            }
        }
        return flag;
    }

}
