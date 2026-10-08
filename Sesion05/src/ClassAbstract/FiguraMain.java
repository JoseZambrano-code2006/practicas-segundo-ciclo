/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassAbstract;

/**
 *
 * @author tpp
 */
public class FiguraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         // Crear instancia de Circulo
        Circulo circulo = new Circulo(5, 10, 10);
        // Crear instancia de Cuadrado
        Cuadrado cuadrado = new Cuadrado(4, 15, 15);
        
        // Calcular y mostrar el área del círculo
        System.out.println("Área del círculo: " + circulo.calcularArea());
        
        // Calcular y mostrar el área del cuadrado
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
    
}
