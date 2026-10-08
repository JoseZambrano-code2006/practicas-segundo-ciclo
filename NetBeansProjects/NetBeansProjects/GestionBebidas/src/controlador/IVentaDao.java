/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.List;
import model.Ventas;


public interface IVentaDao {
    
    
    
    // Crea una nueva venta en la base de datos.
    public boolean insert(Ventas v);

    //Buscar una venta por su ID único.
    public Ventas findById(int id);

    //Lista todas las ventas realizadas.
    public List<Ventas> listAll();

    // Lista todas las ventas realizadas por un cliente.
    public List<Ventas> listByCliente(int idCliente);

    //Calcula el total de una venta. 
    public double calculateTotal(int id);
    
}
