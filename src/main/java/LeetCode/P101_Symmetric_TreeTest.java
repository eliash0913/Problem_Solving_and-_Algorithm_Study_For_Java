package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P101_Symmetric_TreeTest {
    P101_Symmetric_Tree p101 = new P101_Symmetric_Tree();
    @Test
    void test1(){
        Integer[] input1 = {1,2,2,3,4,4,3};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        assertTrue(p101.isSymmetric(head1));
    }

    @Test
    void test2(){
        Integer[] input1 = {1,2,2,null,3,null,3};
        TreeNode head1 = TestHelper.GenerateBinaryTreeFromArray(input1);
        assertFalse(p101.isSymmetric(head1));
    }

}