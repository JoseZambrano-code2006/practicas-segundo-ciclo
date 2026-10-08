/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class ocho {


    public static void main(String[] args) {
        String texto = "hola mundo desde java"; // Ejemplo de cadena de entrada
        System.out.println(capitalizar(texto));
    }

    public static String capitalizar(String texto) {
        String resultado = ""; // Variable para almacenar el resultado
        boolean nuevaPalabra = true; // Indicador de nueva palabra

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); // Obtiene el carácter actual
            if (nuevaPalabra && Character.isLetter(c)) { // Si es el inicio de una nueva palabra
                resultado += (char)(c - 32); // Convierte el carácter a mayúscula y lo agrega a resultado
                nuevaPalabra = false; // Ya no es el inicio de una nueva palabra
            } else {
                resultado += c; // Agrega el carácter tal como está
            }
            if (c == ' ') { // Si encuentra un espacio, la siguiente letra es el inicio de una nueva palabra
                nuevaPalabra = true;
            }
        }

        return resultado; // Retorna el resultado capitalizado
    }


    }
    

