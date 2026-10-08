package Review;

// Declara la clase "Employee", que hereda de la clase "Worker". 
// Esto significa que "Employee" tiene todos los atributos y métodos de "Worker".
public class Employee extends Worker {

    // Declaración de un atributo privado "salary" (salario) de tipo double para almacenar el salario del empleado.
    private double salary;

    // Declaración de un atributo privado "benefits" (beneficios) de tipo String para almacenar los beneficios del empleado.
    private String benefits;

    public Employee() {
    }

    // Constructor sobrecargado que permite crear un objeto "Employee" y asignar valores a los atributos.
    public Employee(double salary, String benefits, int id, String name, String email, String area) {

        // Llama al constructor de la clase padre "Worker" para inicializar los atributos heredados (id, name, email, area).
        super(id, name, email, area);

        // Asigna el valor del salario recibido como argumento al atributo "salary".
        this.salary = salary;

        // Asigna el valor de los beneficios recibidos como argumento al atributo "benefits".
        this.benefits = benefits;
    }

    // Método getter que devuelve el valor del atributo "salary".
    public double getSalary() {
        return salary;
    }

    // Método setter que permite asignar un valor al atributo "salary".
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Método getter que devuelve el valor del atributo "benefits".
    public String getBenefits() {
        return benefits;
    }

    // Método setter que permite asignar un valor al atributo "benefits".
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    // Indica que el siguiente método sobrescribe (override) un método de la clase padre.
    @Override

// Método sobrescrito que muestra los detalles de un empleado, incluidos los de la clase padre y los atributos adicionales.
    public void ViewDetail() {
        
        // Llama al método "ViewDetail" de la clase padre "Worker" para mostrar los detalles comunes (id, name, email, area).
        super.ViewDetail();
        
        // Muestra en consola el salario y los beneficios del empleado.
        System.out.println("\n salary   : " + salary
                + "\n benefits : " + benefits);
    }

}
