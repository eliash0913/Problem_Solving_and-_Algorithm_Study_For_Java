package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P682_Baseball_GameTest {
    P682_Baseball_Game p682 = new P682_Baseball_Game();

    @Test
    void test1(){
        assertEquals(30, p682.calPoints(new String[]{"5","2","C","D","+"}));
    }

    @Test
    void test2(){
        assertEquals(27, p682.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    @Test
    void test3(){
        assertEquals(1, p682.calPoints(new String[]{"1"}));
    }
}