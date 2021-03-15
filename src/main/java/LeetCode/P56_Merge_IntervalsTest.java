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

    @Test
    void test4(){
        int[][] sample = {{1,4}, {0,4}};
        int[][] output = {{0,4}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test5(){
        int[][] sample = {{1,5}, {2,4}};
        int[][] output = {{1,5}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test6(){
        int[][] sample = {{2,4}, {1,5}};
        int[][] output = {{1,5}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test7(){
        int[][] sample = {{1,4}, {0,0}};
        int[][] output = {{1,4}, {0,0}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test8(){
        int[][] sample = {{2,3},{5,5},{2,2},{3,4},{3,4}};
        int[][] output = {{2,4}, {5,5}};
        assertArrayEquals(output, p56.merge(sample));
    }

    @Test
    void test9(){
        int[][] sample = {{2,3}, {4,5}, {6, 7}, {8, 9}, {1, 10}};
        int[][] output = {{1,10}};
        assertArrayEquals(output, p56.merge(sample));
    }
}