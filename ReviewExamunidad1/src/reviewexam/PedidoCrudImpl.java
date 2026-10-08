/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewexam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tpp
 */
public class PedidoCrudImpl implements Interface<Pedido>{
    
    private List<Pedido> pedido = new ArrayList<>();
    

    @Override
    public void create(Pedido p) {
        pedido.add(p);
    }

    @Override
    public Pedido read(int id) {
        for (Pedido p1 : pedido) {
            if (p1.getId() == id) {
                return p1;
            }
        }
        return null;
    }

    @Override
    public void update(Pedido p) {
        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).getId() == p.getId()) {
                pedido.set(i, p);
                return;
            }
   
        }
    }

    @Override
    public void delete(int id) {
        
        pedido.removeIf(pedido -> pedido.getId() == id);
    }
    
    
}
