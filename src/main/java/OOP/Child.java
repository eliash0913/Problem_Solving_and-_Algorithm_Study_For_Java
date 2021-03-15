package OOP;


import org.openjdk.jol.vm.VM;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Child extends Parent{
    Parent parent;
    String title = "Child";

    public Child(){
    }

    public Child(String firstName, String lastName, Calendar dob, Parent parent) {
        super(firstName, lastName, dob);
        this.parent = parent;
        this.title = "grandchild";
    }

    public Child(String firstName, Calendar dob, Parent parent){
        this();
        this.firstName = firstName;
        super.dob = dob;
        this.parent = parent;
    }

    public void print(){
        System.out.println(super.title);
        System.out.println(this.title);
        System.out.println(VM.current().addressOf(super.title));
        System.out.println(VM.current().addressOf(this.title));
    }

    public static void main(String[] args){
        Parent p = new Parent("Elias","H",new GregorianCalendar(1985,3,20));
        Child c = new Child("El", p.lastName, new GregorianCalendar(2000,1,2),p);
        c.print();
    }
}
