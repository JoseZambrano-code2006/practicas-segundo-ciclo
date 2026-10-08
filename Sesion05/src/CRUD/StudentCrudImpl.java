/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tpp
 */
public class StudentCrudImpl implements Crud<Student> {

    private List<Student> st = new ArrayList<>();

    @Override
    public void create(Student e) {
        st.add(e);
    }

    @Override
    public Student view(int id) {
        for (Student student : st) {
            if (student.getId() == id) {
                return student;
            }

        }
        return null;

    }

    @Override
    public void update(Student e) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getId() == e.getId()) {
                st.set(i,e);
                return;
            } 
        }
        
    }

    @Override
    public void delete(int id) {
        st.removeIf(Student -> Student.getId() == id);
    }

}
