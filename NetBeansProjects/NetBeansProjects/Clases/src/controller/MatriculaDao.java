/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.Matricula;

/**
 *
 * @author USER
 */
public interface MatriculaDao {
    
       //metod para insert una reserva
    public boolean insert(Matricula m);
    //metodo para actualizar
    public boolean update(Matricula m);
    //metodo para buscar por Id
    public Matricula searchById(int id);
    //metodo para eliminar la reserva
    public boolean delete(Matricula m);
    //metodo para listar las reservas
    public List<Matricula> listAll();
    
    
}
