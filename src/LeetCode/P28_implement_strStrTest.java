package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P28_implement_strStrTest {
    P28_implement_strStr p28 = new P28_implement_strStr();

    @Test
    void test1(){
        assertEquals(2,p28.strStr("hello","ll"));
    }

    @Test
    void test2(){
        assertEquals(-1,p28.strStr("aaaaa","bba"));
    }

    @Test
    void test3(){
        assertEquals(0,p28.strStr("0",""));
    }

    @Test
    void test4(){
        assertEquals(0,p28.strStr("a","a"));
    }

    @Test
    void test5(){
        assertEquals(2,p28.strStr("abc","c"));
    }

    @Test
    void test6(){
        assertEquals(2,p28.strStr("abca","ca"));
    }
}