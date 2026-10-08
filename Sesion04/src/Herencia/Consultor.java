
package Herencia;


public class Consultor extends Persona{
    
    int code_consultor;
    String nombre_consultora;

    public Consultor() {
    }

    public Consultor(int code_consultor, String nombre_consultora, int id, String dni, String nombre, String apellido, String direccion, String telefono) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.code_consultor = code_consultor;
        this.nombre_consultora = nombre_consultora;
    }

    public int getCode_consultor() {
        return code_consultor;
    }

    public void setCode_consultor(int code_consultor) {
        this.code_consultor = code_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }
    
}
