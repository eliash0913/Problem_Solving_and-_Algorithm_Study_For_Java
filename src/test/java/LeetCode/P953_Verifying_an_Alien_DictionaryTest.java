package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P953_Verifying_an_Alien_DictionaryTest {
    P953_Verifying_an_Alien_Dictionary p953 = new P953_Verifying_an_Alien_Dictionary();

    @Test
    void test1(){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(p953.isAlienSorted(words,order));
    }

    @Test
    void test2(){
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(p953.isAlienSorted(words,order));
    }

    @Test
    void test3(){
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(p953.isAlienSorted(words,order));
    }

    @Test
    void test4(){
        String[] words = {"kuvp","q"};
        String order = "ngxlkthsjuoqcpavbfdermiywz";
        assertTrue(p953.isAlienSorted(words,order));
    }

    @Test
    void test5(){
        String[] words = {"hello","hello"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(p953.isAlienSorted(words,order));
    }

    @Test
    void test6(){
        String[] words = {"iekm","tpnhnbe"};
        String order = "loxbzapnmstkhijfcuqdewyvrg";
        assertFalse(p953.isAlienSorted(words,order));
    }


    @Test
    void test7(){
        String[] words = {"app","apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(p953.isAlienSorted(words,order));
    }

}
