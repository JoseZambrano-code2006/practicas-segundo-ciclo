package Review;

import java.util.ArrayList;
import java.util.List;

//EmployeeCrudImpl está implementando una interfaz llamada Interface
public class EmployeeCrudImpl implements Interface {

    // Declara una lista privada llamada "lista" que almacena objetos de tipo "Employee".
    // La lista se inicializa como una nueva instancia de ArrayList.
    private List<Employee> lista = new ArrayList<>();

    // Indica que el siguiente método sobrescribe (override) un método de una interfaz o clase padre.
    @Override

    // Implementa el método "Create" de la interfaz, que agrega un nuevo empleado a la lista.
    public void Create(Employee e) {

        // Añade el objeto "Employee" proporcionado como argumento a la lista.
        lista.add(e);

        // Imprime un mensaje en consola indicando que el empleado ha sido agregado, mostrando el nombre del empleado.
        System.out.println("Employee add: " + e.getName());
    }

    // Indica que el siguiente método sobrescribe (override) un método de una interfaz o clase padre.
    @Override

    // Implementa el método "View" de la interfaz, que muestra los detalles de todos los empleados en la lista.
    public void View() {

        // Itera sobre cada objeto "Employee" en la lista.
        for (Employee employee : lista) {

            // Llama al método "ViewDetail" de cada empleado para mostrar sus detalles.
            employee.ViewDetail();
        }
    }

    // Indica que el siguiente método sobrescribe (override) un método de una interfaz o clase padre.
    @Override

    // Implementa el método "Update" de la interfaz, que actualiza los detalles de un empleado existente en la lista.
    public void Update(Employee e) {

        // Itera sobre cada objeto "Employee" en la lista.
        for (Employee employee : lista) {

            // Verifica si el ID del empleado en la lista coincide con el ID del empleado proporcionado como argumento.
            if (employee.getId() == e.getId()) {
                
                
            employee.setSalary(e.getSalary()); 
            // Actualiza el salario del empleado en la lista con el valor proporcionado.
            
            
            employee.setBenefits(e.getBenefits()); 
            // Actualiza los beneficios del empleado en la lista con el valor proporcionado.
            
            System.out.println("\n Empleado Actualizado :" + employee.getName() 
                    + "\n Salario              :" + employee.getSalary() 
                    + "\n Beneficios           :" + employee.getBenefits() 
                    + "\n Email                :" + employee.getEmail() 
                    + "\n Area                 :" + employee.getArea()); 
            // Imprime en consola un mensaje indicando que el empleado ha sido actualizado, mostrando los detalles actualizados.
          
            
            return; 
            // Sale del método una vez que el empleado ha sido actualizado.
        }
    }
    System.out.println("NO ENCONTRADO"); 
    // Imprime un mensaje en consola si no se encuentra un empleado con el ID especificado en la lista.
}

@Override 
// Indica que el siguiente método sobrescribe (override) un método de una interfaz o clase padre.


public void Delete(int id) { 
    // Implementa el método "Delete" de la interfaz, que elimina un empleado de la lista basado en el ID.
    
    
    lista.removeIf(Employee -> Employee.getId() == id); 
    // Usa el método "removeIf" para eliminar el empleado cuya condición es que su ID coincida con el ID proporcionado.
}

@Override 
// Indica que el siguiente método sobrescribe (override) un método de una interfaz o clase padre.


public Employee SearchId(int id) { 
    // Implementa el método "SearchId" de la interfaz, que busca un empleado en la lista por ID.
    
    
    for (Employee employee : lista) { 
        // Itera sobre cada objeto "Employee" en la lista.
        
        if (employee.getId() == id) { 
            // Verifica si el ID del empleado en la lista coincide con el ID proporcionado.
            
            return employee; 
            // Devuelve el empleado que coincide con el ID proporcionado.
        }
    }
    return null; 
    // Si no se encuentra un empleado con el ID especificado, retorna null.

    }
}
