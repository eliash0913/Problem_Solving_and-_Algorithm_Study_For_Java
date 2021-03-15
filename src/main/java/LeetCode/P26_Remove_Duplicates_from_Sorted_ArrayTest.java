package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P26_Remove_Duplicates_from_Sorted_ArrayTest {
    P26_Remove_Duplicates_from_Sorted_Array p26 = new P26_Remove_Duplicates_from_Sorted_Array();

    @Test
    void sample1(){
        int[] input = {1,1,2};
        int output = 2;
        assertEquals(output,p26.removeDuplicates(input));
    }

    @Test
    void sample2(){
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int output = 5;
        assertEquals(output,p26.removeDuplicates(input));
    }

    @Test
    void sample3(){
        int[] input = {1,2,3,4,5,6,7};
        int output = 7;
        assertEquals(output,p26.removeDuplicates(input));
    }

    @Test
    void sample4(){
        int[] input = {1,1,1};
        int output = 1;
        assertEquals(output,p26.removeDuplicates(input));
    }

    @Test
    void sample5(){
        int[] input = {};
        int output = 0;
        assertEquals(output,p26.removeDuplicates(input));
    }

    @Test
    void sample6(){
        int[] input = {0};
        int output = 1;
        assertEquals(output,p26.removeDuplicates(input));
    }
}