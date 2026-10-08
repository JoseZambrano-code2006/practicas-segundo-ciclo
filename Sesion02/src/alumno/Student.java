/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;

/**
 *
 * @author tpp
 */
public class Student {
    //Atribute
    int ID;
    String code;
    String name;
    String lastname;
    
    
    //methods
    void ViewStuden(){ // Sin parametros
        System.out.println("I'm Andre");   
  
        
    }
      void KnowAprroval(double Calification){ //con parametropara enviar de tipo double
          if(Calification >= 12.5 ){
              System.out.println("Succesfully - Aprobado");
          } else{
              System.out.println(" See you next Cicle - Go back - Ya jalaste pe mano");
          }
    }
    
}
    
    
