
package Test;

import Controler.VentasDao;
import Controlerimpl.Ventasimpl;
import Utils.ConexionSingleton;
import java.sql.*;
import java.util.List;
import model.Cliente;
import model.Productos;
import model.Ventas;
public class Test {

    public static void main(String[] args) {
         Test t = new Test();
         t.TestConnection();
        // t.Insert();
         t.ListVentas();
      //  t.Search();
    }
public void TestConnection(){
         ConexionSingleton c = new ConexionSingleton();
        try {
            Connection connection = c.getConnection();
            if(connection != null && !connection.isClosed()){
                System.out.println("Conexion success");
            }
        } catch (Exception e) {
            System.out.println("error" +e.getMessage());
            e.printStackTrace();
        }
    }
public void ListVentas(){
        VentasDao ventasdao = new Ventasimpl();
        
        List<Ventas> listaVentas = ventasdao.listAll();
        
        if(listaVentas !=null && !listaVentas.isEmpty()){
            for (Ventas ventas : listaVentas){
                System.out.println("idVentas" +ventas.getIdVentas());
                System.out.println("Fecha"+ ventas.getFecha());
                System.out.println("Hora" +ventas.getHora());
                System.out.println("Total" +ventas.getTotal());
                System.out.println("Cliente" +ventas.getCliente().getNombre());
                System.out.println("Producto" +ventas.getProductos().getDescripcion());
            }
        }
    }
public void Insert(){
        Ventas v = new Ventas();
        Cliente c = new Cliente();
        Productos p = new Productos();
        v.setFecha("22/10/24");
        v.setHora("3:10");
        v.setTotal("50");
        c.setIdCliente(1);
        p.setIdproductos(1);
        v.setCliente(c);
        v.setProductos(p);
        
        VentasDao ventasdao = new Ventasimpl();
        boolean result = ventasdao.insert(v);
        if(result){
            System.out.println("hechoo!!!");
        }else{
            System.out.println("Eror por mongol");
        }
        
        
    }
 public void UPdate (){
        Ventas v = new Ventas();
        Cliente c = new Cliente();
        Productos p = new Productos();
        v.setFecha("22/10/24");
        v.setHora("3:10");
        v.setTotal("50");
        c.setIdCliente(1);
        p.setIdproductos(1);
        v.setCliente(c);
        v.setProductos(p);
        v.setIdVentas(1);
        
        VentasDao ventasdao = new Ventasimpl();
        boolean result = ventasdao.Update(v);
        if(result){
            System.out.println("hechoo!!! actualizado");
        }else{
            System.out.println("Eror por mongol");
        }
 }
  public void Search(){
         VentasDao ventasdao = new Ventasimpl();
        
       Ventas ventas = ventasdao.serarchById(1);
        
        if(ventas !=null ){
            
                System.out.println("idVentas" +ventas.getIdVentas());
                System.out.println("Fecha"+ ventas.getFecha());
                System.out.println("Hora" +ventas.getHora());
                System.out.println("Total" +ventas.getTotal());
                System.out.println("Cliente" +ventas.getCliente().getNombre());
                
            }else{
            System.out.println("no existe");
        }
        
    }
  public void Delete(){
      Ventas v = new Ventas();
      v.setIdVentas(1);
      VentasDao ventasdao = new Ventasimpl();
      boolean result = ventasdao.delete(v);
      if(result) {
          System.out.println("Deleteado");
      } else{
          System.out.println("Error");
      }
  }
}


