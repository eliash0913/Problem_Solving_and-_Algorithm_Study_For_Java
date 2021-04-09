package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P88_Merge_Sorted_ArrayTest {
    P88_Merge_Sorted_Array p88 = new P88_Merge_Sorted_Array();
    @Test
    void test1(){
        int[] input1 = {1,2,3,0,0,0};
        int i1 = 3;
        int[] input2 = {2,5,6};
        int i2 = 3;
        int[] output = {1,2,2,3,5,6};
        p88.merge(input1,i1,input2,i2);
        assertArrayEquals(output,input1);
    }
}