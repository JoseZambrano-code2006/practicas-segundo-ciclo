/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion01;

/**
 *
 * @author tpp
 */
public class Sesion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicacion: " + multiplicar(a, b));
        System.out.println("Division: " + dividir(a, b));

    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }

}
