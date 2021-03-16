package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P121_Best_Time_To_Buy_And_Sell_StockTest {
    P121_Best_Time_To_Buy_And_Sell_Stock p121 = new P121_Best_Time_To_Buy_And_Sell_Stock();

    @Test
    void test1(){
        int[] prices = {7,1,5,3,6,4};
        int output = 5;
        assertEquals(output, p121.maxProfit(prices));
    }

    @Test
    void test2(){
        int[] prices = {7,6,4,3,1};
        int output = 0;
        assertEquals(output, p121.maxProfit(prices));
    }

    @Test
    void test3(){
        int[] prices = {2,4,1};
        int output = 2;
        assertEquals(output, p121.maxProfit(prices));
    }

    @Test
    void test5(){
        int[] prices = {3,3,5,0,0,3,1,4};
        int output = 4;
        assertEquals(output, p121.maxProfit(prices));
    }
}