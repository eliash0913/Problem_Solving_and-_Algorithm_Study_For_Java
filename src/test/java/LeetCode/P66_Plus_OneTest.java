package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P66_Plus_OneTest {
    P66_Plus_One p66 = new P66_Plus_One();
    @Test
    void test1(){
        int[] input = {1,2,3};
        int[] output = {1,2,4};
        assertArrayEquals(output, p66.plusOne(input));
    }

    @Test
    void test2(){
        int[] input = {4,3,2,1};
        int[] output = {4,3,2,2};
        assertArrayEquals(output, p66.plusOne(input));
    }

    @Test
    void test3(){
        int[] input = {0};
        int[] output = {1};
        assertArrayEquals(output, p66.plusOne(input));
    }

    @Test
    void test4(){
        int[] input = {9};
        int[] output = {1,0};
        assertArrayEquals(output, p66.plusOne(input));
    }

    @Test
    void test5(){
        int[] input = {1,9};
        int[] output = {2,0};
        assertArrayEquals(output, p66.plusOne(input));
    }
}