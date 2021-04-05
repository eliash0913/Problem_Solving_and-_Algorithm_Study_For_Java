package CodeSignal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseInParenthesesTest {
    ReverseInParentheses rip = new ReverseInParentheses();
    @Test
    void test1(){
        String input = "ABC";
        String expectedOutput = "ABC";
        assertEquals(expectedOutput,rip.reverseInParentheses(input));
    }


    @Test
    void test2(){
        String input = "(ABC)";
        String expectedOutput = "CBA";
        assertEquals(expectedOutput,rip.reverseInParentheses(input));
    }


    @Test
    void test3(){
        String input = "A(BC)";
        String expectedOutput = "ACB";
        assertEquals(expectedOutput,rip.reverseInParentheses(input));
    }


    @Test
    void test4(){
        String input = "(A(BC))";
        String expectedOutput = "BCA";
        assertEquals(expectedOutput,rip.reverseInParentheses(input));
    }


    @Test
    void test5(){
        String input = "(AB(CD(EF)))";
        String expectedOutput = "CDFEBA";
        assertEquals(expectedOutput,rip.reverseInParentheses(input));
    }
}