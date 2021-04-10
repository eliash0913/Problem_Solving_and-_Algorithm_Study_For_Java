package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P58_Length_Of_Last_WordTest {
    P58_Length_Of_Last_Word p58 = new P58_Length_Of_Last_Word();
    @Test
    void test1(){
        String input = "Hello World";
        int output = 5;
        assertEquals(output, p58.lengthOfLastWord(input));
    }

    @Test
    void test2(){
        String input = " ";
        int output = 0;
        assertEquals(output, p58.lengthOfLastWord(input));
    }

    @Test
    void test3(){
        String input = "HEllo ";
        int output = 5;
        assertEquals(output, p58.lengthOfLastWord(input));
    }

    @Test
    void test4(){
        String input = "HEllo  ";
        int output = 5;
        assertEquals(output, p58.lengthOfLastWord(input));
    }

}