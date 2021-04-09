package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P680_Valid_Palindrome_IITest {
    P680_Valid_Palindrome_II p680 = new P680_Valid_Palindrome_II();

    @Test
    void test1(){
        String input = "aba";
        assertTrue(p680.validPalindrome(input));
    }

    @Test
    void test2(){
        String input = "abca";
        assertTrue(p680.validPalindrome(input));
    }

    @Test
    void test3(){
        String input = "abcda";
        assertFalse(p680.validPalindrome(input));
    }

    @Test
    void test4(){
        String input = "bececcecb";
        assertTrue(p680.validPalindrome(input));
    }

    @Test
    void test5(){
        String input = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        assertTrue(p680.validPalindrome(input));
    }

    @Test
    void test6(){
        String input = "bcecceceb";
        assertTrue(p680.validPalindrome(input));
    }
}