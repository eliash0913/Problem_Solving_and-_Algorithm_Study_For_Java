package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1_Two_SumTest {
    P1_Two_Sum p1 = new P1_Two_Sum();
    @Test
    void Test1() {
        int[] sample = { 2, 7, 11, 15};
        assertArrayEquals(new int[] {0,1}, p1.twoSum(sample, 9));
    }
}