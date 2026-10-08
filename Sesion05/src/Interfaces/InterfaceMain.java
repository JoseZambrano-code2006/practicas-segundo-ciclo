/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

/**
 *
 * @author tpp
 */
public class InterfaceMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Cuadrado cr = new Cuadrado(4);
        
      // el area del cuadrado
        System.out.println("El area del circulo es: "+c.calcularArea());
         c.dibujar();
        c.rotar();
        System.out.println("---------------");
        System.out.println("El area del cuadrado es: "+cr.calcularArea());
        cr.dibujar();
    }
    
}
