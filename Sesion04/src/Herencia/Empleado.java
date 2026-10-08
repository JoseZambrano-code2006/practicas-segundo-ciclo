/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author tpp
 */
public class Empleado extends Persona{
    int num_legajo;
    String Cargo;
    Double Sueldo;

    public Empleado() {
    }

    public Empleado(int num_legajo, String Cargo, Double Sueldo, int id, String dni, String nombre, String apellido, String direccion, String telefono) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.num_legajo = num_legajo;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
    
}
