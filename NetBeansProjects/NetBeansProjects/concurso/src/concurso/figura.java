/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class figura {

    public static void main(String[] args) {
        System.out.println("\ncuadrado");
        cuadrado(5);
        System.out.println("\ntriangulo");
       triangulo(10);
       }
    public static void cuadrado (int lado){
        for (int i = 0; i < lado; i++) {
                 for (int j = 0; j < lado; j++){
                System.out.print("*");
                
            } System.out.println();
            
        }
    }
    public static void triangulo(int lado){
    
        for (int i = 1; i < lado; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    
    }

}
