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


public class boyer {

    public static void main(String[] args) {
        Scanner notita = new Scanner(System.in);
        
        System.out.println("ingrese primera nota");
        double notauno = notita.nextDouble();
        System.out.println("ingrese segunda nota");
        double notados = notita.nextDouble();
        System.out.println("ingrese tercera nota");
        double notatres = notita.nextDouble();
        
        double promedio = (notauno + notados + notatres)/3;
        
        if(promedio>= 17){   System.out.println("el alumno aprueba con promedio de" + notita); }
    else{
            System.out.println("el alumno desaprueba con promedio de" + notita);
}
    notita.close();
}}

     

