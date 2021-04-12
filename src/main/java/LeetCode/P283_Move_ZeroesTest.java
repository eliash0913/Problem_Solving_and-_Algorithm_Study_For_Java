package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P283_Move_ZeroesTest {
    P283_Move_Zeroes p283 = new P283_Move_Zeroes();
    @Test
    void test1(){
        int[] nums = {0,1,0,3,12};
        int[] output = {1,3,12,0,0};
        p283.moveZeroes(nums);
        assertArrayEquals(output, nums);
    }

    @Test
    void test2(){
        int[] nums = {0};
        int[] output = {0};
        p283.moveZeroes(nums);
        assertArrayEquals(output, nums);
    }
}