/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo2;

/**
 *
 * @author tpp
 */
public class PagarTarjeta extends Pago{
    private String numeroTarjeta;

    public PagarTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesado el pago de S/. "+monto+"con tarjeta numero" + numeroTarjeta);
    }
    
    
}
