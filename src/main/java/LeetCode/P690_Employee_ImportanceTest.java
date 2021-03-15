package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P690_Employee_ImportanceTest {
    P690_Employee_Importance p690 = new P690_Employee_Importance();
    @Test
    void test1(){
        ArrayList<Employee> input = new ArrayList();
        Employee a = new Employee();
        a.id=1;
        a.importance=5;
        a.subordinates = new ArrayList<Integer>();

        Employee b = new Employee();
        b.id=2;
        b.importance=3;
        b.subordinates = new ArrayList<Integer>();
        Employee c = new Employee();
        c.id=2;
        c.importance=3;
        c.subordinates = new ArrayList<Integer>();
        a.subordinates.add(b.id);
        a.subordinates.add(c.id);
        input.add(a);
        input.add(b);
        input.add(c);


        int output = 11;
        assertEquals(p690.getImportance(input,1),output);
    }

}