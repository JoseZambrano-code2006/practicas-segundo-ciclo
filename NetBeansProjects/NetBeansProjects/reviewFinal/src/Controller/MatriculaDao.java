/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import java.util.List;
import model.Matricula;

/**
 *
 * @author tpp
 */
public interface MatriculaDao {
    
    //metod para insert una matricula
    public boolean crear(Matricula m);
    //metodo para actualizar
    public boolean actualizar(Matricula m);
    //metodo para buscar por Id
    public Matricula buscar(int id);
    //metodo para eliminar la matricula
    public boolean delete(Matricula m);
    //metodo para listar las reservas
    public List<Matricula> listAll();
    
    
}
