package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P111_Minimum_Depth_of_Binary_TreeTest {
    P111_Minimum_Depth_of_Binary_Tree p111 = new P111_Minimum_Depth_of_Binary_Tree();

    @Test
    void test1(){
        Integer[] input = {3,9,20,null,null,15,7};
        int expected = 2;
        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        assertEquals(expected, p111.minDepth(inputNode));
    }

    @Test
    void test2(){
        Integer[] input = {2,null,3,null,4,null,5,null,6};
        int expected = 5;
//        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        TreeNode inputNode = new TreeNode(2);
        inputNode.right = new TreeNode(3);
        inputNode.right.right = new TreeNode(4);
        inputNode.right.right.right = new TreeNode(5);
        inputNode.right.right.right.right = new TreeNode(6);

        assertEquals(expected, p111.minDepth(inputNode));
    }

    @Test
    void test3(){
        Integer[] input = {1,2,3,4,5,6,7,8};
        int expected = 3;
//        TreeNode inputNode = TestHelper.GenerateBinaryTreeFromArray(input);
        TreeNode inputNode = new TreeNode(1);
        inputNode.left = new TreeNode(2);
        inputNode.right = new TreeNode(3);
        inputNode.left.left = new TreeNode(4);
        inputNode.left.right = new TreeNode(5);
        inputNode.right.left = new TreeNode(6);
        inputNode.right.right = new TreeNode(7);
        inputNode.left.left.left = new TreeNode(8);
        assertEquals(expected, p111.minDepth(inputNode));
    }
}