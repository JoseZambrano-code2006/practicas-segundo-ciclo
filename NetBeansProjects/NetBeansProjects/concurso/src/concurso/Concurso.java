/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Concurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       int n;
       String orden;
        
        Scanner SC = new Scanner(System.in);

        // Solicitar los elementos de la matriz
        System.out.println("Numero de elementos:");
        n = SC.nextInt();

        int[] matriz = new int[n];
        System.out.println("Introduce los " + n + " elementos:");
        
        for (int i = 0; i < n; i++) {
            matriz[i] = SC.nextInt();
        }

        // Solicitar el tipo de orden
        System.out.println("Introduce el tipo de orden ('Asc' para ascendente, 'Desc' para descendente):");
        orden = SC.next();

        // Llamada a la función para ordenar la matriz
        ordenarMatriz(matriz, orden);

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i] + " ");
        }

        SC.close();
    }

    // Función para ordenar la matriz
    public static void ordenarMatriz(int[] matriz, String orden) {
        // Implementación del algoritmo de burbuja para ordenar
        boolean swapped;
        int n = matriz.length;

        // Realizamos el ordenamiento usando el algoritmo de burbuja
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                boolean condition = orden.equals("Asc") ? matriz[j] > matriz[j + 1] : matriz[j] < matriz[j + 1];

                if (condition) {
                    // Intercambiar los elementos si no están en el orden correcto
                    int temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambio en una pasada, la matriz ya está ordenada
            if (!swapped) {
                break;
            }
        }
    }

}

