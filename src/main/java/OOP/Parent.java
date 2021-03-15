package OOP;

import java.util.Calendar;

public class Parent extends Person {
    String title = "father";

    public Parent(String firstName, String lastName, Calendar dob) {
        super(firstName, lastName, dob);
    }


    public Parent() {
        super();
    }
}
