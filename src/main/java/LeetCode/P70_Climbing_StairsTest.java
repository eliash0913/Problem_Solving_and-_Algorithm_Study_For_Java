package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P70_Climbing_StairsTest {
    P70_Climbing_Stairs p70 = new P70_Climbing_Stairs();
    @Test
    void test1(){
        int input = 2;
        int output = 2;
        assertEquals(output, p70.climbStairs(input));
    }

    @Test
    void test2(){
        int input = 3;
        int output = 3;
        assertEquals(output, p70.climbStairs(input));
    }

    @Test
    void test3(){
        int input = 6;
        int output = 13;
        assertEquals(output, p70.climbStairs(input));
    }

    @Test
    void test4(){
        int input = 7;
        int output = 21;
        assertEquals(output, p70.climbStairs(input));
    }

    @Test
    void test5(){
        int input = 1;
        int output = 1;
        assertEquals(output, p70.climbStairs(input));
    }

    @Test
    void test6(){
        int input = 4;
        int output = 5;
        assertEquals(output, p70.climbStairs(input));
    }
}