
package CRUD;

/**
 *
 * @author tpp
 */
public class Person {
   private String name;
   private String surname;
   private String code;

    public Person() {
    }

    public Person(String name, String surname, String code) {
        this.name = name;
        this.surname = surname;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
   
   
   
   
}
