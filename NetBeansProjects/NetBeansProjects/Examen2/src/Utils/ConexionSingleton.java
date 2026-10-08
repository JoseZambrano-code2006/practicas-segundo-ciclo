

package Utils;


import java.sql.*;

public class ConexionSingleton {

    //creamos ina variable estatica crenxion y un metodo getconexion
    public static Connection connection;

    public static Connection getConnection() {

        try {
            if (connection == null) {
            Runtime.getRuntime().addShutdownHook(new getClose());
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/examen","root","zambrano200604");
                System.out.println("Entro al if");
            }
            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Conexion fallida", e);
        }
     
       
}
     static class getClose extends Thread{

        @Override
        public void run() {
            try {
                Connection conn = ConexionSingleton.getConnection();
                conn.close();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
    
           }
        }
         
            
       }
