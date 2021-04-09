package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P125_Valid_PalindromeTest {
    P125_Valid_Palindrome p125 = new P125_Valid_Palindrome();
    @Test
    void test1(){
        String input = "A man, a plan, a canal: Panama";
        assertTrue(p125.isPalindrome(input));
    }

    @Test
    void test2(){
        String input = "race a car";
        assertFalse(p125.isPalindrome(input));
    }

    @Test
    void test3(){
        String input = "0P";
        assertFalse(p125.isPalindrome(input));
    }

    @Test
    void test4(){
        String input = ",.";
        assertTrue(p125.isPalindrome(input));
    }

    @Test
    void test5(){
        String input = ".,";
        assertTrue(p125.isPalindrome(input));
    }
}