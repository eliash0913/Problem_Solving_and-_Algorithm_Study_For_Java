package OOP;

import java.util.Calendar;

public class Person {
    String lastName;
    String firstName;
    Calendar dob;
    public Person(String firstName, String lastName, Calendar dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDOB(){
        StringBuilder birthday = new StringBuilder();
        birthday.append(dob.get(Calendar.MONTH)).append("/").append(dob.get(Calendar.DATE)).append("/").append(dob.get(Calendar.YEAR));
        return birthday.toString();
    }
}
