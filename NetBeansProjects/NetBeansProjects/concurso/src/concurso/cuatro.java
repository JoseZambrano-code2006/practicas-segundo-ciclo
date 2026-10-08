/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class cuatro {

    public static void main(String[] args) {
       int numeroDecimal = 10; // Define el número decimal a convertir
        String binario = convertirABinario(numeroDecimal); // Llama al método convertirABinario
        System.out.println("El número " + numeroDecimal + " en binario es: " + binario); // Muestra el número binario
    }

    /**
     * Convierte un número decimal a binario sin usar métodos automáticos del lenguaje.
     * @param numero El número decimal que queremos convertir.
     * @return Una cadena que representa el número en binario.
     */
    public static String convertirABinario(int numero) { // Método que convierte un número decimal a binario
        String resultado = ""; // Inicializa una cadena vacía para almacenar el resultado

        // Bucle que realiza la conversión dividiendo el número por 2 hasta llegar a 0
        while (numero > 0) {
            int residuo = numero % 2; // Obtiene el residuo de la división entre 2 (0 o 1)
            resultado = residuo + resultado; // Añade el residuo al inicio de la cadena resultado
            numero = numero / 2; // Actualiza el número dividiéndolo entre 2
        }

        return resultado; // Retorna el número binario como una cadena
    }
    
}
