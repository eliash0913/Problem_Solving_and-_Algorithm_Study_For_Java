package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P112_Path_SumTest {
    P112_Path_Sum p112 = new P112_Path_Sum();
    @Test
    void test1(){
        Integer[] input = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(input);
        int input2 = 22;
        assertTrue(p112.hasPathSum(head,input2));
    }

    @Test
    void test2(){
        Integer[] input = {1,2,3};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(input);
        int input2 = 5;
        assertFalse(p112.hasPathSum(head,input2));
    }

    @Test
    void test3(){
        Integer[] input = {1,2,3,4,5};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(input);
        int input2 = 3;
        assertFalse(p112.hasPathSum(head,input2));
    }

    @Test
    void test4(){
        Integer[] input = {1,2,3,4,5};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(input);
        int input2 = 7;
        assertTrue(p112.hasPathSum(head,input2));
    }
}