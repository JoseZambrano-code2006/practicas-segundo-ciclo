
package CRUD;


public class CrudMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentCrudImpl st = new StudentCrudImpl();

        // Create a new students
        Student st1 = new Student(1, 15, "Juan", "Perez", "76767676");
        Student st2 = new Student(2, 17, "Marcos", "Ruiz", "7575757");

        st.create(st1);
        st.create(st2);

        //view students
        System.out.println("Ver estudiantes con Id 1:" + st.view(1).getName());
        System.out.println("Ver estudiantes con Id 2:" + st.view(2).getName());

        //update nota del estudiante 1
        Student st_act = new Student(1, 18, "Juan", "Perez", "76767676");
        st.update(st_act);

        System.out.println("Nota actualizada de Juan:" + st.view(1).getName() + " --> Nota :" + st.view(1).getNota());

        // delete student
        st.delete(2);
        System.out.println("Intentar leer al estudiante ID: 2" + st.view(2));

    }

}
