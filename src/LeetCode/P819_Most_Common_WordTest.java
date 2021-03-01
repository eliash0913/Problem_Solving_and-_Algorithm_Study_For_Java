package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P819_Most_Common_WordTest {
    P819_Most_Common_Word p819 = new P819_Most_Common_Word();
    @Test
    void test1(){
        assertEquals("ball", p819.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
    }

    @Test
    void test2(){
        assertEquals("bob", p819.mostCommonWord("Bob hit a bob, the hit bob flew far after it was hit.",new String[]{"hit"}));
    }

    @Test
    void test3(){
        assertEquals("bob", p819.mostCommonWord("Bob",new String[]{""}));
    }
}