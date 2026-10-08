/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.bebidas;

import controller.IBebidaDao;
import controllerImpl.BebidaDaoImpl;
import model.Bebida;

/**
 *
 * @author USER
 */
public class MainBebidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         IBebidaDao  dao=new BebidaDaoImpl();
        // INSERTAR
       /* Bebida bedida=new Bebida(0,"Pepsi","soda","grande",2,10);
        
       
        int flag= dao.agregar(bedida);
        System.out.println(flag);*/
        
         // ACTUALIZAR
        Bebida bedidaActualizar=new Bebida(1, "1111","Pepsi","soda","grande",50,10);
        
       
        boolean flagActualizar= dao.actualizar(bedidaActualizar);
        System.out.println(flagActualizar);
    }
    
}
