package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P100_Same_TreeTest {
    P100_Same_Tree p100 = new P100_Same_Tree();
    @Test
    void test1(){
        Integer[] input1 = {1,2,3};
        Integer[] input2 = {1,2,3};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        TreeNode head2 = TestHelper.GenerateBinaryTreeFromArray(input2);
        assertTrue(p100.isSameTree(head1,head2));
    }

    @Test
    void test2(){
        Integer[] input1 = {1,2};
        Integer[] input2 = {1,null,2};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        TreeNode head2 = TestHelper.GenerateBinaryTreeFromArray(input2);
        assertFalse(p100.isSameTree(head1,head2));
    }

    @Test
    void test3(){
        Integer[] input1 = {1,2,1};
        Integer[] input2 = {1,1,2};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        TreeNode head2 = TestHelper.GenerateBinaryTreeFromArray(input2);
        assertFalse(p100.isSameTree(head1,head2));
    }

    @Test
    void test4(){
        Integer[] input1 = {};
        Integer[] input2 = {0};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        TreeNode head2 = TestHelper.GenerateBinaryTreeFromArray(input2);
        assertFalse(p100.isSameTree(head1,head2));
    }

    @Test
    void test5(){
        Integer[] input1 = {1,2,3,null,null,4,5};
        Integer[] input2 = {1,2,3};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        TreeNode head2 = TestHelper.GenerateBinaryTreeFromArray(input2);
        assertFalse(p100.isSameTree(head1,head2));
    }
}
