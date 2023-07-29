package wali.springboot.petclinic.models;


/**
 * Created by Wali
 **/
public class Person extends  BaseEntity {
    private  String firstName;
    private  String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
