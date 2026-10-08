/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parametros;

/**
 *
 * @author tpp
 */
public class ParamsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Params p = new Params();

        //System.out.println("la suma es "+ p.sumar(14, 12));
        int result = p.sumar(14, 12);
        System.out.println("el resultado es:" + result);
        
        p.registrarPersona("Jhan Arly", "76767676");
        
    }

}
