package wali.springbooot.petclinic.models;


/**
 * Created by Wali
 **/
public class Person {
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
