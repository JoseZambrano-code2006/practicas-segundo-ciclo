
package Review;

public class Worker {
    
private int id; 
// Declara un atributo privado "id" de tipo entero para almacenar el identificador del trabajador.

private String name; 
// Declara un atributo privado "name" de tipo String para almacenar el nombre del trabajador.

private String email; 
// Declara un atributo privado "email" de tipo String para almacenar el correo electrónico del trabajador.

private String area; 
// Declara un atributo privado "area" de tipo String para almacenar el área o departamento del trabajador.

public Worker() { 
    // Constructor vacío que permite crear un objeto "Worker" sin inicializar los valores de los atributos.
}

public Worker(int id, String name, String email, String area) { 
    // Constructor sobrecargado que permite crear un objeto "Worker" e inicializar todos los atributos con los valores proporcionados.
 
    
    this.id = id; 
    // Asigna el valor del parámetro "id" al atributo privado "id".
   
    
    this.name = name; 
    // Asigna el valor del parámetro "name" al atributo privado "name".
    
    
    this.email = email; 
    // Asigna el valor del parámetro "email" al atributo privado "email".
    
    
    this.area = area; 
    // Asigna el valor del parámetro "area" al atributo privado "area".
}

public int getId() { 
    // Método getter que devuelve el valor del atributo "id".
    
    return id; 
}

public void setId(int id) { 
    // Método setter que permite asignar un valor al atributo "id".
    
    this.id = id; 
}

public String getName() { 
    // Método getter que devuelve el valor del atributo "name".
    
    return name; 
}

public void setName(String name) { 
    // Método setter que permite asignar un valor al atributo "name".
    
    this.name = name; 
}

public String getEmail() { 
    // Método getter que devuelve el valor del atributo "email".
    
    return email; 
}

public void setEmail(String email) { 
    // Método setter que permite asignar un valor al atributo "email".
    
    this.email = email; 
}

public String getArea() { 
    // Método getter que devuelve el valor del atributo "area".
    
    return area; 
}

public void setArea(String area) { 
    // Método setter que permite asignar un valor al atributo "area".
    
    this.area = area; 
}

public void ViewDetail() { 
    // Método que imprime en consola los detalles del trabajador.
    
    System.out.println("\n Name : " + name + 
                       "\n Email: " + email + 
                       "\n Area : " + area); 
    // Muestra en consola el nombre, el correo electrónico y el área del trabajador.
    
}
}
