
package Review;


public class EmployeeMain {

 
    public static void main(String[] args) {
       // Método principal "main" que es el punto de entrada para la ejecución del programa.
       

        Interface em = new EmployeeCrudImpl(); 
        // Crea una instancia de "EmployeeCrudImpl" y la asigna a una variable de tipo "Interface".
        // Esto permite usar los métodos definidos en la interfaz "Interface" para manipular la lista de empleados.

        Employee e1 = new Employee(6000, "Viaje", 1, "Jesus", "jesus@upeu.edu.pe", "Gerencia"); 
        // Crea un nuevo objeto "Employee" con los valores especificados para salario, beneficios, id, nombre, email y área.

        Employee e2 = new Employee(3500, "Negocio Internacional", 2, "Andre", "andre@upeu.edu.pe", "Supervicion"); 
        // Crea otro nuevo objeto "Employee" con valores diferentes para representar a otro empleado.

        em.Create(e1); 
        // Llama al método "Create" en la instancia de "EmployeeCrudImpl" para agregar el empleado "e1" a la lista.

        em.Create(e2); 
        // Llama al método "Create" en la instancia de "EmployeeCrudImpl" para agregar el empleado "e2" a la lista.

        //ver empleados
        em.View(); 
        // Llama al método "View" en la instancia de "EmployeeCrudImpl" para mostrar los detalles de todos los empleados en la lista.

        Employee e3 = new Employee(2500, "Viaje al Extranjero", 1, "Carlos", "carlos@upeu.edu.com", "Administrativa"); 
        // Crea un nuevo objeto "Employee" con valores especificados, con el mismo id que "e1" para probar la actualización.

        em.Update(e3); 
        // Llama al método "Update" en la instancia de "EmployeeCrudImpl" para actualizar el empleado con id igual a 1 con los datos de "e3".
    }
    
}
