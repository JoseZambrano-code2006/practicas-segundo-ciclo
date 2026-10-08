/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author tpp
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado e = new Empleado();
       
       //Verificar Herencia
       e.getNombre();
       e.getCargo();
       
       Consultor c = new Consultor();
       c.getCode_consultor();
       c.getNombre();
       
       Persona vector [] = new Persona[5];
       vector[0] = new Persona();
       vector[1] = new Empleado();
       vector[2] = new Consultor();
       vector[3] = new Jefe();
//       vector[4] = "Hola";//error
       
      Persona per = new Persona();
      Consultor cl = new Consultor();
      
      per = cl; // se puede asignar un hijo a su papa, no al reves 
      
    }
    
}
