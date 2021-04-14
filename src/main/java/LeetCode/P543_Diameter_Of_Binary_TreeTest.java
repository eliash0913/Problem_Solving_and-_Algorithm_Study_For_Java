package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P543_Diameter_Of_Binary_TreeTest {
    P543_Diameter_Of_Binary_Tree p543 = new P543_Diameter_Of_Binary_Tree();
    @Test
    void test1(){
        TreeNode head= new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        int expected = 2;
        int actual = p543.diameterOfBinaryTree(head);
        assertEquals(expected,actual);
    }

    @Test
    void test2(){
        Integer[] nodeValues = {1,2,3,4,5};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(nodeValues);
        int expected = 3;
        int actual = p543.diameterOfBinaryTree(head);
        assertEquals(expected,actual);
    }

    @Test
    void test3(){
        Integer[] nodeValues = {1,2};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(nodeValues);
        int expected = 1;
        int actual = p543.diameterOfBinaryTree(head);
        assertEquals(expected,actual);
    }

    @Test
    void test4(){
        Integer[] nodeValues = {3,1,null,null,2};
        TreeNode head = TestHelper.GenerateBinaryTreeFromArray(nodeValues);
        int expected = 2;
        int actual = p543.diameterOfBinaryTree(head);
        assertEquals(expected,actual);
    }

}