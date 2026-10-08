/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ejemplo de uso: calcular el área de un triángulo y un rectángulo
        double areaTriangulo = calcularArea("Triangulo", 5, 10);
        System.out.println("Área del Triángulo: " + areaTriangulo);

        double areaRectangulo = calcularArea("Rectangulo", 5, 10);
        System.out.println("Área del Rectángulo: " + areaRectangulo);
    }
    public static double calcularArea(String tipo, double base, double altura) {
        if (tipo.equalsIgnoreCase("Triangulo")) {
            return (base * altura) / 2; // Fórmula del área del triángulo
        } else if (tipo.equalsIgnoreCase("Rectangulo")) {
            return base * altura; // Fórmula del área del rectángulo
        } else {
            System.out.println("Tipo de polígono no soportado.");
            return -1; // Retorna -1 si el tipo no es soportado
        }
    }
}
