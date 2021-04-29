package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P136_Single_NumberTest {
    P136_Single_Number p136 = new P136_Single_Number();
    @Test
    void test1(){
        int[] input = {2,2,1};
        int expected = 1;
        assertEquals(expected, p136.singleNumber(input));
    }

    @Test
    void test2(){
        int[] input = {4,1,2,1,2};
        int expected = 4;
        assertEquals(expected, p136.singleNumber(input));
    }

    @Test
    void test3(){
        int[] input = {1};
        int expected = 1;
        assertEquals(expected, p136.singleNumber(input));
    }
}