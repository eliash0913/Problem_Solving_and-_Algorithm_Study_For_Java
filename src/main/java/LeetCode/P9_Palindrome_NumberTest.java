package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P9_Palindrome_NumberTest {
    P9_Palindrome_Number p9 = new P9_Palindrome_Number();
    @Test
    void test1(){
        int sample = 121;
        assertEquals(true, p9.isPalindrome(sample));
    }

    @Test
    void test2(){
        int sample = -121;
        assertEquals(false, p9.isPalindrome(sample));
    }

    @Test
    void test3(){
        int sample = 10;
        assertEquals(false, p9.isPalindrome(sample));
    }

    @Test
    void test4(){
        int sample = -101;
        assertEquals(false, p9.isPalindrome(sample));
    }
}