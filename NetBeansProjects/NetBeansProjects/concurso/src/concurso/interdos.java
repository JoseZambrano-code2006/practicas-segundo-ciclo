/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class interdos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Imprimir los números primos entre 1 y 20
        System.out.println("Números primos entre 1 y 20:");
        for (int i = 1; i <= 20; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por algún número menor, no es primo
            }
        }
        return true; // Es primo si no tiene divisores aparte de 1 y el mismo número
    }
    
}
