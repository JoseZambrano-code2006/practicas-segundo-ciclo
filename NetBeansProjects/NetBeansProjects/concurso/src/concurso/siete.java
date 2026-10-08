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
public class siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es un número de Armstrong: ");
        int numero = scanner.nextInt();

        if (esNumeroArmstrong(numero)) {
            System.out.println(numero + " es un número de Armstrong.");
        } else {
            System.out.println(numero + " no es un número de Armstrong.");
        }

        scanner.close();
    }

    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int temp = numero;
        int digitos = String.valueOf(numero).length(); // Cuenta los dígitos usando el tamaño de la cadena

        // Calcula la suma de cada dígito elevado a la cantidad de dígitos
        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, digitos); // Eleva el dígito al número de dígitos y suma
            temp /= 10; // Quita el último dígito de temp
        }

        return suma == numero; // Verifica si la suma es igual al número original
    }

    }
    

