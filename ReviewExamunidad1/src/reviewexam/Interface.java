/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reviewexam;

/**
 *
 * @author tpp
 */
public interface Interface <T> {
    
    public void create(T obj);
    public T read(int id);
    public void update(T obj);
    public void delete (int id);
    
    
    
}
