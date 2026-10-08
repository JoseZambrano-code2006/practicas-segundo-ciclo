package Utils;

import java.sql.*;

public class ConexionSingleton {

    public static Connection connection;

    public static Connection getConnection() {

        try {
            if (connection == null) {
                Runtime.getRuntime().addShutdownHook(new getClose());
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/poo", "root", "zambrano200604");
            }
            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("conexion faliida", e);
        }
    }

    static class getClose extends Thread {

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
