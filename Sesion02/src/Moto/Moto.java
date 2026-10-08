/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moto;

/**
 *
 * @author tpp
 */
public class Moto {

    //atributos - Caractristicas de la clase
    int velocidad;
    int cilindraje;
    String color;
    int limitePasajeros;
//Genero un constructor / click derechos/ insert code/Constructor

    public Moto(int velocidad, int cilindraje, String color, int limitePasajeros) {
        this.velocidad = velocidad;
        this.cilindraje = cilindraje;
        this.color = color;
        this.limitePasajeros = limitePasajeros;

    }
//lo mismo con los getter and selet // metodos(comportamientos)

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLimitePasajeros() {
        return limitePasajeros;
    }

    public void setLimitePasajeros(int limitePasajeros) {
        this.limitePasajeros = limitePasajeros;
    }

    public void acelerar() {
        System.out.println("La moto esta Acelerando más de lo que imaginas.");
    }

    public void apagar() {
        System.out.println("La moto esta Apagada, espera a que la enciendan.");
    }

    public void ecender() {
        System.out.println("La moto esta Ecendida. ¡URRA!");
    }

    public void girar(String direccion) {
        System.out.println("La moto esta girando hacia la" + direccion);
    }

}
