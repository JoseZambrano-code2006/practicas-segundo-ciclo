/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      String cadena = "Hola mundo"; // Define la cadena de texto a invertir
        String invertida = invertir(cadena); // Llama al método invertir con la cadena como argumento
        System.out.println(invertida); // Muestra la cadena invertida
    }


    public static String invertir(String cadena) { // Método que invierte la cadena manualmente
        char[] caracteres = new char[cadena.length()]; // Crea un array de caracteres del mismo tamaño que la cadena
        int longitud = cadena.length(); // Obtiene la longitud de la cadena

        // Bucle que recorre la cadena de atrás hacia adelante
        for (int i = 0; i < longitud; i++) { 
            caracteres[i] = cadena.charAt(longitud - 1 - i); // Coloca cada carácter en el array de caracteres en posición invertida
        }

        // Convierte el array de caracteres a una cadena y la retorna
        String resultado = "";
        for (char c : caracteres) { // Recorre cada carácter en el array
            resultado += c; // Añade cada carácter al resultado
        }
        
        return resultado; // Retorna la cadena invertida
    }
    
}
