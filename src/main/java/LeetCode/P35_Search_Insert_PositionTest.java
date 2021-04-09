package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P35_Search_Insert_PositionTest {
    P35_Search_Insert_Position p35 = new P35_Search_Insert_Position();
    @Test
    void test1(){
        int[] input = {1,3,5,6};
        int target = 5;
        int output = 2;
        assertEquals(output,p35.searchInsert(input,target));
    }

    @Test
    void test2(){
        int[] input = {1,3,5,6};
        int target = 2;
        int output = 1;
        assertEquals(output,p35.searchInsert(input,target));
    }

    @Test
    void test3(){
        int[] input = {1,3,5,6};
        int target = 7;
        int output = 4;
        assertEquals(output,p35.searchInsert(input,target));
    }

    @Test
    void test4(){
        int[] input = {1,3,5,6};
        int target = 0;
        int output = 0;
        assertEquals(output,p35.searchInsert(input,target));
    }

    @Test
    void test5(){
        int[] input = {1};
        int target = 0;
        int output = 0;
        assertEquals(output,p35.searchInsert(input,target));
    }
}