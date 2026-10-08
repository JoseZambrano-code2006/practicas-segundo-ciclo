
import Controller.MatriculaDao;
import ControllerImpl.MtriculaDaoImpl;
import Utils.ConexionSingleton;
import java.sql.Connection;
import java.util.List;
import model.Curso;
import model.Estudiante;
import model.Matricula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tpp
 */
public class Test {

    public static void main(String[] args) {
        
        Test t = new Test();
        //t.testConexion();
        //t.insert();
        t.listMatricula();
        
    }
 
    public void testConexion() {
        ConexionSingleton c = new ConexionSingleton();
        try {
            Connection connection = c.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexion satisfatoria");
            } else {
                System.out.println("No se puede establecer conexion");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion" + e.getMessage());
            e.printStackTrace();
        }
    }
    public void insert() {

        Matricula m = new Matricula();
        Estudiante e = new Estudiante();
        Curso c = new Curso();
        
        
         e.setIdEstudiante(1);
         m.setEstudiante(e);
         
         c.setIdCurso(1);
         m.setCurso(c);
        m.setHoras("10");
        m.setCreditos("10");
        m.setEstado("activo");

        MatriculaDao mDao = new MtriculaDaoImpl();
        boolean result = mDao.crear(m);

        if (result) {
            System.out.println("success!!!");
        } else {
            System.out.println("error");
        }

    }
    
     public void listMatricula() {
        MatriculaDao mDao = new MtriculaDaoImpl();

         List<Matricula> listaMatriculas = mDao.listAll();
        if (listaMatriculas != null && !listaMatriculas.isEmpty()) {
            for (Matricula matricula : listaMatriculas) {
                System.out.println("curso: " + matricula.getCurso().getNombre());
                System.out.println("estudiante: " + matricula.getEstudiante().getNombreCompleto());
                System.out.println("horas: " + matricula.getHoras());
                System.out.println("creditos : " + matricula.getCreditos());
                System.out.println("estado: " + matricula.getEstado());
            }
        }

    }
}
