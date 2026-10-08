
package Controler;

import java.util.List;
import model.Ventas;


public interface VentasDao {
    public boolean insert(Ventas ventas);
    public boolean Update(Ventas ventas);
    public Ventas serarchById(int id);
    public boolean delete(Ventas ventas);
    public List<Ventas> listAll();
    
}
