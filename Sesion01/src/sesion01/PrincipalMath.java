/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion01;

/**
 *
 * @author tpp
 */
public class PrincipalMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mathematical_operations math = new Mathematical_operations(10, 5);
        
        System.out.println("Addition: " + math.sumar());
        System.out.println("Subtraction: " + math.restar());
        System.out.println("Multiplication: " + math.multiplicar());
        System.out.println("Division: " + math.dividir());
    }
    
}
