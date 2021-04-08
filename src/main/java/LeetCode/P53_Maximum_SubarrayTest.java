package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P53_Maximum_SubarrayTest {
    P53_Maximum_Subarray p53 = new P53_Maximum_Subarray();
    @Test
    void Test1(){
        int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int output = 6;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test2(){
        int[] input = new int[]{1};
        int output = 1;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test3(){
        int[] input = new int[]{5,4,-1,7,8};
        int output = 23;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test4(){
        int[] input = new int[]{-1,-2,-3,-4,-5,-6,0};
        int output = 0;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test5(){
        int[] input = new int[]{-2,-3,-4,-1,-5,-6};
        int output = -1;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test6(){
        int[] input = new int[]{1,2};
        int output = 3;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test7(){
        int[] input = new int[]{-1};
        int output = -1;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test8(){
        int[] input = new int[]{8,-19,5,-4,20};
        int output = 21;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test9(){
        int[] input = new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4};
        int output = 6;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test10(){
        int[] input = new int[]{0,3,-1};
        int output = 3;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test11(){
        int[] input = new int[]{1,1,-1};
        int output = 2;
        assertEquals(output,p53.maxSubArray(input));
    }

    @Test
    void Test12(){
        int[] input = new int[]{2,0,-3,2,1,0,1,-2};
        int output = 4;
        assertEquals(output,p53.maxSubArray(input));
    }

}