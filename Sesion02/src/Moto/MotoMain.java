/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Moto;

/**
 *
 * @author tpp
 */
public class MotoMain {

    public static void main(String[] args) {
      
        
        Moto motoXTZ = new Moto(250, 300, "Red", 2);
        //el metodo this lo guarda publicamente
        System.out.println("------------------------------------------------");
        System.out.println("MotoXTZ");
        System.out.println("velocidad:" + motoXTZ.velocidad);
        System.out.println("color:" + motoXTZ.color);
        System.out.println("cilindraje:" + motoXTZ.cilindraje);
        System.out.println("Limite de Pasajeros:" + motoXTZ.limitePasajeros);

        motoXTZ.acelerar();
        motoXTZ.apagar();
        motoXTZ.ecender();
        motoXTZ.girar("right");
        
        
        
        System.out.println("------------------------------------------------");
        System.out.println("MotoXR");
        Moto MotoXR = new Moto(400, 500, "Blue", 4);
         System.out.println("velocidad:" + MotoXR.velocidad);
        System.out.println("color:" + MotoXR.color);
        System.out.println("cilindraje:" + MotoXR.cilindraje);
        System.out.println("Limite de Pasajeros:" + MotoXR.limitePasajeros);
        System.out.println("------------------------------------------------");

    }

}
