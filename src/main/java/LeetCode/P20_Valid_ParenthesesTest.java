package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P20_Valid_ParenthesesTest {
    P20_Valid_Parentheses p20 = new P20_Valid_Parentheses();

    @Test
    void sample1(){
        assertTrue(p20.isValid("()"));
    }

    @Test
    void sample2(){
        assertTrue(p20.isValid("()[]{}"));
    }

    @Test
    void sample3(){
        assertFalse(p20.isValid("(]"));
    }

    @Test
    void sample4(){
        assertFalse( p20.isValid("([)]"));
    }

    @Test
    void sample5(){
        assertTrue( p20.isValid("{[]}"));
    }

    @Test
    void sample6(){
        assertFalse( p20.isValid("{["));
    }

    @Test
    void sample7(){
        assertFalse( p20.isValid("){"));
    }
}