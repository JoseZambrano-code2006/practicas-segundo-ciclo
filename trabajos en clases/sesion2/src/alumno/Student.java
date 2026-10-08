package alumno;

public class Student {

    //Atribute
    int id;
    String code;
    String name;
    String LastName;

    //metthod
    void viewStudient() {
        System.out.println("I'm jose zambrano");
    }

    void KnowApproVal(double calification) {

        if (calification <= 12.5) {
            System.out.println("succesFully");
        } else {
            System.out.println("go back");

        }
    }
}
