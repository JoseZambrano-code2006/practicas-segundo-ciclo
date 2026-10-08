/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo2;

/**
 *
 * @author tpp
 */
public class PagoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pago pagoTarjeta = new PagarTarjeta("1234-5678-9012-3456");
      Pago pagoPaypal = new PagoPaypal("user@paypal.com");
      
      // uso del polimorfismo
         procesarPago(pagoPaypal, 100);
         procesarPago(pagoTarjeta, 150);
        
        
    }
    public static void procesarPago(Pago metodoPago, double monto){
        metodoPago.procesarPago(monto);
          
      }
    
}
