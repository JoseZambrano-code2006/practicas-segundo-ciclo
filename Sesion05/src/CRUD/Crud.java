
package CRUD;


public interface Crud<Estudiante> {

    public void create(Estudiante e);

    public Estudiante view(int id);

    public void update(Estudiante e);

    public void delete(int id);

}
