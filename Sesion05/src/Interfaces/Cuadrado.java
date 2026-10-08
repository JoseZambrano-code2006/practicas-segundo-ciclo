/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author tpp
 */
public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double result = lado * lado;
        return result;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy Dibujando un cuadrado");
    }

}
