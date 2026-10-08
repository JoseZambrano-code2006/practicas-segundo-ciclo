/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tpp
 */
public class Matricula {

    private int idMatricula;
    private Estudiante estudiante;
    private Curso curso;
    private String horas;
    private String creditos;
    private String estado;

    public Matricula() {
    }

    public Matricula(int idMatricula, Estudiante estudiante, Curso curso, String horas, String creditos, String estado) {
        this.idMatricula = idMatricula;
        this.estudiante = estudiante;
        this.curso = curso;
        this.horas = horas;
        this.creditos = creditos;
        this.estado = estado;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
