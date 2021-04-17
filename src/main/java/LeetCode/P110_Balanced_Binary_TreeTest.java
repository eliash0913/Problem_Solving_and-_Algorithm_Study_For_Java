package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P110_Balanced_Binary_TreeTest {
    P110_Balanced_Binary_Tree p110 = new P110_Balanced_Binary_Tree();
    @Test
    void test1(){
        Integer[] input = {3,9,20,null,null,15,7};
        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        assertTrue(p110.isBalanced(inputNode));
    }

    @Test
    void test2(){
        Integer[] input = {1,2,2,3,3,null,null,4,4};
        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        assertFalse(p110.isBalanced(inputNode));
    }

    @Test
    void test3(){
        Integer[] input = {1,null,3,2};
//        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        TreeNode inputNode = new TreeNode(1);
        inputNode.right = new TreeNode(3);
        inputNode.right.left = new TreeNode(2);
        assertFalse(p110.isBalanced(inputNode));
    }
}