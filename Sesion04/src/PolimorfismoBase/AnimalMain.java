/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PolimorfismoBase;

/**
 *
 * @author tpp
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando instancias de diferentes tipos de animales
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        
        hacerSonidoAnimal(miPerro);
        hacerSonidoAnimal(miGato);

    }

    // Método que utiliza polimorfismo
    public static void hacerSonidoAnimal(Animal animal) {
        animal.hacerSonido();
    }
}
