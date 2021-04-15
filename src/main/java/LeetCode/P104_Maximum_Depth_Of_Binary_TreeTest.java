package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P104_Maximum_Depth_Of_Binary_TreeTest {
    P104_Maximum_Depth_Of_Binary_Tree p104 = new P104_Maximum_Depth_Of_Binary_Tree();
    @Test
    void test1(){
        Integer[] root = {3,9,20,null,null,15,7};
        int output = 3;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test2(){
        Integer[] root = {};
        int output = 0;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test3(){
        Integer[] root = {0};
        int output = 1;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test4(){
        Integer[] root = {1,2,3,4,5};
        int output = 3;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test5(){
        Integer[] root = {1,2,3,4,5,6};
        int output = 3;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test6(){
        Integer[] root = {1,2,3,4,null,null,5};
        int output = 3;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

    @Test
    void test7(){
        Integer[] root = {1,2};
        int output = 2;
        TreeNode input = TestHelper.GenerateBinaryTreeFromArray(root);
        assertEquals(output, p104.maxDepth(input));
    }

}