/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.VentaBebida;

/**
 *
 * @author user
 */
public interface IVentaBebidaDao {
    
       // Método para registrar un detalle de bebida en una venta
    public boolean registrarVentaBebida(VentaBebida ventaBebida);
    
    // Método para obtener todos los detalles de bebidas para una venta específica
    public List<VentaBebida> obtenerBebidasPorVentaID(int ventaId);
    
    
}
