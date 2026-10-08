
import Utils.ConexionSingleton;
import java.sql.Connection;


public class Test {

  
    public static void main(String[] args) {
      
      Test t = new Test();
      t.testConexion();
}
         
        public void testConexion() {

        ConexionSingleton c = new ConexionSingleton();
        try {
            Connection connection = c.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexion satisfatoria");
            } else {
                System.out.println("No se puede establecer conexion");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion" + e.getMessage());
            e.printStackTrace();
        }
     }       
}