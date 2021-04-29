package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P122_Best_Time_to_Buy_and_Sell_Stock_IITest {
    P122_Best_Time_to_Buy_and_Sell_Stock_II p122 = new P122_Best_Time_to_Buy_and_Sell_Stock_II();
    @Test
    void test1(){
        int[] input = {7,1,5,3,6,4};
        int expected = 7;
        assertEquals(expected, p122.maxProfit(input));
    }

    @Test
    void test2(){
        int[] input = {1,2,3,4,5};
        int expected = 4;
        assertEquals(expected, p122.maxProfit(input));
    }

    @Test
    void test3(){
        int[] input = {7,6,4,3,1};
        int expected = 0;
        assertEquals(expected, p122.maxProfit(input));
    }


    @Test
    void test4(){
        int[] input = {2,1,4,5,2,9,7};
        int expected = 11;
        assertEquals(expected, p122.maxProfit(input));
    }
}