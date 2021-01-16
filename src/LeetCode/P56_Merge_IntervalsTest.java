package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P56_Merge_IntervalsTest {
    P56_Merge_Intervals p56 = new P56_Merge_Intervals();
    @Test
    void test1(){
        int[][] sample = {{1,3}, {2,6},{8,10}, {15,18}};
        int[][] output = {{1,6},{8,10},{15,18}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test2(){
        int[][] sample = {{1,4}, {4,5}};
        int[][] output = {{1,5}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test3(){
        int[][] sample = {{1,4}, {5,6}};
        int[][] output = {{1,4}, {5,6}};
        assertArrayEquals(output, p56.merge(sample));
    }
}