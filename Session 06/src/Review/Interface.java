
package Review;

public interface Interface {
    //Crear un nuevo empleado
    public void Create(Employee e);
    //Ver todos los empleados
    public void View();
    //Actualizar los empleados
    public void Update(Employee e);
    //Eliminar los empleados
    public void Delete(int id);
    //Buscar 
    public Employee SearchId(int id);
}
