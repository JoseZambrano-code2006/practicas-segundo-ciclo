/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAbstract;

/**
 *
 * @author tpp
 */
public abstract class Figura {
    
    protected  double x; // pos en x
    protected  double y; // pos en y
    
    // en una clase abtracta si se puede usar constructores pero solo lo puede usar sus hijos
    protected Figura() {    
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
//declaro el metodo abstracto
    public abstract double calcularArea();
    
}
