/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

import java.util.Arrays;

public class interuno {

  
    public static void main(String[] args) {
        String palabra1 = "congreso";
        String palabra2 = "sogrecon";

        boolean esAnagrama = sonAnagramas(palabra1, palabra2);
        System.out.println("¿Son anagramas? " + esAnagrama);
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false; // Si no tienen la misma longitud, no pueden ser anagramas
        }

        // Convierte las palabras a arreglos de caracteres y los ordena
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Compara los arreglos ordenados
        return Arrays.equals(letras1, letras2);
    }
}

