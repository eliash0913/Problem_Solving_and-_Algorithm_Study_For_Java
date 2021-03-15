package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1629_Slowest_KeyTest {
    P1629_Slowest_Key p1629 = new P1629_Slowest_Key();

    @Test
    void test1(){
        assertEquals('c', p1629.slowestKey(new int[]{9,29,49,50}, "cbcd"));
    }

    @Test
    void test2(){
        assertEquals('a', p1629.slowestKey(new int[]{12,23,36,46,62}, "spuda"));
    }

    @Test
    void test3(){
        assertEquals('h', p1629.slowestKey(new int[]{9,12,14,18,31,44}, "diwoha"));
    }
}