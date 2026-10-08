/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

/**
 *
 * @author tpp
 */
public class PagoPaypal extends Pago{
    private String cuentaPaypal;

    public PagoPaypal(String cuentaPaypal) {
        this.cuentaPaypal = cuentaPaypal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago de S/." +monto+"con cuenta Paypal: "+cuentaPaypal);
           }
    
    
}
