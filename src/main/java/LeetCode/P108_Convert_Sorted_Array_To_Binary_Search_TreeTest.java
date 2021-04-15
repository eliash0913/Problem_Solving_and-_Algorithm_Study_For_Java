package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P108_Convert_Sorted_Array_To_Binary_Search_TreeTest {
    P108_Convert_Sorted_Array_To_Binary_Search_Tree p108 = new P108_Convert_Sorted_Array_To_Binary_Search_Tree();
    @Test
    void test1(){
        int[] input = {-10,-3,0,5,9};
        Integer[] expected = {0,-3,5,-10,9};
        TreeNode actualNode = p108.sortedArrayToBST(input);
        Integer[] actual = TestHelper.GenerateArrayFromBinaryTree(p108.sortedArrayToBST(input));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test2(){
        int[] input = {0,1,2,3,4,5};
        Integer[] expected = {3,1,4,0,2,5};
        TreeNode actualNode = p108.sortedArrayToBST(input);
        Integer[] actual = TestHelper.GenerateArrayFromBinaryTree(p108.sortedArrayToBST(input));
        assertArrayEquals(expected,actual);
    }

    @Test
    void test3(){
        int[] input = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        Integer[] expected = {7, 3, 11, 1, 5, 9, 13, 0, 2, 4, 6, 8, 10, 12, 14};
        TreeNode actualNode = p108.sortedArrayToBST(input);
        Integer[] actual = TestHelper.GenerateArrayFromBinaryTree(p108.sortedArrayToBST(input));
        assertArrayEquals(expected,actual);
    }
}