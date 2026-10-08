/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion01;

/**
 *
 * @author tpp
 */
public class Mathematical_operations {

    //Declaración de variables
    int a;
    int b;

    //Constructor
    public Mathematical_operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sumar() {
        return a + b;
    }

    int restar() {
        return a - b;
    }

    int multiplicar() {
        return a * b;
    }

    int dividir() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }

}
