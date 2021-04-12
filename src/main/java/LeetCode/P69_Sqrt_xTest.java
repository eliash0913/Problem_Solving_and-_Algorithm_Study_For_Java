package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P69_Sqrt_xTest {
    P69_Sqrt_x p69 = new P69_Sqrt_x();
    @Test
    void test1(){
        int input = 4;
        int output = 2;
        assertEquals(output, p69.mySqrt(input));
    }

    @Test
    void test2(){
        int input = 8;
        int output = 2;
        assertEquals(output, p69.mySqrt(input));
    }

    @Test
    void test3(){
        int input = 13;
        int output = 3;
        assertEquals(output, p69.mySqrt(input));
    }

    @Test
    void test4(){
        int input = 100;
        int output = 10;
        assertEquals(output, p69.mySqrt(input));
    }

    @Test
    void test5(){
        int[] expected = new int[100000];
        int[] actual = new int[100000];
        for(int n = 1; n < 100000; n++){
            expected[n-1]=(int)Math.sqrt(n);
            actual[n-1]=p69.mySqrt(n);
        }
        assertArrayEquals(expected,actual);

    }


}