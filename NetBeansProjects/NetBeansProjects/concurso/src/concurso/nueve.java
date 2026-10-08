/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

/**
 *
 * @author USER
 */
public class nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dias = 0;
        int horas = 0;
        int minutos = 2;
        int segundos = 1;
        

        // Conversiones a milisegundos
        int milisegundosDias = dias * 24 * 60 * 60 * 1000;
        int milisegundosHoras = horas * 60 * 60 * 1000;
        int milisegundosMinutos = minutos * 60 * 1000;
        int milisegundosSegundos = segundos * 1000;

        // Suma total de milisegundos
        int totalMilisegundos = milisegundosDias + milisegundosHoras + milisegundosMinutos + milisegundosSegundos;

        System.out.println("Resultado en milisegundos: " + totalMilisegundos);
    }

    }
    

