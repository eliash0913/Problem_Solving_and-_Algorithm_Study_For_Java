package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P415_Add_StringsTest {
    P415_Add_Strings p415 = new P415_Add_Strings();

    @Test
    void test1(){
        String input1 = "123";
        String input2 = "456";
        String output = "579";
        assertEquals(output, p415.addStrings(input1,input2));
    }

    @Test
    void test2(){
        String input1 = "534541213535346235213423";
        String input2 = "9";
        String output = "534541213535346235213432";
        assertEquals(output, p415.addStrings(input1,input2));
    }

    @Test
    void test3(){
        String input1 = "1";
        String input2 = "9";
        String output = "10";
        assertEquals(output, p415.addStrings(input1,input2));
    }

    @Test
    void test4(){
        String input1 = "9";
        String input2 = "99";
        String output = "108";
        assertEquals(output, p415.addStrings(input1,input2));
    }

    @Test
    void test5(){
        String input1 = "31";
        String input2 = "121";
        String output = "152";
        assertEquals(output, p415.addStrings(input1,input2));
    }
}