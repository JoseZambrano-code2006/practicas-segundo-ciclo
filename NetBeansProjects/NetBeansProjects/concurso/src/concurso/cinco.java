/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str1 = "hola"; // Define la primera cadena
        String str2 = "mundo"; // Define la segunda cadena
        imprimirDiferencias(str1, str2); // Llama al método imprimirDiferencias
    }

    /**
     * Imprime los caracteres que están en una cadena pero no en la otra.
     * @param str1 La primera cadena de entrada.
     * @param str2 La segunda cadena de entrada.
     */
    public static void imprimirDiferencias(String str1, String str2) { // Define el método imprimirDiferencias
        String out1 = ""; // Inicializa out1 como una cadena vacía
        String out2 = ""; // Inicializa out2 como una cadena vacía

        // Bucle para encontrar caracteres de str1 que no están en str2
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i); // Obtiene el carácter en la posición i de str1
            if (str2.indexOf(c) == -1) { // Si el carácter no está en str2
                out1 += c; // Añade el carácter a out1
            }
        }

        // Bucle para encontrar caracteres de str2 que no están en str1
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i); // Obtiene el carácter en la posición i de str2
            if (str1.indexOf(c) == -1) { // Si el carácter no está en str1
                out2 += c; // Añade el carácter a out2
            }
        }

        // Imprime los resultados
        System.out.println("Out1: " + out1); // Muestra los caracteres únicos de str1
        System.out.println("Out2: " + out2); // Muestra los caracteres únicos de str2
    }
    
}
